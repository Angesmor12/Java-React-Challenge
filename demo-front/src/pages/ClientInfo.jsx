import { useParams, useNavigate } from "react-router-dom";
import { FieldValidation, renderValue } from "../util/FieldsValidation";
import { useCallback, useRef } from "react";

import Header from "../components/Header"
import InputField from "../components/InputField.jsx"
import TextareaField from "../components/TextareaField.jsx";

import "../styles/clientInfo.css"

export default function ClientInfo({customFetch, useState, useEffect}){

    const attempts = useRef(1);
    const sessionID = localStorage.getItem("session");
    const { id } = useParams();
    const [sales, setSales] = useState({});
    const [type, setType] = useState("form");
    const [clientInfo, setClientInfo] = useState({});
    const [clientID, setClientID] = useState({});
    const [name, setName] = useState(null);
    const [notes, setNotes] = useState();
    const [totalMoney, setTotalMoney] = useState();
    const navigate = useNavigate();

    const getClientInfo = useCallback(async () => {
        const card = parseInt(id);
    
        if (![card, sessionID].every(Boolean)) {
          return window.alert("Error al obtener la información del usuario.");}
    
        const data = {
          card,
          sessionID,
        };
    
        const list = await customFetch("/clients/info", data, "POST");
        if (list.status === "error") {
          window.alert(list.message);
        } else {
          setClientInfo(list.data.customer.personalInfo);
          setName(list.data.customer.personalInfo.name);
          setClientID(list.data.customer.id);
        }
      }, [sessionID, id, customFetch]);
    
      useEffect(() => {
        if (!sessionID) {
            navigate("/");
        } else {
            getClientInfo();
        }
    }, [sessionID, getClientInfo, navigate]); 

    async function sendSale(e){

        e.preventDefault();

        if(attempts.current){
            attempts.current = 0;

            const validations = [
              [parseInt(clientID), "number", 0, 1, "Error con la id del usuario."],
              [sessionID, "string", 0, 5, "Error con la sesión del usuario."],
              [parseInt(totalMoney), "number", 0, 1, "El dinero debe tener al menos 1 dígito."],
              [notes, "string", 30, 5, "La nota debe tener entre 5 y 30 caracteres."]
          ];
      
          for (const [value, type, max, min, message] of validations) {
              if (!FieldValidation(value, type, max, min)) {
                  attempts.current = 1;
                  return window.alert(message);
              }}
      
            const data = {
                "sessionID": sessionID,
                "customerID": clientID,
                "totalMoney": totalMoney,
                "notes": notes
            };

            const saleResponse = await customFetch("/clients/sale", data, "POST");
            if(saleResponse.status === "error"){
                window.alert(saleResponse.message);
            }
            else {
                window.alert("La venta se ha realizado correctamente.");
                setType("sale");
                setSales(saleResponse.data);
            }
            attempts.current = 1;
        }   
    }

    return (
        <>
          <Header />
          <div className="info-client-container-main">
            <div className="info-client-container">
              <h1 className="main-title">
                {name !== undefined && name !== null ? "¡Bienvenido " + name + "!" : ""}
              </h1>
              <div className="info-client">
                {Object.keys(clientInfo).map((key) => {
                  const value = clientInfo[key];
                  if (typeof value === 'object' || value === null || value === undefined || value === "") {
                    return null;
                  }
                  return (
                    <p key={key}><strong>{key}:</strong> {value}</p>
                  );
                })}
              </div>
            </div>

            {sales && Object.keys(sales).length > 0 && type === "sale" ? (
                <div className="sale-info-client-container">
                <div className="sale-info-client">
                    <h2>Detalle de la venta:</h2>
                    <div className="sale-info-details">
                    {Object.keys(sales).map((key) => {
                    const value = sales[key];
                    return (
                      <div key={key}>
                        <strong>{key}:</strong> {renderValue(value)}
                      </div>
                    );
                    })}
                    </div>
                </div>
                </div>
            ) : null}
      
            {(clientInfo && Object.keys(clientInfo).length > 0 && type === "form") ? (
              <div className="form-info-client-container">
                <div>
                  <h2>Realizar venta</h2>
                  <form className="form-info-client">
                    <InputField value={totalMoney} setValue={setTotalMoney} placeholder="Dinero" name="total-money" type="number" />
                    <TextareaField value={notes} setValue={setNotes} placeholder="Escribe una nota" name="note" type="textarea" />
                    <button onClick={(e) => { sendSale(e) }} type="submit">Enviar</button>
                  </form>
                </div>
              </div>
            ): null}
      
          </div>
        </>
      );
}
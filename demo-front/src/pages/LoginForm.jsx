import { FieldValidation } from "../util/FieldsValidation";
import { useNavigate } from "react-router-dom";
import InputField from "../components/InputField.jsx"
import { useRef } from "react";

import "../styles/loginForm.css"

export default function LoginForm({customFetch, useState, useEffect}){

    const navigate = useNavigate();
    const attempts = useRef(1);
    const [username, setUsername] = useState("opPruebaDev");
    const [password, setPassword] = useState("opPa$$");
    const [serialNumber, setSerialNumber] = useState(8282);
    
    useEffect(() => {
        if (localStorage.getItem("session")) {
            navigate("/client/100");
        }
    }, [navigate]);

    async function handleSubmit(e){

        e.preventDefault();
        if(attempts.current){

        attempts.current = 0;

        if(!FieldValidation(username,"string",15,2)){
            attempts.current = 1;
            return window.alert("El nombre de usuario debe tener entre 2 y 15 caracteres.");
        }
        else if(!FieldValidation(password,"string",15,5)){
            attempts.current = 1;
            return window.alert("La contraseña debe tener entre 5 y 15 caracteres.");
        }
        else if (!FieldValidation(parseInt(serialNumber),"number",0,2)){
            attempts.current = 1;
            return window.alert("El número de serie debe tener al menos 2 dígitos.");
        }

        const data = {
            "username" : username,
            "password" : password,
            "serialNumber" : serialNumber
        }
        
        const result = await customFetch("/clients/login", data, "POST");

        if(result.status === "success"){
            if(result.data.sessionID !== undefined && result.data.sessionID !== null){
                window.alert("Sesión iniciada correctamente.");
                localStorage.setItem("session", result.data.sessionID);
                navigate("/client/100");
            }
        }
        else {
            window.alert(result.message);
        }
        attempts.current = 1;
    }}

    return (
        <div className="login-form-container">
            <h1 className="main-title">Iniciar sesión</h1>
            <form className="login-form" onSubmit={handleSubmit} >
                <InputField value={username} setValue={setUsername} placeholder="Usuario" name="username" type="text" />
                <InputField value={password} setValue={setPassword} placeholder="Contraseña" name="password" type="password" />
                <InputField value={serialNumber} setValue={setSerialNumber} placeholder="Número de serie" name="serialnumber" type="number" />
                <button className="login-form-input" type="submit">Iniciar sesión</button>
            </form>
        </div>
    )
}
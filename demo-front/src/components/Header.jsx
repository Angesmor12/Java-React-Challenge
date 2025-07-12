import { useNavigate } from "react-router-dom"

export default function Footer(){

    const navigate = useNavigate();

    function handleButton(){
        localStorage.removeItem("session");
        navigate("/");
    }

    return (
        <header>
            <button className="leave-button" onClick={() => handleButton()}>Cerrar sesión</button>
        </header>
    )
}
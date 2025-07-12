package com.demo.request;
import javax.validation.constraints.NotNull;

public class InfoRequest {

    @NotNull(message = "El campo 'sessionID' no pueda estar vacío.")
    private String sessionID;

    @NotNull(message = "El campo 'card' no puede estar vacío.")
    private String card;

    public void setCard(String card){
        this.card = card;
    }

    public void setSessionID(String sessionID){
        this.sessionID = sessionID;
    }

    public String getCard(){
        return card;
    }

    public String getSessionID(){
        return sessionID;
    }
}

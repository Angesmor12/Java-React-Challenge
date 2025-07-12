package com.demo.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SaleRequest {

    @NotNull(message = "El campo 'sessionID' no puede estar vacío.")
    private String sessionID;

    @NotNull(message = "El campo 'customerID' no puede estar vacío.")
    private Long customerID;

    @NotNull(message = "El campo 'totalMoney' no puede estar vacío.")
    private Double totalMoney;

    @NotNull(message = "El campo 'notes' no puede estar vacío.")
    @Size(min = 5, max = 30, message = "El campo 'notes' debe tener entre 5 y 30 caracteres.")
    private String notes;

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSessionID() {
        return sessionID;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public String getNotes() {
        return notes;
    }
}

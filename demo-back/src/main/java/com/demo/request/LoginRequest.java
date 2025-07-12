package com.demo.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginRequest {

    @NotNull(message = "El nombre de usuario no puede ser nulo.")
    @Size(min = 2, max = 15, message = "El nombre de usuario debe tener entre 2 y 15 caracteres.")
    private String username;

    @NotNull(message = "La contraseña no puede ser nula.")
    @Size(min = 5, max = 15, message = "La contraseña debe tener entre 5 y 15 caracteres.")
    private String password;

    @NotNull(message = "El número de serie no puede ser nulo.")
    @Min(value = 10, message = "El número de serie debe tener al menos 2 dígitos.")
    private Long serialNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }
}

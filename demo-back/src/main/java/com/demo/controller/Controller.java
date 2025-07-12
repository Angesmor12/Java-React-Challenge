package com.demo.controller;

import com.demo.interfaces.controller.IController;
import com.demo.request.InfoRequest;
import com.demo.request.LoginRequest;
import com.demo.request.SaleRequest;
import com.demo.response.ServiceResponse;
import com.demo.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class Controller implements IController{

    private final Services services;

    @Autowired
    public Controller(Services services) {
        this.services = services;
    }
    @PostMapping("/clients/login")
    @Override
    public ResponseEntity<ServiceResponse> loginClient(@Valid @RequestBody LoginRequest loginRequest) throws Exception {
        ServiceResponse response = services.loginClient(loginRequest);
        return ResponseEntity.status(HttpStatus.valueOf(response.getCode())).body(response);
    }

    @PostMapping("/clients/info")
    @Override
    public ResponseEntity<ServiceResponse> getClient(@Valid @RequestBody InfoRequest infoRequest) throws Exception {
        ServiceResponse response = services.getClient(infoRequest);
        return ResponseEntity.status(HttpStatus.valueOf(response.getCode())).body(response);
    }

    @PostMapping("/clients/sale")
    @Override
    public ResponseEntity<ServiceResponse> sendSale(@Valid @RequestBody SaleRequest saleRequest) throws Exception {
        ServiceResponse response = services.sendSale(saleRequest);
        return ResponseEntity.status(HttpStatus.valueOf(response.getCode())).body(response);
    }

    @RequestMapping("/**")
    @Override
    public ResponseEntity<ServiceResponse> handleAllRequests() {
        ServiceResponse response = new ServiceResponse();
        response.setStatus("error");
        response.setMessage("El recurso solicitado no está disponible.");
        response.setData(null);
        response.setCode(404);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}

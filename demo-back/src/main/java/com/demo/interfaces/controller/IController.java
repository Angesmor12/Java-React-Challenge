package com.demo.interfaces.controller;

import com.demo.request.InfoRequest;
import com.demo.request.LoginRequest;
import com.demo.request.SaleRequest;
import com.demo.response.ServiceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface IController {

    public ResponseEntity<ServiceResponse> handleAllRequests();

    public ResponseEntity<ServiceResponse> loginClient(@Valid @RequestBody LoginRequest loginRequest) throws Exception;

    public ResponseEntity<ServiceResponse> getClient(@Valid @RequestBody InfoRequest infoRequest) throws Exception;

    public ResponseEntity<ServiceResponse> sendSale(@Valid @RequestBody SaleRequest saleRequest) throws Exception;
}

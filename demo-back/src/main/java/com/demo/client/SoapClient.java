package com.demo.client;

import com.demo.request.InfoRequest;
import com.demo.request.LoginRequest;
import com.demo.request.SaleRequest;
import com.demo.wsdl.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import java.util.Optional;

public class SoapClient extends WebServiceGatewaySupport {

    @Value("${soap.service.url}")
    private String url;
    private static final String INTERFACE_URL = "interfaces";

    // Obtiene la sesión del cliente
    public Optional<SynchroAndLoginResponse> loginClient(LoginRequest loginRequest) {

        try {
            SynchroAndLoginRequest synchroAndLoginRequest = new SynchroAndLoginRequest();

            synchroAndLoginRequest.setPassword(loginRequest.getPassword());
            synchroAndLoginRequest.setUsername(loginRequest.getUsername());
            synchroAndLoginRequest.setSerialNumber(loginRequest.getSerialNumber());

            SoapActionCallback soapActionCallback = new SoapActionCallback(url + "SynchroAndLogin");

            return Optional.ofNullable((SynchroAndLoginResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(url + INTERFACE_URL, synchroAndLoginRequest, soapActionCallback));

        } catch (Exception e) {
            // Aquí se registraría el error en un log para su seguimiento y análisis posterior.
            return Optional.empty();
        }
    }

    // Obtiene la información del cliente
    public Optional<GetInfoResponse> getClient(InfoRequest infoRequest){

        try {
            GetInfoRequest getInfoRequest = new GetInfoRequest();

            getInfoRequest.setSessionID(infoRequest.getSessionID());
            getInfoRequest.setCard(infoRequest.getCard());

            SoapActionCallback soapActionCallback = new SoapActionCallback(url + "getInfo");

            return Optional.ofNullable((GetInfoResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(url + INTERFACE_URL, getInfoRequest, soapActionCallback));

        } catch (Exception e) {
            // Aquí se registraría el error en un log para su seguimiento y análisis posterior.
            return Optional.empty();
        }
    }

    // Realiza una venta
    public Optional<SaleByCardResponse>  sendSale(SaleRequest saleRequest){

        try{
            SaleByCardRequest saleByCardRequest = new SaleByCardRequest();
            saleByCardRequest.setSessionID(saleRequest.getSessionID());
            saleByCardRequest.setCustomerID(saleRequest.getCustomerID());
            saleByCardRequest.setTotalMoney(saleRequest.getTotalMoney());
            saleByCardRequest.setNotes(saleRequest.getNotes());

            SoapActionCallback soapActionCallback = new SoapActionCallback(url + "SaleByCard");

            return Optional.ofNullable((SaleByCardResponse) getWebServiceTemplate()
                    .marshalSendAndReceive(url + INTERFACE_URL, saleByCardRequest, soapActionCallback));

        }
        catch (Exception e){
            // Aquí se registraría el error en un log para su seguimiento y análisis posterior.
            return Optional.empty();
        }
    }

    }

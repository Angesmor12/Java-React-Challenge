package com.demo.services;

import com.demo.client.SoapClient;
import com.demo.request.InfoRequest;
import com.demo.request.LoginRequest;
import com.demo.request.SaleRequest;
import com.demo.response.ServiceResponse;
import com.demo.util.Util;
import com.demo.wsdl.GetInfoResponse;
import com.demo.wsdl.SaleByCardResponse;
import com.demo.wsdl.SynchroAndLoginResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class Services {

    private final SoapClient soap;
    private final Util util;

    private Services(SoapClient soap, Util util){
        this.soap = soap;
        this.util = util;
    }

    // Iniciar sesión
    public ServiceResponse loginClient(LoginRequest loginRequest) throws Exception {

        Optional<SynchroAndLoginResponse> soapResponse = soap.loginClient(loginRequest);

        if(soapResponse.isEmpty()){
            return util.buildResponse("Se ha producido un error al obtener la sesión del cliente.", "error", 500,null);
        }

        SynchroAndLoginResponse soapResponseData = soapResponse.get();

        // Validar código de respuesta
        ServiceResponse validation = util.verifyAnswerCode(soapResponseData.getAnswerCode(), "Usuario, contraseña o número de serie incorrecto.");
        if("error".equals(validation.getStatus())){
            return validation;
        }

        Map<String, Object> data = new HashMap<>();
        data.put("sessionID", soapResponseData.getSessionID());

        return util.buildResponse(null, "success", 200, data);
    }

    // Obtener información del cliente
    public ServiceResponse getClient(InfoRequest infoRequest) throws Exception {

        Optional<GetInfoResponse> soapResponse = soap.getClient(infoRequest);

        if(soapResponse.isEmpty()){
            return util.buildResponse("Se ha producido un error al obtener la información del cliente.", "error", 500,null);
        }

        GetInfoResponse soapResponseData = soapResponse.get();

        // Validar código de respuesta
        ServiceResponse validation = util.verifyAnswerCode(soapResponseData.getAnswerCode(), "No se ha encontrado información del cliente.");
        if("error".equals(validation.getStatus())){
            return validation;
        }

        return util.buildResponse(null, "success", 200,soapResponse);

    }

    // Realizar venta
    public ServiceResponse sendSale(SaleRequest saleRequest) throws Exception {

        Optional<SaleByCardResponse> soapResponse = soap.sendSale(saleRequest);

        if(soapResponse.isEmpty()){
            return util.buildResponse("Se ha producido un error al realizar la venta.", "error", 500,null);
        }

        SaleByCardResponse soapResponseData = soapResponse.get();

        // Validar código de respuesta
        ServiceResponse validation = util.verifyAnswerCode(soapResponseData.getAnswerCode(), "No se ha podido realizar la venta.");
        if("error".equals(validation.getStatus())){
            return validation;
        }

        return util.buildResponse("La venta se ha realizado con éxito.", "success", 200,soapResponse);
    }

}

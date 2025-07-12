//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para WS_ExternalTransferByCustomer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ExternalTransferByCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movementID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="externalTransferByCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedExternalTransfer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExternalTransferByCustomer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "movementID",
    "localTime",
    "exchangeCode",
    "externalTransferByCustomer"
})
public class WSExternalTransferByCustomer {

    protected long movementID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar localTime;
    protected long exchangeCode;
    @XmlElement(required = true)
    protected WSExchangedExternalTransfer externalTransferByCustomer;

    /**
     * Obtiene el valor de la propiedad movementID.
     * 
     */
    public long getMovementID() {
        return movementID;
    }

    /**
     * Define el valor de la propiedad movementID.
     * 
     */
    public void setMovementID(long value) {
        this.movementID = value;
    }

    /**
     * Obtiene el valor de la propiedad localTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTime() {
        return localTime;
    }

    /**
     * Define el valor de la propiedad localTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTime(XMLGregorianCalendar value) {
        this.localTime = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeCode.
     * 
     */
    public long getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Define el valor de la propiedad exchangeCode.
     * 
     */
    public void setExchangeCode(long value) {
        this.exchangeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTransferByCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedExternalTransfer }
     *     
     */
    public WSExchangedExternalTransfer getExternalTransferByCustomer() {
        return externalTransferByCustomer;
    }

    /**
     * Define el valor de la propiedad externalTransferByCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedExternalTransfer }
     *     
     */
    public void setExternalTransferByCustomer(WSExchangedExternalTransfer value) {
        this.externalTransferByCustomer = value;
    }

}

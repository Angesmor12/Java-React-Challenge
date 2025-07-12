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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/&gt;
 *         &lt;element name="exchangeCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/&gt;
 *         &lt;element name="shippingCost" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingCost"/&gt;
 *         &lt;element name="shippingShop" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingShop"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "movement",
    "exchangeCode",
    "shippingInformation",
    "shippingCost",
    "shippingShop"
})
@XmlRootElement(name = "GetExchangeInformationResponse")
public class GetExchangeInformationResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSMovement movement;
    protected long exchangeCode;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    @XmlElement(required = true)
    protected WSShippingCost shippingCost;
    @XmlElement(required = true)
    protected WSShippingShop shippingShop;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad movement.
     * 
     * @return
     *     possible object is
     *     {@link WSMovement }
     *     
     */
    public WSMovement getMovement() {
        return movement;
    }

    /**
     * Define el valor de la propiedad movement.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMovement }
     *     
     */
    public void setMovement(WSMovement value) {
        this.movement = value;
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
     * Obtiene el valor de la propiedad shippingInformation.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingInformation }
     *     
     */
    public WSShippingInformation getShippingInformation() {
        return shippingInformation;
    }

    /**
     * Define el valor de la propiedad shippingInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingInformation }
     *     
     */
    public void setShippingInformation(WSShippingInformation value) {
        this.shippingInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCost.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingCost }
     *     
     */
    public WSShippingCost getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingCost }
     *     
     */
    public void setShippingCost(WSShippingCost value) {
        this.shippingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingShop.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingShop }
     *     
     */
    public WSShippingShop getShippingShop() {
        return shippingShop;
    }

    /**
     * Define el valor de la propiedad shippingShop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingShop }
     *     
     */
    public void setShippingShop(WSShippingShop value) {
        this.shippingShop = value;
    }

}

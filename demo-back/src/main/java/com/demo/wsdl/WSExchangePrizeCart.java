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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ExchangePrizeCart complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ExchangePrizeCart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prizeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prizeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pointUse" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moneyUse" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangePrizeCart", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "prizeId",
    "prizeCode",
    "quantity",
    "catalogId",
    "pointUse",
    "moneyUse"
})
public class WSExchangePrizeCart {

    protected long prizeId;
    @XmlElement(required = true)
    protected String prizeCode;
    protected int quantity;
    protected long catalogId;
    protected double pointUse;
    protected double moneyUse;

    /**
     * Obtiene el valor de la propiedad prizeId.
     * 
     */
    public long getPrizeId() {
        return prizeId;
    }

    /**
     * Define el valor de la propiedad prizeId.
     * 
     */
    public void setPrizeId(long value) {
        this.prizeId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrizeCode() {
        return prizeCode;
    }

    /**
     * Define el valor de la propiedad prizeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrizeCode(String value) {
        this.prizeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
    }

    /**
     * Obtiene el valor de la propiedad pointUse.
     * 
     */
    public double getPointUse() {
        return pointUse;
    }

    /**
     * Define el valor de la propiedad pointUse.
     * 
     */
    public void setPointUse(double value) {
        this.pointUse = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUse.
     * 
     */
    public double getMoneyUse() {
        return moneyUse;
    }

    /**
     * Define el valor de la propiedad moneyUse.
     * 
     */
    public void setMoneyUse(double value) {
        this.moneyUse = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PrizeFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PrizeFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="mixedPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="onlyMoneyToPay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outstandingPrize" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="seasonal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="isOnlyForGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "enabled",
    "mixedPayment",
    "onlyMoneyToPay",
    "outstandingPrize",
    "seasonal",
    "isOnlyForGift"
})
public class WSPrizeFlags {

    protected long flags;
    protected boolean enabled;
    protected boolean mixedPayment;
    protected boolean onlyMoneyToPay;
    protected boolean outstandingPrize;
    protected boolean seasonal;
    protected boolean isOnlyForGift;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad mixedPayment.
     * 
     */
    public boolean isMixedPayment() {
        return mixedPayment;
    }

    /**
     * Define el valor de la propiedad mixedPayment.
     * 
     */
    public void setMixedPayment(boolean value) {
        this.mixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public boolean isOnlyMoneyToPay() {
        return onlyMoneyToPay;
    }

    /**
     * Define el valor de la propiedad onlyMoneyToPay.
     * 
     */
    public void setOnlyMoneyToPay(boolean value) {
        this.onlyMoneyToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingPrize.
     * 
     */
    public boolean isOutstandingPrize() {
        return outstandingPrize;
    }

    /**
     * Define el valor de la propiedad outstandingPrize.
     * 
     */
    public void setOutstandingPrize(boolean value) {
        this.outstandingPrize = value;
    }

    /**
     * Obtiene el valor de la propiedad seasonal.
     * 
     */
    public boolean isSeasonal() {
        return seasonal;
    }

    /**
     * Define el valor de la propiedad seasonal.
     * 
     */
    public void setSeasonal(boolean value) {
        this.seasonal = value;
    }

    /**
     * Obtiene el valor de la propiedad isOnlyForGift.
     * 
     */
    public boolean isIsOnlyForGift() {
        return isOnlyForGift;
    }

    /**
     * Define el valor de la propiedad isOnlyForGift.
     * 
     */
    public void setIsOnlyForGift(boolean value) {
        this.isOnlyForGift = value;
    }

}

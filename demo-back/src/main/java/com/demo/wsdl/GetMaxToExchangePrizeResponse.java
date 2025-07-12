//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="maxToExchangeByCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="exchangedAmountByCustomer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dayFrom" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dayTo" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dayToReset" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
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
    "maxToExchangeByCustomer",
    "exchangedAmountByCustomer",
    "dayFrom",
    "dayTo",
    "dayToReset"
})
@XmlRootElement(name = "GetMaxToExchangePrizeResponse")
public class GetMaxToExchangePrizeResponse {

    protected int answerCode;
    protected long maxToExchangeByCustomer;
    protected long exchangedAmountByCustomer;
    protected long dayFrom;
    protected long dayTo;
    protected long dayToReset;

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
     * Obtiene el valor de la propiedad maxToExchangeByCustomer.
     * 
     */
    public long getMaxToExchangeByCustomer() {
        return maxToExchangeByCustomer;
    }

    /**
     * Define el valor de la propiedad maxToExchangeByCustomer.
     * 
     */
    public void setMaxToExchangeByCustomer(long value) {
        this.maxToExchangeByCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangedAmountByCustomer.
     * 
     */
    public long getExchangedAmountByCustomer() {
        return exchangedAmountByCustomer;
    }

    /**
     * Define el valor de la propiedad exchangedAmountByCustomer.
     * 
     */
    public void setExchangedAmountByCustomer(long value) {
        this.exchangedAmountByCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad dayFrom.
     * 
     */
    public long getDayFrom() {
        return dayFrom;
    }

    /**
     * Define el valor de la propiedad dayFrom.
     * 
     */
    public void setDayFrom(long value) {
        this.dayFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dayTo.
     * 
     */
    public long getDayTo() {
        return dayTo;
    }

    /**
     * Define el valor de la propiedad dayTo.
     * 
     */
    public void setDayTo(long value) {
        this.dayTo = value;
    }

    /**
     * Obtiene el valor de la propiedad dayToReset.
     * 
     */
    public long getDayToReset() {
        return dayToReset;
    }

    /**
     * Define el valor de la propiedad dayToReset.
     * 
     */
    public void setDayToReset(long value) {
        this.dayToReset = value;
    }

}

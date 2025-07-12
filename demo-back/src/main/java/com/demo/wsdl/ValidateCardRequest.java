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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="expirationMonth" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="expirationYear" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cvc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "sessionID",
    "cardNumber",
    "expirationMonth",
    "expirationYear",
    "cvc",
    "cardName",
    "cardAddressLine1",
    "cardAddressLine2",
    "cardAddressCity",
    "cardAddressState",
    "cardAddressZip",
    "cardAddressCountry"
})
@XmlRootElement(name = "ValidateCardRequest")
public class ValidateCardRequest {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String cardNumber;
    protected long expirationMonth;
    protected long expirationYear;
    @XmlElement(required = true)
    protected String cvc;
    @XmlElement(required = true, nillable = true)
    protected String cardName;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressLine1;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressLine2;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressCity;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressState;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressZip;
    @XmlElement(required = true, nillable = true)
    protected String cardAddressCountry;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Define el valor de la propiedad cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationMonth.
     * 
     */
    public long getExpirationMonth() {
        return expirationMonth;
    }

    /**
     * Define el valor de la propiedad expirationMonth.
     * 
     */
    public void setExpirationMonth(long value) {
        this.expirationMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationYear.
     * 
     */
    public long getExpirationYear() {
        return expirationYear;
    }

    /**
     * Define el valor de la propiedad expirationYear.
     * 
     */
    public void setExpirationYear(long value) {
        this.expirationYear = value;
    }

    /**
     * Obtiene el valor de la propiedad cvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvc() {
        return cvc;
    }

    /**
     * Define el valor de la propiedad cvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvc(String value) {
        this.cvc = value;
    }

    /**
     * Obtiene el valor de la propiedad cardName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Define el valor de la propiedad cardName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressLine1() {
        return cardAddressLine1;
    }

    /**
     * Define el valor de la propiedad cardAddressLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressLine1(String value) {
        this.cardAddressLine1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressLine2() {
        return cardAddressLine2;
    }

    /**
     * Define el valor de la propiedad cardAddressLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressLine2(String value) {
        this.cardAddressLine2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressCity() {
        return cardAddressCity;
    }

    /**
     * Define el valor de la propiedad cardAddressCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressCity(String value) {
        this.cardAddressCity = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressState() {
        return cardAddressState;
    }

    /**
     * Define el valor de la propiedad cardAddressState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressState(String value) {
        this.cardAddressState = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressZip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressZip() {
        return cardAddressZip;
    }

    /**
     * Define el valor de la propiedad cardAddressZip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressZip(String value) {
        this.cardAddressZip = value;
    }

    /**
     * Obtiene el valor de la propiedad cardAddressCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardAddressCountry() {
        return cardAddressCountry;
    }

    /**
     * Define el valor de la propiedad cardAddressCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardAddressCountry(String value) {
        this.cardAddressCountry = value;
    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="otpCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ticketID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prizesList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangeablePrize" maxOccurs="unbounded"/&gt;
 *         &lt;element name="shopID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopForeignID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="useDataShopForShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "otpCode",
    "card",
    "ticketID",
    "prizesList",
    "shopID",
    "shopForeignID",
    "useDataShopForShipping",
    "useFeeFix"
})
@XmlRootElement(name = "ConfirmOtpMovementByCardRequest")
public class ConfirmOtpMovementByCardRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected int otpCode;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(required = true)
    protected String ticketID;
    @XmlElement(required = true)
    protected List<WSExchangeablePrize> prizesList;
    protected long shopID;
    protected long shopForeignID;
    protected boolean useDataShopForShipping;
    protected boolean useFeeFix;

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
     * Obtiene el valor de la propiedad otpCode.
     * 
     */
    public int getOtpCode() {
        return otpCode;
    }

    /**
     * Define el valor de la propiedad otpCode.
     * 
     */
    public void setOtpCode(int value) {
        this.otpCode = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketID() {
        return ticketID;
    }

    /**
     * Define el valor de la propiedad ticketID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketID(String value) {
        this.ticketID = value;
    }

    /**
     * Gets the value of the prizesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangeablePrize }
     * 
     * 
     */
    public List<WSExchangeablePrize> getPrizesList() {
        if (prizesList == null) {
            prizesList = new ArrayList<WSExchangeablePrize>();
        }
        return this.prizesList;
    }

    /**
     * Obtiene el valor de la propiedad shopID.
     * 
     */
    public long getShopID() {
        return shopID;
    }

    /**
     * Define el valor de la propiedad shopID.
     * 
     */
    public void setShopID(long value) {
        this.shopID = value;
    }

    /**
     * Obtiene el valor de la propiedad shopForeignID.
     * 
     */
    public long getShopForeignID() {
        return shopForeignID;
    }

    /**
     * Define el valor de la propiedad shopForeignID.
     * 
     */
    public void setShopForeignID(long value) {
        this.shopForeignID = value;
    }

    /**
     * Obtiene el valor de la propiedad useDataShopForShipping.
     * 
     */
    public boolean isUseDataShopForShipping() {
        return useDataShopForShipping;
    }

    /**
     * Define el valor de la propiedad useDataShopForShipping.
     * 
     */
    public void setUseDataShopForShipping(boolean value) {
        this.useDataShopForShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad useFeeFix.
     * 
     */
    public boolean isUseFeeFix() {
        return useFeeFix;
    }

    /**
     * Define el valor de la propiedad useFeeFix.
     * 
     */
    public void setUseFeeFix(boolean value) {
        this.useFeeFix = value;
    }

}

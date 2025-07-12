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
 * <p>Clase Java para WS_CustomerBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CustomerBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fidelyCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="parentCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mlmCustomerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mlmCustomerCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zoneId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="zoneForeingId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="personalInfo" type="{http://FidelyNET3_SW_01_89_00}WS_PersonalInfo"/&gt;
 *         &lt;element name="notSendWelcomeMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="invitor_code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerBase", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "campaignId",
    "card",
    "fidelyCode",
    "parentCustomerId",
    "mlmCustomerId",
    "mlmCustomerCard",
    "zoneId",
    "zoneForeingId",
    "personalInfo",
    "notSendWelcomeMail",
    "invitorCode"
})
public class WSCustomerBase {

    protected long campaignId;
    @XmlElement(required = true)
    protected String card;
    protected long fidelyCode;
    protected long parentCustomerId;
    protected long mlmCustomerId;
    @XmlElement(required = true)
    protected String mlmCustomerCard;
    protected long zoneId;
    protected long zoneForeingId;
    @XmlElement(required = true)
    protected WSPersonalInfo personalInfo;
    protected boolean notSendWelcomeMail;
    @XmlElement(name = "invitor_code", required = true)
    protected String invitorCode;

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
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
     * Obtiene el valor de la propiedad fidelyCode.
     * 
     */
    public long getFidelyCode() {
        return fidelyCode;
    }

    /**
     * Define el valor de la propiedad fidelyCode.
     * 
     */
    public void setFidelyCode(long value) {
        this.fidelyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad parentCustomerId.
     * 
     */
    public long getParentCustomerId() {
        return parentCustomerId;
    }

    /**
     * Define el valor de la propiedad parentCustomerId.
     * 
     */
    public void setParentCustomerId(long value) {
        this.parentCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmCustomerId.
     * 
     */
    public long getMlmCustomerId() {
        return mlmCustomerId;
    }

    /**
     * Define el valor de la propiedad mlmCustomerId.
     * 
     */
    public void setMlmCustomerId(long value) {
        this.mlmCustomerId = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmCustomerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlmCustomerCard() {
        return mlmCustomerCard;
    }

    /**
     * Define el valor de la propiedad mlmCustomerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlmCustomerCard(String value) {
        this.mlmCustomerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneId.
     * 
     */
    public long getZoneId() {
        return zoneId;
    }

    /**
     * Define el valor de la propiedad zoneId.
     * 
     */
    public void setZoneId(long value) {
        this.zoneId = value;
    }

    /**
     * Obtiene el valor de la propiedad zoneForeingId.
     * 
     */
    public long getZoneForeingId() {
        return zoneForeingId;
    }

    /**
     * Define el valor de la propiedad zoneForeingId.
     * 
     */
    public void setZoneForeingId(long value) {
        this.zoneForeingId = value;
    }

    /**
     * Obtiene el valor de la propiedad personalInfo.
     * 
     * @return
     *     possible object is
     *     {@link WSPersonalInfo }
     *     
     */
    public WSPersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    /**
     * Define el valor de la propiedad personalInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPersonalInfo }
     *     
     */
    public void setPersonalInfo(WSPersonalInfo value) {
        this.personalInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad notSendWelcomeMail.
     * 
     */
    public boolean isNotSendWelcomeMail() {
        return notSendWelcomeMail;
    }

    /**
     * Define el valor de la propiedad notSendWelcomeMail.
     * 
     */
    public void setNotSendWelcomeMail(boolean value) {
        this.notSendWelcomeMail = value;
    }

    /**
     * Obtiene el valor de la propiedad invitorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvitorCode() {
        return invitorCode;
    }

    /**
     * Define el valor de la propiedad invitorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvitorCode(String value) {
        this.invitorCode = value;
    }

}

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
 *         &lt;element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="operationKind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="badge" type="{http://FidelyNET3_SW_01_89_00}WS_Badge"/&gt;
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
    "campaignID",
    "operationKind",
    "badge"
})
@XmlRootElement(name = "BadgesManagementRequest")
public class BadgesManagementRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long campaignID;
    protected int operationKind;
    @XmlElement(required = true)
    protected WSBadge badge;

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
     * Obtiene el valor de la propiedad campaignID.
     * 
     */
    public long getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     */
    public void setCampaignID(long value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad operationKind.
     * 
     */
    public int getOperationKind() {
        return operationKind;
    }

    /**
     * Define el valor de la propiedad operationKind.
     * 
     */
    public void setOperationKind(int value) {
        this.operationKind = value;
    }

    /**
     * Obtiene el valor de la propiedad badge.
     * 
     * @return
     *     possible object is
     *     {@link WSBadge }
     *     
     */
    public WSBadge getBadge() {
        return badge;
    }

    /**
     * Define el valor de la propiedad badge.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBadge }
     *     
     */
    public void setBadge(WSBadge value) {
        this.badge = value;
    }

}

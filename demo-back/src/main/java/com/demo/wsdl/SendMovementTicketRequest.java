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
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movementId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="movementTicketId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movementForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="movementTicketImg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "sessionId",
    "movementId",
    "movementTicketId",
    "movementForeignId",
    "movementTicketImg"
})
@XmlRootElement(name = "SendMovementTicketRequest")
public class SendMovementTicketRequest {

    @XmlElement(required = true)
    protected String sessionId;
    protected long movementId;
    @XmlElement(required = true)
    protected String movementTicketId;
    protected long movementForeignId;
    @XmlElement(required = true)
    protected String movementTicketImg;

    /**
     * Obtiene el valor de la propiedad sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Define el valor de la propiedad sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementId.
     * 
     */
    public long getMovementId() {
        return movementId;
    }

    /**
     * Define el valor de la propiedad movementId.
     * 
     */
    public void setMovementId(long value) {
        this.movementId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementTicketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementTicketId() {
        return movementTicketId;
    }

    /**
     * Define el valor de la propiedad movementTicketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementTicketId(String value) {
        this.movementTicketId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementForeignId.
     * 
     */
    public long getMovementForeignId() {
        return movementForeignId;
    }

    /**
     * Define el valor de la propiedad movementForeignId.
     * 
     */
    public void setMovementForeignId(long value) {
        this.movementForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad movementTicketImg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementTicketImg() {
        return movementTicketImg;
    }

    /**
     * Define el valor de la propiedad movementTicketImg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementTicketImg(String value) {
        this.movementTicketImg = value;
    }

}

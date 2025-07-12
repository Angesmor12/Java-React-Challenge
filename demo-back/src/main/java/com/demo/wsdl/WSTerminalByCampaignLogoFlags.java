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
 * <p>Clase Java para WS_TerminalByCampaignLogoFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_TerminalByCampaignLogoFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="logoFlags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hasToUpdateTicketLogoCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInUpdateTicketLogoCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalByCampaignLogoFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "logoFlags",
    "hasToUpdateTicketLogoCampaign",
    "errorInUpdateTicketLogoCampaign"
})
public class WSTerminalByCampaignLogoFlags {

    protected long logoFlags;
    protected boolean hasToUpdateTicketLogoCampaign;
    protected boolean errorInUpdateTicketLogoCampaign;

    /**
     * Obtiene el valor de la propiedad logoFlags.
     * 
     */
    public long getLogoFlags() {
        return logoFlags;
    }

    /**
     * Define el valor de la propiedad logoFlags.
     * 
     */
    public void setLogoFlags(long value) {
        this.logoFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateTicketLogoCampaign.
     * 
     */
    public boolean isHasToUpdateTicketLogoCampaign() {
        return hasToUpdateTicketLogoCampaign;
    }

    /**
     * Define el valor de la propiedad hasToUpdateTicketLogoCampaign.
     * 
     */
    public void setHasToUpdateTicketLogoCampaign(boolean value) {
        this.hasToUpdateTicketLogoCampaign = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateTicketLogoCampaign.
     * 
     */
    public boolean isErrorInUpdateTicketLogoCampaign() {
        return errorInUpdateTicketLogoCampaign;
    }

    /**
     * Define el valor de la propiedad errorInUpdateTicketLogoCampaign.
     * 
     */
    public void setErrorInUpdateTicketLogoCampaign(boolean value) {
        this.errorInUpdateTicketLogoCampaign = value;
    }

}

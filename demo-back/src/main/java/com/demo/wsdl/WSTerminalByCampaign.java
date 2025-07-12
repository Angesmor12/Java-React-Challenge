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
 * <p>Clase Java para WS_TerminalByCampaign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_TerminalByCampaign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalByCampaignBehaviorFlags"/&gt;
 *         &lt;element name="logoFlags" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalByCampaignLogoFlags"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalByCampaign", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "terminalId",
    "campaignId",
    "flags",
    "logoFlags"
})
public class WSTerminalByCampaign {

    protected long terminalId;
    protected long campaignId;
    @XmlElement(required = true)
    protected WSTerminalByCampaignBehaviorFlags flags;
    @XmlElement(required = true)
    protected WSTerminalByCampaignLogoFlags logoFlags;

    /**
     * Obtiene el valor de la propiedad terminalId.
     * 
     */
    public long getTerminalId() {
        return terminalId;
    }

    /**
     * Define el valor de la propiedad terminalId.
     * 
     */
    public void setTerminalId(long value) {
        this.terminalId = value;
    }

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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalByCampaignBehaviorFlags }
     *     
     */
    public WSTerminalByCampaignBehaviorFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalByCampaignBehaviorFlags }
     *     
     */
    public void setFlags(WSTerminalByCampaignBehaviorFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad logoFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalByCampaignLogoFlags }
     *     
     */
    public WSTerminalByCampaignLogoFlags getLogoFlags() {
        return logoFlags;
    }

    /**
     * Define el valor de la propiedad logoFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalByCampaignLogoFlags }
     *     
     */
    public void setLogoFlags(WSTerminalByCampaignLogoFlags value) {
        this.logoFlags = value;
    }

}

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
 * <p>Clase Java para WS_TerminalBehavior complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_TerminalBehavior"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminalId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="behaviorFlags" type="{http://FidelyNET3_SW_01_89_00}WS_NetBehaviorFlags"/&gt;
 *         &lt;element name="informativeFlags" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalInformativeFlags"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalBehavior", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "terminalId",
    "behaviorFlags",
    "informativeFlags"
})
public class WSTerminalBehavior {

    protected long terminalId;
    @XmlElement(required = true)
    protected WSNetBehaviorFlags behaviorFlags;
    @XmlElement(required = true)
    protected WSTerminalInformativeFlags informativeFlags;

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
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public WSNetBehaviorFlags getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public void setBehaviorFlags(WSNetBehaviorFlags value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad informativeFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalInformativeFlags }
     *     
     */
    public WSTerminalInformativeFlags getInformativeFlags() {
        return informativeFlags;
    }

    /**
     * Define el valor de la propiedad informativeFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalInformativeFlags }
     *     
     */
    public void setInformativeFlags(WSTerminalInformativeFlags value) {
        this.informativeFlags = value;
    }

}

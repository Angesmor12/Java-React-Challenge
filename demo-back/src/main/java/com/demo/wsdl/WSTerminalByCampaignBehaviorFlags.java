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
 * <p>Clase Java para WS_TerminalByCampaignBehaviorFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_TerminalByCampaignBehaviorFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="behaviorFlags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hasToUpdateCampaign" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalByCampaignBehaviorFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "behaviorFlags",
    "hasToUpdateCampaign"
})
public class WSTerminalByCampaignBehaviorFlags {

    protected long behaviorFlags;
    protected boolean hasToUpdateCampaign;

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     */
    public long getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     */
    public void setBehaviorFlags(long value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateCampaign.
     * 
     */
    public boolean isHasToUpdateCampaign() {
        return hasToUpdateCampaign;
    }

    /**
     * Define el valor de la propiedad hasToUpdateCampaign.
     * 
     */
    public void setHasToUpdateCampaign(boolean value) {
        this.hasToUpdateCampaign = value;
    }

}

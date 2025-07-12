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
 * <p>Clase Java para WS_OtpFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_OtpFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="used" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="notUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_OtpFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "used",
    "notUsed"
})
public class WSOtpFlags {

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long flags;
    protected boolean used;
    protected boolean notUsed;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFlags(Long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad used.
     * 
     */
    public boolean isUsed() {
        return used;
    }

    /**
     * Define el valor de la propiedad used.
     * 
     */
    public void setUsed(boolean value) {
        this.used = value;
    }

    /**
     * Obtiene el valor de la propiedad notUsed.
     * 
     */
    public boolean isNotUsed() {
        return notUsed;
    }

    /**
     * Define el valor de la propiedad notUsed.
     * 
     */
    public void setNotUsed(boolean value) {
        this.notUsed = value;
    }

}

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
 * <p>Clase Java para WS_CustomerAreaFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CustomerAreaFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="useWeb" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useAndroid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useiOS" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useJME" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useBB" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerAreaFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useWeb",
    "useAndroid",
    "useiOS",
    "useJME",
    "useBB"
})
public class WSCustomerAreaFlags {

    protected long flags;
    protected boolean useWeb;
    protected boolean useAndroid;
    protected boolean useiOS;
    protected boolean useJME;
    protected boolean useBB;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad useWeb.
     * 
     */
    public boolean isUseWeb() {
        return useWeb;
    }

    /**
     * Define el valor de la propiedad useWeb.
     * 
     */
    public void setUseWeb(boolean value) {
        this.useWeb = value;
    }

    /**
     * Obtiene el valor de la propiedad useAndroid.
     * 
     */
    public boolean isUseAndroid() {
        return useAndroid;
    }

    /**
     * Define el valor de la propiedad useAndroid.
     * 
     */
    public void setUseAndroid(boolean value) {
        this.useAndroid = value;
    }

    /**
     * Obtiene el valor de la propiedad useiOS.
     * 
     */
    public boolean isUseiOS() {
        return useiOS;
    }

    /**
     * Define el valor de la propiedad useiOS.
     * 
     */
    public void setUseiOS(boolean value) {
        this.useiOS = value;
    }

    /**
     * Obtiene el valor de la propiedad useJME.
     * 
     */
    public boolean isUseJME() {
        return useJME;
    }

    /**
     * Define el valor de la propiedad useJME.
     * 
     */
    public void setUseJME(boolean value) {
        this.useJME = value;
    }

    /**
     * Obtiene el valor de la propiedad useBB.
     * 
     */
    public boolean isUseBB() {
        return useBB;
    }

    /**
     * Define el valor de la propiedad useBB.
     * 
     */
    public void setUseBB(boolean value) {
        this.useBB = value;
    }

}

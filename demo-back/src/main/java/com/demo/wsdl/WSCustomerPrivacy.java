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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para WS_CustomerPrivacy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CustomerPrivacy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="usedForPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="usedForStatistics" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="usedByOthers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canGetCurrentLocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canComunicaVerification" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="expDateUsedProm" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expDateUsedStatis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expDateUsedOthers" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="expDateUsedGen" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerPrivacy", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "usedForPromotions",
    "usedForStatistics",
    "usedByOthers",
    "canGetCurrentLocation",
    "canComunicaVerification",
    "expDateUsedProm",
    "expDateUsedStatis",
    "expDateUsedOthers",
    "expDateUsedGen"
})
public class WSCustomerPrivacy {

    protected long flags;
    protected boolean usedForPromotions;
    protected boolean usedForStatistics;
    protected boolean usedByOthers;
    protected boolean canGetCurrentLocation;
    protected boolean canComunicaVerification;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDateUsedProm;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDateUsedStatis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDateUsedOthers;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expDateUsedGen;

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
     * Obtiene el valor de la propiedad usedForPromotions.
     * 
     */
    public boolean isUsedForPromotions() {
        return usedForPromotions;
    }

    /**
     * Define el valor de la propiedad usedForPromotions.
     * 
     */
    public void setUsedForPromotions(boolean value) {
        this.usedForPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad usedForStatistics.
     * 
     */
    public boolean isUsedForStatistics() {
        return usedForStatistics;
    }

    /**
     * Define el valor de la propiedad usedForStatistics.
     * 
     */
    public void setUsedForStatistics(boolean value) {
        this.usedForStatistics = value;
    }

    /**
     * Obtiene el valor de la propiedad usedByOthers.
     * 
     */
    public boolean isUsedByOthers() {
        return usedByOthers;
    }

    /**
     * Define el valor de la propiedad usedByOthers.
     * 
     */
    public void setUsedByOthers(boolean value) {
        this.usedByOthers = value;
    }

    /**
     * Obtiene el valor de la propiedad canGetCurrentLocation.
     * 
     */
    public boolean isCanGetCurrentLocation() {
        return canGetCurrentLocation;
    }

    /**
     * Define el valor de la propiedad canGetCurrentLocation.
     * 
     */
    public void setCanGetCurrentLocation(boolean value) {
        this.canGetCurrentLocation = value;
    }

    /**
     * Obtiene el valor de la propiedad canComunicaVerification.
     * 
     */
    public boolean isCanComunicaVerification() {
        return canComunicaVerification;
    }

    /**
     * Define el valor de la propiedad canComunicaVerification.
     * 
     */
    public void setCanComunicaVerification(boolean value) {
        this.canComunicaVerification = value;
    }

    /**
     * Obtiene el valor de la propiedad expDateUsedProm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDateUsedProm() {
        return expDateUsedProm;
    }

    /**
     * Define el valor de la propiedad expDateUsedProm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDateUsedProm(XMLGregorianCalendar value) {
        this.expDateUsedProm = value;
    }

    /**
     * Obtiene el valor de la propiedad expDateUsedStatis.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDateUsedStatis() {
        return expDateUsedStatis;
    }

    /**
     * Define el valor de la propiedad expDateUsedStatis.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDateUsedStatis(XMLGregorianCalendar value) {
        this.expDateUsedStatis = value;
    }

    /**
     * Obtiene el valor de la propiedad expDateUsedOthers.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDateUsedOthers() {
        return expDateUsedOthers;
    }

    /**
     * Define el valor de la propiedad expDateUsedOthers.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDateUsedOthers(XMLGregorianCalendar value) {
        this.expDateUsedOthers = value;
    }

    /**
     * Obtiene el valor de la propiedad expDateUsedGen.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDateUsedGen() {
        return expDateUsedGen;
    }

    /**
     * Define el valor de la propiedad expDateUsedGen.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDateUsedGen(XMLGregorianCalendar value) {
        this.expDateUsedGen = value;
    }

}

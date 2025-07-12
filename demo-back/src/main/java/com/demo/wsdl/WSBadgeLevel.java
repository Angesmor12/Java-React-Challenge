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
 * <p>Clase Java para WS_BadgeLevel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_BadgeLevel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="campaingID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="minPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="maxPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="icon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_BadgeLevelFlags"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BadgeLevel", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "name",
    "campaingID",
    "minPointsStatus",
    "maxPointsStatus",
    "icon",
    "flags",
    "description"
})
public class WSBadgeLevel {

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(required = true)
    protected String name;
    protected long campaingID;
    protected double minPointsStatus;
    protected double maxPointsStatus;
    @XmlElement(required = true)
    protected String icon;
    @XmlElement(required = true)
    protected WSBadgeLevelFlags flags;
    @XmlElement(required = true)
    protected String description;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad campaingID.
     * 
     */
    public long getCampaingID() {
        return campaingID;
    }

    /**
     * Define el valor de la propiedad campaingID.
     * 
     */
    public void setCampaingID(long value) {
        this.campaingID = value;
    }

    /**
     * Obtiene el valor de la propiedad minPointsStatus.
     * 
     */
    public double getMinPointsStatus() {
        return minPointsStatus;
    }

    /**
     * Define el valor de la propiedad minPointsStatus.
     * 
     */
    public void setMinPointsStatus(double value) {
        this.minPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPointsStatus.
     * 
     */
    public double getMaxPointsStatus() {
        return maxPointsStatus;
    }

    /**
     * Define el valor de la propiedad maxPointsStatus.
     * 
     */
    public void setMaxPointsStatus(double value) {
        this.maxPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad icon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Define el valor de la propiedad icon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSBadgeLevelFlags }
     *     
     */
    public WSBadgeLevelFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSBadgeLevelFlags }
     *     
     */
    public void setFlags(WSBadgeLevelFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}

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
 * <p>Clase Java para WS_PonderationByProvider complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PonderationByProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prizeProviderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="epMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="epPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PonderationByProvider", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "categoryId",
    "prizeProviderId",
    "epMoney",
    "epPoints",
    "categoryName"
})
public class WSPonderationByProvider {

    protected long id;
    protected long categoryId;
    protected long prizeProviderId;
    protected double epMoney;
    protected double epPoints;
    @XmlElement(required = true)
    protected String categoryName;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad prizeProviderId.
     * 
     */
    public long getPrizeProviderId() {
        return prizeProviderId;
    }

    /**
     * Define el valor de la propiedad prizeProviderId.
     * 
     */
    public void setPrizeProviderId(long value) {
        this.prizeProviderId = value;
    }

    /**
     * Obtiene el valor de la propiedad epMoney.
     * 
     */
    public double getEpMoney() {
        return epMoney;
    }

    /**
     * Define el valor de la propiedad epMoney.
     * 
     */
    public void setEpMoney(double value) {
        this.epMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad epPoints.
     * 
     */
    public double getEpPoints() {
        return epPoints;
    }

    /**
     * Define el valor de la propiedad epPoints.
     * 
     */
    public void setEpPoints(double value) {
        this.epPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Define el valor de la propiedad categoryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

}

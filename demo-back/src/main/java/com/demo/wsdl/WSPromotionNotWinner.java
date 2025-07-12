//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PromotionNotWinner complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PromotionNotWinner"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotionID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shortDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="budgetUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="budgetUsedPercent" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promotionPrizes" type="{http://FidelyNET3_SW_01_89_00}WS_PromotionPrize" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PromotionNotWinner", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "promotionID",
    "description",
    "shortDescription",
    "longDescription",
    "budget",
    "budgetUsed",
    "budgetUsedPercent",
    "promotionPrizes"
})
public class WSPromotionNotWinner {

    protected long promotionID;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String shortDescription;
    @XmlElement(required = true)
    protected String longDescription;
    protected double budget;
    protected double budgetUsed;
    protected double budgetUsedPercent;
    @XmlElement(required = true)
    protected List<WSPromotionPrize> promotionPrizes;

    /**
     * Obtiene el valor de la propiedad promotionID.
     * 
     */
    public long getPromotionID() {
        return promotionID;
    }

    /**
     * Define el valor de la propiedad promotionID.
     * 
     */
    public void setPromotionID(long value) {
        this.promotionID = value;
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

    /**
     * Obtiene el valor de la propiedad shortDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Define el valor de la propiedad shortDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad longDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Define el valor de la propiedad longDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDescription(String value) {
        this.longDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad budget.
     * 
     */
    public double getBudget() {
        return budget;
    }

    /**
     * Define el valor de la propiedad budget.
     * 
     */
    public void setBudget(double value) {
        this.budget = value;
    }

    /**
     * Obtiene el valor de la propiedad budgetUsed.
     * 
     */
    public double getBudgetUsed() {
        return budgetUsed;
    }

    /**
     * Define el valor de la propiedad budgetUsed.
     * 
     */
    public void setBudgetUsed(double value) {
        this.budgetUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad budgetUsedPercent.
     * 
     */
    public double getBudgetUsedPercent() {
        return budgetUsedPercent;
    }

    /**
     * Define el valor de la propiedad budgetUsedPercent.
     * 
     */
    public void setBudgetUsedPercent(double value) {
        this.budgetUsedPercent = value;
    }

    /**
     * Gets the value of the promotionPrizes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionPrizes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionPrizes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotionPrize }
     * 
     * 
     */
    public List<WSPromotionPrize> getPromotionPrizes() {
        if (promotionPrizes == null) {
            promotionPrizes = new ArrayList<WSPromotionPrize>();
        }
        return this.promotionPrizes;
    }

}

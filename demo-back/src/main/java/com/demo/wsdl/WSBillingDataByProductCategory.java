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
 * <p>Clase Java para WS_BillingDataByProductCategory complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_BillingDataByProductCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idProductCategory" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="descriptionProductCategory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="billingTarget" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="advancePercentPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="amountProductCategoryInPeriod" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_BillingDataByProductCategory", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "idProductCategory",
    "descriptionProductCategory",
    "billingTarget",
    "advancePercentPeriod",
    "amountProductCategoryInPeriod"
})
public class WSBillingDataByProductCategory {

    protected long idProductCategory;
    @XmlElement(required = true)
    protected String descriptionProductCategory;
    protected double billingTarget;
    protected double advancePercentPeriod;
    protected double amountProductCategoryInPeriod;

    /**
     * Obtiene el valor de la propiedad idProductCategory.
     * 
     */
    public long getIdProductCategory() {
        return idProductCategory;
    }

    /**
     * Define el valor de la propiedad idProductCategory.
     * 
     */
    public void setIdProductCategory(long value) {
        this.idProductCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionProductCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionProductCategory() {
        return descriptionProductCategory;
    }

    /**
     * Define el valor de la propiedad descriptionProductCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionProductCategory(String value) {
        this.descriptionProductCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad billingTarget.
     * 
     */
    public double getBillingTarget() {
        return billingTarget;
    }

    /**
     * Define el valor de la propiedad billingTarget.
     * 
     */
    public void setBillingTarget(double value) {
        this.billingTarget = value;
    }

    /**
     * Obtiene el valor de la propiedad advancePercentPeriod.
     * 
     */
    public double getAdvancePercentPeriod() {
        return advancePercentPeriod;
    }

    /**
     * Define el valor de la propiedad advancePercentPeriod.
     * 
     */
    public void setAdvancePercentPeriod(double value) {
        this.advancePercentPeriod = value;
    }

    /**
     * Obtiene el valor de la propiedad amountProductCategoryInPeriod.
     * 
     */
    public double getAmountProductCategoryInPeriod() {
        return amountProductCategoryInPeriod;
    }

    /**
     * Define el valor de la propiedad amountProductCategoryInPeriod.
     * 
     */
    public void setAmountProductCategoryInPeriod(double value) {
        this.amountProductCategoryInPeriod = value;
    }

}

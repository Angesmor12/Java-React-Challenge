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
 * <p>Clase Java para SW_GeneralBillingData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SW_GeneralBillingData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalBilling" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalChargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalProductsAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="advancePercents" type="{http://FidelyNET3_SW_01_89_00}WS_AdvancePercents" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SW_GeneralBillingData", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "totalBilling",
    "totalChargedPoints",
    "totalProductsAmount",
    "advancePercents"
})
public class SWGeneralBillingData {

    protected double totalBilling;
    protected double totalChargedPoints;
    protected double totalProductsAmount;
    @XmlElement(required = true)
    protected List<WSAdvancePercents> advancePercents;

    /**
     * Obtiene el valor de la propiedad totalBilling.
     * 
     */
    public double getTotalBilling() {
        return totalBilling;
    }

    /**
     * Define el valor de la propiedad totalBilling.
     * 
     */
    public void setTotalBilling(double value) {
        this.totalBilling = value;
    }

    /**
     * Obtiene el valor de la propiedad totalChargedPoints.
     * 
     */
    public double getTotalChargedPoints() {
        return totalChargedPoints;
    }

    /**
     * Define el valor de la propiedad totalChargedPoints.
     * 
     */
    public void setTotalChargedPoints(double value) {
        this.totalChargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad totalProductsAmount.
     * 
     */
    public double getTotalProductsAmount() {
        return totalProductsAmount;
    }

    /**
     * Define el valor de la propiedad totalProductsAmount.
     * 
     */
    public void setTotalProductsAmount(double value) {
        this.totalProductsAmount = value;
    }

    /**
     * Gets the value of the advancePercents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancePercents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancePercents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSAdvancePercents }
     * 
     * 
     */
    public List<WSAdvancePercents> getAdvancePercents() {
        if (advancePercents == null) {
            advancePercents = new ArrayList<WSAdvancePercents>();
        }
        return this.advancePercents;
    }

}

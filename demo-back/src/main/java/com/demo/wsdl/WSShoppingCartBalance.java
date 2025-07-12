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
 * <p>Clase Java para WS_ShoppingCartBalance complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ShoppingCartBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalPrizesQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pointsWithDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moneyUsedWithDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShoppingCartBalance", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "totalPrizesQuantity",
    "pointsUsed",
    "moneyUsed",
    "pointsWithDiscount",
    "moneyUsedWithDiscount"
})
public class WSShoppingCartBalance {

    protected long totalPrizesQuantity;
    protected double pointsUsed;
    protected double moneyUsed;
    protected double pointsWithDiscount;
    protected double moneyUsedWithDiscount;

    /**
     * Obtiene el valor de la propiedad totalPrizesQuantity.
     * 
     */
    public long getTotalPrizesQuantity() {
        return totalPrizesQuantity;
    }

    /**
     * Define el valor de la propiedad totalPrizesQuantity.
     * 
     */
    public void setTotalPrizesQuantity(long value) {
        this.totalPrizesQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsUsed.
     * 
     */
    public double getPointsUsed() {
        return pointsUsed;
    }

    /**
     * Define el valor de la propiedad pointsUsed.
     * 
     */
    public void setPointsUsed(double value) {
        this.pointsUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUsed.
     * 
     */
    public double getMoneyUsed() {
        return moneyUsed;
    }

    /**
     * Define el valor de la propiedad moneyUsed.
     * 
     */
    public void setMoneyUsed(double value) {
        this.moneyUsed = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsWithDiscount.
     * 
     */
    public double getPointsWithDiscount() {
        return pointsWithDiscount;
    }

    /**
     * Define el valor de la propiedad pointsWithDiscount.
     * 
     */
    public void setPointsWithDiscount(double value) {
        this.pointsWithDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyUsedWithDiscount.
     * 
     */
    public double getMoneyUsedWithDiscount() {
        return moneyUsedWithDiscount;
    }

    /**
     * Define el valor de la propiedad moneyUsedWithDiscount.
     * 
     */
    public void setMoneyUsedWithDiscount(double value) {
        this.moneyUsedWithDiscount = value;
    }

}

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
 * <p>Clase Java para WS_DiscountExchange complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_DiscountExchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountPrizeList" type="{http://FidelyNET3_SW_01_89_00}WS_Discount4Prize" maxOccurs="unbounded"/&gt;
 *         &lt;element name="totalDiscountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DiscountExchange", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "discountPrizeList",
    "totalDiscountInMoney"
})
public class WSDiscountExchange {

    @XmlElement(required = true)
    protected List<WSDiscount4Prize> discountPrizeList;
    protected double totalDiscountInMoney;

    /**
     * Gets the value of the discountPrizeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountPrizeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPrizeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDiscount4Prize }
     * 
     * 
     */
    public List<WSDiscount4Prize> getDiscountPrizeList() {
        if (discountPrizeList == null) {
            discountPrizeList = new ArrayList<WSDiscount4Prize>();
        }
        return this.discountPrizeList;
    }

    /**
     * Obtiene el valor de la propiedad totalDiscountInMoney.
     * 
     */
    public double getTotalDiscountInMoney() {
        return totalDiscountInMoney;
    }

    /**
     * Define el valor de la propiedad totalDiscountInMoney.
     * 
     */
    public void setTotalDiscountInMoney(double value) {
        this.totalDiscountInMoney = value;
    }

}

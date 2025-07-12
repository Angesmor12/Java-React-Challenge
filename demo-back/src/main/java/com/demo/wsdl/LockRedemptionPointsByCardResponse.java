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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customer" type="{http://FidelyNET3_SW_01_89_00}WS_Customer"/&gt;
 *         &lt;element name="movement" type="{http://FidelyNET3_SW_01_89_00}WS_Movement"/&gt;
 *         &lt;element name="promotions" type="{http://FidelyNET3_SW_01_89_00}WS_Promotion" maxOccurs="unbounded"/&gt;
 *         &lt;element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_ShopStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "customer",
    "movement",
    "promotions",
    "shop"
})
@XmlRootElement(name = "LockRedemptionPointsByCardResponse")
public class LockRedemptionPointsByCardResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSCustomer customer;
    @XmlElement(required = true)
    protected WSMovement movement;
    @XmlElement(required = true)
    protected List<WSPromotion> promotions;
    @XmlElement(required = true)
    protected WSShopStatus shop;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad customer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomer }
     *     
     */
    public WSCustomer getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomer }
     *     
     */
    public void setCustomer(WSCustomer value) {
        this.customer = value;
    }

    /**
     * Obtiene el valor de la propiedad movement.
     * 
     * @return
     *     possible object is
     *     {@link WSMovement }
     *     
     */
    public WSMovement getMovement() {
        return movement;
    }

    /**
     * Define el valor de la propiedad movement.
     * 
     * @param value
     *     allowed object is
     *     {@link WSMovement }
     *     
     */
    public void setMovement(WSMovement value) {
        this.movement = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPromotion }
     * 
     * 
     */
    public List<WSPromotion> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<WSPromotion>();
        }
        return this.promotions;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShopStatus }
     *     
     */
    public WSShopStatus getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopStatus }
     *     
     */
    public void setShop(WSShopStatus value) {
        this.shop = value;
    }

}

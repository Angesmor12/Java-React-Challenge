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
 * <p>Clase Java para WS_Product4Sale complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_Product4Sale"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="saleTicketId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameProduct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productCategoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productCategoryCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="productCategoryForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="chargedPoints" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Product4Sale", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "code",
    "price",
    "amount",
    "saleTicketId",
    "nameProduct",
    "productCategoryId",
    "productCategoryCode",
    "cost",
    "productCategoryForeignId",
    "chargedPoints",
    "pathImage"
})
public class WSProduct4Sale {

    @XmlElement(required = true, nillable = true)
    protected String code;
    protected double price;
    protected double amount;
    @XmlElement(required = true)
    protected String saleTicketId;
    @XmlElement(required = true)
    protected String nameProduct;
    protected long productCategoryId;
    protected long productCategoryCode;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double cost;
    protected long productCategoryForeignId;
    protected long chargedPoints;
    @XmlElement(required = true)
    protected String pathImage;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad saleTicketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTicketId() {
        return saleTicketId;
    }

    /**
     * Define el valor de la propiedad saleTicketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTicketId(String value) {
        this.saleTicketId = value;
    }

    /**
     * Obtiene el valor de la propiedad nameProduct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * Define el valor de la propiedad nameProduct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameProduct(String value) {
        this.nameProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryId.
     * 
     */
    public long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * Define el valor de la propiedad productCategoryId.
     * 
     */
    public void setProductCategoryId(long value) {
        this.productCategoryId = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryCode.
     * 
     */
    public long getProductCategoryCode() {
        return productCategoryCode;
    }

    /**
     * Define el valor de la propiedad productCategoryCode.
     * 
     */
    public void setProductCategoryCode(long value) {
        this.productCategoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad cost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCost() {
        return cost;
    }

    /**
     * Define el valor de la propiedad cost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCost(Double value) {
        this.cost = value;
    }

    /**
     * Obtiene el valor de la propiedad productCategoryForeignId.
     * 
     */
    public long getProductCategoryForeignId() {
        return productCategoryForeignId;
    }

    /**
     * Define el valor de la propiedad productCategoryForeignId.
     * 
     */
    public void setProductCategoryForeignId(long value) {
        this.productCategoryForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedPoints.
     * 
     */
    public long getChargedPoints() {
        return chargedPoints;
    }

    /**
     * Define el valor de la propiedad chargedPoints.
     * 
     */
    public void setChargedPoints(long value) {
        this.chargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad pathImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathImage() {
        return pathImage;
    }

    /**
     * Define el valor de la propiedad pathImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathImage(String value) {
        this.pathImage = value;
    }

}

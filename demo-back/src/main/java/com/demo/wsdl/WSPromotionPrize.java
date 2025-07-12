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
 * <p>Clase Java para WS_PromotionPrize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PromotionPrize"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valuePrize" type="{http://www.w3.org/2001/XMLSchema}anySimpleType"/&gt;
 *         &lt;element name="products" type="{http://FidelyNET3_SW_01_89_00}WS_ProductPromotionPrize" maxOccurs="unbounded"/&gt;
 *         &lt;element name="paymentMethod" type="{http://FidelyNET3_SW_01_89_00}WS_PaymentMethodPromotionPrize"/&gt;
 *         &lt;element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_PrizePromotionPrize"/&gt;
 *         &lt;element name="urlImageWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="finalPointsPrize" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="prizeCatalogPrize" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCatalogPromotionPrize" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PromotionPrize", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "kind",
    "valuePrize",
    "products",
    "paymentMethod",
    "prize",
    "urlImageWS",
    "title",
    "description",
    "finalPointsPrize",
    "prizeCatalogPrize"
})
public class WSPromotionPrize {

    protected int kind;
    @XmlElement(required = true)
    protected Object valuePrize;
    @XmlElement(required = true)
    protected List<WSProductPromotionPrize> products;
    @XmlElement(required = true)
    protected WSPaymentMethodPromotionPrize paymentMethod;
    @XmlElement(required = true)
    protected WSPrizePromotionPrize prize;
    @XmlElement(required = true)
    protected String urlImageWS;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    protected double finalPointsPrize;
    @XmlElement(required = true)
    protected List<WSPrizeCatalogPromotionPrize> prizeCatalogPrize;

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     */
    public int getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     */
    public void setKind(int value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad valuePrize.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getValuePrize() {
        return valuePrize;
    }

    /**
     * Define el valor de la propiedad valuePrize.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setValuePrize(Object value) {
        this.valuePrize = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProductPromotionPrize }
     * 
     * 
     */
    public List<WSProductPromotionPrize> getProducts() {
        if (products == null) {
            products = new ArrayList<WSProductPromotionPrize>();
        }
        return this.products;
    }

    /**
     * Obtiene el valor de la propiedad paymentMethod.
     * 
     * @return
     *     possible object is
     *     {@link WSPaymentMethodPromotionPrize }
     *     
     */
    public WSPaymentMethodPromotionPrize getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Define el valor de la propiedad paymentMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaymentMethodPromotionPrize }
     *     
     */
    public void setPaymentMethod(WSPaymentMethodPromotionPrize value) {
        this.paymentMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizePromotionPrize }
     *     
     */
    public WSPrizePromotionPrize getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizePromotionPrize }
     *     
     */
    public void setPrize(WSPrizePromotionPrize value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad urlImageWS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImageWS() {
        return urlImageWS;
    }

    /**
     * Define el valor de la propiedad urlImageWS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImageWS(String value) {
        this.urlImageWS = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Obtiene el valor de la propiedad finalPointsPrize.
     * 
     */
    public double getFinalPointsPrize() {
        return finalPointsPrize;
    }

    /**
     * Define el valor de la propiedad finalPointsPrize.
     * 
     */
    public void setFinalPointsPrize(double value) {
        this.finalPointsPrize = value;
    }

    /**
     * Gets the value of the prizeCatalogPrize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizeCatalogPrize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizeCatalogPrize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPrizeCatalogPromotionPrize }
     * 
     * 
     */
    public List<WSPrizeCatalogPromotionPrize> getPrizeCatalogPrize() {
        if (prizeCatalogPrize == null) {
            prizeCatalogPrize = new ArrayList<WSPrizeCatalogPromotionPrize>();
        }
        return this.prizeCatalogPrize;
    }

}

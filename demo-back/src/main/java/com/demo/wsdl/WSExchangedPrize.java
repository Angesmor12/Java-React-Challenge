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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para WS_ExchangedPrize complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ExchangedPrize"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="exchangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="deliverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeFlags"/&gt;
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_Prize"/&gt;
 *         &lt;element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discountInPercent" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountInMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="shippingCost" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingCost"/&gt;
 *         &lt;element name="discountVoucherPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountVoucherPointsApplyCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="paymentMethod" type="{http://FidelyNET3_SW_01_89_00}WS_PrizePaymentMethod" maxOccurs="unbounded"/&gt;
 *         &lt;element name="key" type="{http://FidelyNET3_SW_01_89_00}WS_Key" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExchangedPrize", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "exchangeDate",
    "deliverDate",
    "flags",
    "points",
    "moneyUsed",
    "quantity",
    "prize",
    "shop",
    "name",
    "discountInPercent",
    "discountInMoney",
    "shippingCost",
    "discountVoucherPoints",
    "discountVoucherPointsApplyCount",
    "paymentMethod",
    "key"
})
public class WSExchangedPrize {

    protected long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exchangeDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliverDate;
    @XmlElement(required = true)
    protected WSExchangedPrizeFlags flags;
    protected double points;
    protected double moneyUsed;
    protected int quantity;
    @XmlElement(required = true)
    protected WSPrize prize;
    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true)
    protected String name;
    protected double discountInPercent;
    protected double discountInMoney;
    @XmlElement(required = true)
    protected WSShippingCost shippingCost;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double discountVoucherPoints;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long discountVoucherPointsApplyCount;
    @XmlElement(required = true)
    protected List<WSPrizePaymentMethod> paymentMethod;
    @XmlElement(required = true)
    protected List<WSKey> key;

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
     * Obtiene el valor de la propiedad exchangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeDate() {
        return exchangeDate;
    }

    /**
     * Define el valor de la propiedad exchangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeDate(XMLGregorianCalendar value) {
        this.exchangeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad deliverDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliverDate() {
        return deliverDate;
    }

    /**
     * Define el valor de la propiedad deliverDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliverDate(XMLGregorianCalendar value) {
        this.deliverDate = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public WSExchangedPrizeFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExchangedPrizeFlags }
     *     
     */
    public void setFlags(WSExchangedPrizeFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad points.
     * 
     */
    public double getPoints() {
        return points;
    }

    /**
     * Define el valor de la propiedad points.
     * 
     */
    public void setPoints(double value) {
        this.points = value;
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
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrize }
     *     
     */
    public WSPrize getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrize }
     *     
     */
    public void setPrize(WSPrize value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShop }
     *     
     */
    public WSShop getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShop }
     *     
     */
    public void setShop(WSShop value) {
        this.shop = value;
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
     * Obtiene el valor de la propiedad discountInPercent.
     * 
     */
    public double getDiscountInPercent() {
        return discountInPercent;
    }

    /**
     * Define el valor de la propiedad discountInPercent.
     * 
     */
    public void setDiscountInPercent(double value) {
        this.discountInPercent = value;
    }

    /**
     * Obtiene el valor de la propiedad discountInMoney.
     * 
     */
    public double getDiscountInMoney() {
        return discountInMoney;
    }

    /**
     * Define el valor de la propiedad discountInMoney.
     * 
     */
    public void setDiscountInMoney(double value) {
        this.discountInMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCost.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingCost }
     *     
     */
    public WSShippingCost getShippingCost() {
        return shippingCost;
    }

    /**
     * Define el valor de la propiedad shippingCost.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingCost }
     *     
     */
    public void setShippingCost(WSShippingCost value) {
        this.shippingCost = value;
    }

    /**
     * Obtiene el valor de la propiedad discountVoucherPoints.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountVoucherPoints() {
        return discountVoucherPoints;
    }

    /**
     * Define el valor de la propiedad discountVoucherPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountVoucherPoints(Double value) {
        this.discountVoucherPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad discountVoucherPointsApplyCount.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountVoucherPointsApplyCount() {
        return discountVoucherPointsApplyCount;
    }

    /**
     * Define el valor de la propiedad discountVoucherPointsApplyCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountVoucherPointsApplyCount(Long value) {
        this.discountVoucherPointsApplyCount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPrizePaymentMethod }
     * 
     * 
     */
    public List<WSPrizePaymentMethod> getPaymentMethod() {
        if (paymentMethod == null) {
            paymentMethod = new ArrayList<WSPrizePaymentMethod>();
        }
        return this.paymentMethod;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSKey }
     * 
     * 
     */
    public List<WSKey> getKey() {
        if (key == null) {
            key = new ArrayList<WSKey>();
        }
        return this.key;
    }

}

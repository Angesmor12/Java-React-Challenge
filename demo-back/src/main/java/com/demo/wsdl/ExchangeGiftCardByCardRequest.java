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
 *         &lt;element name="sessionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="identityCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerForeignId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="giftCardCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="catalogId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="moneyUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pointsUsed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pincode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shippingInformation" type="{http://FidelyNET3_SW_01_89_00}WS_ShippingInformation"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="externalRefMixedPayment" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="forGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="shopID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopForeignID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="useDataShopForShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="feeMixedPayment" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "", propOrder = {
    "sessionID",
    "card",
    "customerID",
    "mobile",
    "email",
    "identityCard",
    "customerForeignId",
    "giftCardCode",
    "catalogId",
    "moneyUsed",
    "pointsUsed",
    "discountId",
    "pincode",
    "shippingInformation",
    "notes",
    "externalRefMixedPayment",
    "forGift",
    "shopID",
    "shopForeignID",
    "useDataShopForShipping",
    "feeMixedPayment",
    "useFeeFix",
    "paymentMethod",
    "key"
})
@XmlRootElement(name = "ExchangeGiftCardByCardRequest")
public class ExchangeGiftCardByCardRequest {

    @XmlElement(required = true)
    protected String sessionID;
    @XmlElement(required = true)
    protected String card;
    protected long customerID;
    @XmlElement(required = true)
    protected String mobile;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String identityCard;
    @XmlElement(required = true)
    protected String customerForeignId;
    @XmlElement(required = true)
    protected String giftCardCode;
    protected long catalogId;
    protected double moneyUsed;
    protected double pointsUsed;
    protected long discountId;
    @XmlElement(required = true)
    protected String pincode;
    @XmlElement(required = true)
    protected WSShippingInformation shippingInformation;
    @XmlElement(required = true)
    protected String notes;
    @XmlElement(required = true)
    protected String externalRefMixedPayment;
    protected boolean forGift;
    protected long shopID;
    protected long shopForeignID;
    protected boolean useDataShopForShipping;
    protected double feeMixedPayment;
    protected boolean useFeeFix;
    @XmlElement(required = true)
    protected List<WSPrizePaymentMethod> paymentMethod;
    @XmlElement(required = true)
    protected List<WSKey> key;

    /**
     * Obtiene el valor de la propiedad sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Define el valor de la propiedad sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCard(String value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad customerID.
     * 
     */
    public long getCustomerID() {
        return customerID;
    }

    /**
     * Define el valor de la propiedad customerID.
     * 
     */
    public void setCustomerID(long value) {
        this.customerID = value;
    }

    /**
     * Obtiene el valor de la propiedad mobile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Define el valor de la propiedad mobile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad identityCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCard() {
        return identityCard;
    }

    /**
     * Define el valor de la propiedad identityCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCard(String value) {
        this.identityCard = value;
    }

    /**
     * Obtiene el valor de la propiedad customerForeignId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerForeignId() {
        return customerForeignId;
    }

    /**
     * Define el valor de la propiedad customerForeignId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerForeignId(String value) {
        this.customerForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad giftCardCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftCardCode() {
        return giftCardCode;
    }

    /**
     * Define el valor de la propiedad giftCardCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftCardCode(String value) {
        this.giftCardCode = value;
    }

    /**
     * Obtiene el valor de la propiedad catalogId.
     * 
     */
    public long getCatalogId() {
        return catalogId;
    }

    /**
     * Define el valor de la propiedad catalogId.
     * 
     */
    public void setCatalogId(long value) {
        this.catalogId = value;
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
     * Obtiene el valor de la propiedad discountId.
     * 
     */
    public long getDiscountId() {
        return discountId;
    }

    /**
     * Define el valor de la propiedad discountId.
     * 
     */
    public void setDiscountId(long value) {
        this.discountId = value;
    }

    /**
     * Obtiene el valor de la propiedad pincode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * Define el valor de la propiedad pincode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPincode(String value) {
        this.pincode = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingInformation.
     * 
     * @return
     *     possible object is
     *     {@link WSShippingInformation }
     *     
     */
    public WSShippingInformation getShippingInformation() {
        return shippingInformation;
    }

    /**
     * Define el valor de la propiedad shippingInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShippingInformation }
     *     
     */
    public void setShippingInformation(WSShippingInformation value) {
        this.shippingInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Define el valor de la propiedad notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Obtiene el valor de la propiedad externalRefMixedPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalRefMixedPayment() {
        return externalRefMixedPayment;
    }

    /**
     * Define el valor de la propiedad externalRefMixedPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalRefMixedPayment(String value) {
        this.externalRefMixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad forGift.
     * 
     */
    public boolean isForGift() {
        return forGift;
    }

    /**
     * Define el valor de la propiedad forGift.
     * 
     */
    public void setForGift(boolean value) {
        this.forGift = value;
    }

    /**
     * Obtiene el valor de la propiedad shopID.
     * 
     */
    public long getShopID() {
        return shopID;
    }

    /**
     * Define el valor de la propiedad shopID.
     * 
     */
    public void setShopID(long value) {
        this.shopID = value;
    }

    /**
     * Obtiene el valor de la propiedad shopForeignID.
     * 
     */
    public long getShopForeignID() {
        return shopForeignID;
    }

    /**
     * Define el valor de la propiedad shopForeignID.
     * 
     */
    public void setShopForeignID(long value) {
        this.shopForeignID = value;
    }

    /**
     * Obtiene el valor de la propiedad useDataShopForShipping.
     * 
     */
    public boolean isUseDataShopForShipping() {
        return useDataShopForShipping;
    }

    /**
     * Define el valor de la propiedad useDataShopForShipping.
     * 
     */
    public void setUseDataShopForShipping(boolean value) {
        this.useDataShopForShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad feeMixedPayment.
     * 
     */
    public double getFeeMixedPayment() {
        return feeMixedPayment;
    }

    /**
     * Define el valor de la propiedad feeMixedPayment.
     * 
     */
    public void setFeeMixedPayment(double value) {
        this.feeMixedPayment = value;
    }

    /**
     * Obtiene el valor de la propiedad useFeeFix.
     * 
     */
    public boolean isUseFeeFix() {
        return useFeeFix;
    }

    /**
     * Define el valor de la propiedad useFeeFix.
     * 
     */
    public void setUseFeeFix(boolean value) {
        this.useFeeFix = value;
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

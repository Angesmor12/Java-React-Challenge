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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_CategoryByShopBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CategoryByShopBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="weightPointValueMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointValuePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightChargeCreditMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightChargeCreditPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightChargePointMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightChargePointPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightDischargeCreditMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightDischargeCreditPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightExchangePrizePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightExchangePrizeMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pointsInActivation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="initialCharge" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minLimitDischargePoint" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointValueMoneyCashBack" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointValuePointsCashBack" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointValueBPMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointValueBPPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointPurchaseMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightPointPurchasePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointPurchaseDay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointPurchaseWeek" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointPurchaseMonth" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointPurchaseGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransReciverDay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransReciverWeek" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransReciverMonth" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransReciverGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransIssuedDay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransIssuedWeek" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransIssuedMonth" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointTransIssuedGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointDay" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointWeek" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointMonth" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="limitPointGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="movKindChargePointsByDay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movKindChargePointsByMonth" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movKindChargePointsByGeneral" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="movKindChargePointsByWeek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryByShopBase", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "shopId",
    "weightPointValueMoney",
    "weightPointValuePoints",
    "weightChargeCreditMoney",
    "weightChargeCreditPoints",
    "weightChargePointMoney",
    "weightChargePointPoints",
    "weightDischargeCreditMoney",
    "weightDischargeCreditPoints",
    "weightExchangePrizePoints",
    "weightExchangePrizeMoney",
    "pointsInActivation",
    "initialCharge",
    "currencyId",
    "currencySymbol",
    "minLimitDischargePoint",
    "weightPointValueMoneyCashBack",
    "weightPointValuePointsCashBack",
    "weightPointValueBPMoney",
    "weightPointValueBPPoints",
    "weightPointPurchaseMoney",
    "weightPointPurchasePoints",
    "limitPointPurchaseDay",
    "limitPointPurchaseWeek",
    "limitPointPurchaseMonth",
    "limitPointPurchaseGeneral",
    "limitPointTransReciverDay",
    "limitPointTransReciverWeek",
    "limitPointTransReciverMonth",
    "limitPointTransReciverGeneral",
    "limitPointTransIssuedDay",
    "limitPointTransIssuedWeek",
    "limitPointTransIssuedMonth",
    "limitPointTransIssuedGeneral",
    "limitPointDay",
    "limitPointWeek",
    "limitPointMonth",
    "limitPointGeneral",
    "movKindChargePointsByDay",
    "movKindChargePointsByMonth",
    "movKindChargePointsByGeneral",
    "movKindChargePointsByWeek"
})
@XmlSeeAlso({
    WSCategoryByShop.class,
    WSCategoryByShopModify.class
})
public class WSCategoryByShopBase {

    protected long id;
    protected long shopId;
    protected double weightPointValueMoney;
    protected double weightPointValuePoints;
    protected double weightChargeCreditMoney;
    protected double weightChargeCreditPoints;
    protected double weightChargePointMoney;
    protected double weightChargePointPoints;
    protected double weightDischargeCreditMoney;
    protected double weightDischargeCreditPoints;
    protected double weightExchangePrizePoints;
    protected double weightExchangePrizeMoney;
    protected double pointsInActivation;
    protected double initialCharge;
    protected long currencyId;
    @XmlElement(required = true)
    protected String currencySymbol;
    protected double minLimitDischargePoint;
    protected double weightPointValueMoneyCashBack;
    protected double weightPointValuePointsCashBack;
    protected double weightPointValueBPMoney;
    protected double weightPointValueBPPoints;
    protected double weightPointPurchaseMoney;
    protected double weightPointPurchasePoints;
    protected double limitPointPurchaseDay;
    protected double limitPointPurchaseWeek;
    protected double limitPointPurchaseMonth;
    protected double limitPointPurchaseGeneral;
    protected double limitPointTransReciverDay;
    protected double limitPointTransReciverWeek;
    protected double limitPointTransReciverMonth;
    protected double limitPointTransReciverGeneral;
    protected double limitPointTransIssuedDay;
    protected double limitPointTransIssuedWeek;
    protected double limitPointTransIssuedMonth;
    protected double limitPointTransIssuedGeneral;
    protected double limitPointDay;
    protected double limitPointWeek;
    protected double limitPointMonth;
    protected double limitPointGeneral;
    @XmlElement(required = true)
    protected String movKindChargePointsByDay;
    @XmlElement(required = true)
    protected String movKindChargePointsByMonth;
    @XmlElement(required = true)
    protected String movKindChargePointsByGeneral;
    @XmlElement(required = true)
    protected String movKindChargePointsByWeek;

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
     * Obtiene el valor de la propiedad shopId.
     * 
     */
    public long getShopId() {
        return shopId;
    }

    /**
     * Define el valor de la propiedad shopId.
     * 
     */
    public void setShopId(long value) {
        this.shopId = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueMoney.
     * 
     */
    public double getWeightPointValueMoney() {
        return weightPointValueMoney;
    }

    /**
     * Define el valor de la propiedad weightPointValueMoney.
     * 
     */
    public void setWeightPointValueMoney(double value) {
        this.weightPointValueMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValuePoints.
     * 
     */
    public double getWeightPointValuePoints() {
        return weightPointValuePoints;
    }

    /**
     * Define el valor de la propiedad weightPointValuePoints.
     * 
     */
    public void setWeightPointValuePoints(double value) {
        this.weightPointValuePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightChargeCreditMoney.
     * 
     */
    public double getWeightChargeCreditMoney() {
        return weightChargeCreditMoney;
    }

    /**
     * Define el valor de la propiedad weightChargeCreditMoney.
     * 
     */
    public void setWeightChargeCreditMoney(double value) {
        this.weightChargeCreditMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightChargeCreditPoints.
     * 
     */
    public double getWeightChargeCreditPoints() {
        return weightChargeCreditPoints;
    }

    /**
     * Define el valor de la propiedad weightChargeCreditPoints.
     * 
     */
    public void setWeightChargeCreditPoints(double value) {
        this.weightChargeCreditPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightChargePointMoney.
     * 
     */
    public double getWeightChargePointMoney() {
        return weightChargePointMoney;
    }

    /**
     * Define el valor de la propiedad weightChargePointMoney.
     * 
     */
    public void setWeightChargePointMoney(double value) {
        this.weightChargePointMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightChargePointPoints.
     * 
     */
    public double getWeightChargePointPoints() {
        return weightChargePointPoints;
    }

    /**
     * Define el valor de la propiedad weightChargePointPoints.
     * 
     */
    public void setWeightChargePointPoints(double value) {
        this.weightChargePointPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightDischargeCreditMoney.
     * 
     */
    public double getWeightDischargeCreditMoney() {
        return weightDischargeCreditMoney;
    }

    /**
     * Define el valor de la propiedad weightDischargeCreditMoney.
     * 
     */
    public void setWeightDischargeCreditMoney(double value) {
        this.weightDischargeCreditMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightDischargeCreditPoints.
     * 
     */
    public double getWeightDischargeCreditPoints() {
        return weightDischargeCreditPoints;
    }

    /**
     * Define el valor de la propiedad weightDischargeCreditPoints.
     * 
     */
    public void setWeightDischargeCreditPoints(double value) {
        this.weightDischargeCreditPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightExchangePrizePoints.
     * 
     */
    public double getWeightExchangePrizePoints() {
        return weightExchangePrizePoints;
    }

    /**
     * Define el valor de la propiedad weightExchangePrizePoints.
     * 
     */
    public void setWeightExchangePrizePoints(double value) {
        this.weightExchangePrizePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightExchangePrizeMoney.
     * 
     */
    public double getWeightExchangePrizeMoney() {
        return weightExchangePrizeMoney;
    }

    /**
     * Define el valor de la propiedad weightExchangePrizeMoney.
     * 
     */
    public void setWeightExchangePrizeMoney(double value) {
        this.weightExchangePrizeMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsInActivation.
     * 
     */
    public double getPointsInActivation() {
        return pointsInActivation;
    }

    /**
     * Define el valor de la propiedad pointsInActivation.
     * 
     */
    public void setPointsInActivation(double value) {
        this.pointsInActivation = value;
    }

    /**
     * Obtiene el valor de la propiedad initialCharge.
     * 
     */
    public double getInitialCharge() {
        return initialCharge;
    }

    /**
     * Define el valor de la propiedad initialCharge.
     * 
     */
    public void setInitialCharge(double value) {
        this.initialCharge = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     */
    public long getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     */
    public void setCurrencyId(long value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencySymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Define el valor de la propiedad currencySymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Obtiene el valor de la propiedad minLimitDischargePoint.
     * 
     */
    public double getMinLimitDischargePoint() {
        return minLimitDischargePoint;
    }

    /**
     * Define el valor de la propiedad minLimitDischargePoint.
     * 
     */
    public void setMinLimitDischargePoint(double value) {
        this.minLimitDischargePoint = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueMoneyCashBack.
     * 
     */
    public double getWeightPointValueMoneyCashBack() {
        return weightPointValueMoneyCashBack;
    }

    /**
     * Define el valor de la propiedad weightPointValueMoneyCashBack.
     * 
     */
    public void setWeightPointValueMoneyCashBack(double value) {
        this.weightPointValueMoneyCashBack = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValuePointsCashBack.
     * 
     */
    public double getWeightPointValuePointsCashBack() {
        return weightPointValuePointsCashBack;
    }

    /**
     * Define el valor de la propiedad weightPointValuePointsCashBack.
     * 
     */
    public void setWeightPointValuePointsCashBack(double value) {
        this.weightPointValuePointsCashBack = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueBPMoney.
     * 
     */
    public double getWeightPointValueBPMoney() {
        return weightPointValueBPMoney;
    }

    /**
     * Define el valor de la propiedad weightPointValueBPMoney.
     * 
     */
    public void setWeightPointValueBPMoney(double value) {
        this.weightPointValueBPMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointValueBPPoints.
     * 
     */
    public double getWeightPointValueBPPoints() {
        return weightPointValueBPPoints;
    }

    /**
     * Define el valor de la propiedad weightPointValueBPPoints.
     * 
     */
    public void setWeightPointValueBPPoints(double value) {
        this.weightPointValueBPPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointPurchaseMoney.
     * 
     */
    public double getWeightPointPurchaseMoney() {
        return weightPointPurchaseMoney;
    }

    /**
     * Define el valor de la propiedad weightPointPurchaseMoney.
     * 
     */
    public void setWeightPointPurchaseMoney(double value) {
        this.weightPointPurchaseMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad weightPointPurchasePoints.
     * 
     */
    public double getWeightPointPurchasePoints() {
        return weightPointPurchasePoints;
    }

    /**
     * Define el valor de la propiedad weightPointPurchasePoints.
     * 
     */
    public void setWeightPointPurchasePoints(double value) {
        this.weightPointPurchasePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointPurchaseDay.
     * 
     */
    public double getLimitPointPurchaseDay() {
        return limitPointPurchaseDay;
    }

    /**
     * Define el valor de la propiedad limitPointPurchaseDay.
     * 
     */
    public void setLimitPointPurchaseDay(double value) {
        this.limitPointPurchaseDay = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointPurchaseWeek.
     * 
     */
    public double getLimitPointPurchaseWeek() {
        return limitPointPurchaseWeek;
    }

    /**
     * Define el valor de la propiedad limitPointPurchaseWeek.
     * 
     */
    public void setLimitPointPurchaseWeek(double value) {
        this.limitPointPurchaseWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointPurchaseMonth.
     * 
     */
    public double getLimitPointPurchaseMonth() {
        return limitPointPurchaseMonth;
    }

    /**
     * Define el valor de la propiedad limitPointPurchaseMonth.
     * 
     */
    public void setLimitPointPurchaseMonth(double value) {
        this.limitPointPurchaseMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointPurchaseGeneral.
     * 
     */
    public double getLimitPointPurchaseGeneral() {
        return limitPointPurchaseGeneral;
    }

    /**
     * Define el valor de la propiedad limitPointPurchaseGeneral.
     * 
     */
    public void setLimitPointPurchaseGeneral(double value) {
        this.limitPointPurchaseGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransReciverDay.
     * 
     */
    public double getLimitPointTransReciverDay() {
        return limitPointTransReciverDay;
    }

    /**
     * Define el valor de la propiedad limitPointTransReciverDay.
     * 
     */
    public void setLimitPointTransReciverDay(double value) {
        this.limitPointTransReciverDay = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransReciverWeek.
     * 
     */
    public double getLimitPointTransReciverWeek() {
        return limitPointTransReciverWeek;
    }

    /**
     * Define el valor de la propiedad limitPointTransReciverWeek.
     * 
     */
    public void setLimitPointTransReciverWeek(double value) {
        this.limitPointTransReciverWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransReciverMonth.
     * 
     */
    public double getLimitPointTransReciverMonth() {
        return limitPointTransReciverMonth;
    }

    /**
     * Define el valor de la propiedad limitPointTransReciverMonth.
     * 
     */
    public void setLimitPointTransReciverMonth(double value) {
        this.limitPointTransReciverMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransReciverGeneral.
     * 
     */
    public double getLimitPointTransReciverGeneral() {
        return limitPointTransReciverGeneral;
    }

    /**
     * Define el valor de la propiedad limitPointTransReciverGeneral.
     * 
     */
    public void setLimitPointTransReciverGeneral(double value) {
        this.limitPointTransReciverGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransIssuedDay.
     * 
     */
    public double getLimitPointTransIssuedDay() {
        return limitPointTransIssuedDay;
    }

    /**
     * Define el valor de la propiedad limitPointTransIssuedDay.
     * 
     */
    public void setLimitPointTransIssuedDay(double value) {
        this.limitPointTransIssuedDay = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransIssuedWeek.
     * 
     */
    public double getLimitPointTransIssuedWeek() {
        return limitPointTransIssuedWeek;
    }

    /**
     * Define el valor de la propiedad limitPointTransIssuedWeek.
     * 
     */
    public void setLimitPointTransIssuedWeek(double value) {
        this.limitPointTransIssuedWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransIssuedMonth.
     * 
     */
    public double getLimitPointTransIssuedMonth() {
        return limitPointTransIssuedMonth;
    }

    /**
     * Define el valor de la propiedad limitPointTransIssuedMonth.
     * 
     */
    public void setLimitPointTransIssuedMonth(double value) {
        this.limitPointTransIssuedMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointTransIssuedGeneral.
     * 
     */
    public double getLimitPointTransIssuedGeneral() {
        return limitPointTransIssuedGeneral;
    }

    /**
     * Define el valor de la propiedad limitPointTransIssuedGeneral.
     * 
     */
    public void setLimitPointTransIssuedGeneral(double value) {
        this.limitPointTransIssuedGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointDay.
     * 
     */
    public double getLimitPointDay() {
        return limitPointDay;
    }

    /**
     * Define el valor de la propiedad limitPointDay.
     * 
     */
    public void setLimitPointDay(double value) {
        this.limitPointDay = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointWeek.
     * 
     */
    public double getLimitPointWeek() {
        return limitPointWeek;
    }

    /**
     * Define el valor de la propiedad limitPointWeek.
     * 
     */
    public void setLimitPointWeek(double value) {
        this.limitPointWeek = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointMonth.
     * 
     */
    public double getLimitPointMonth() {
        return limitPointMonth;
    }

    /**
     * Define el valor de la propiedad limitPointMonth.
     * 
     */
    public void setLimitPointMonth(double value) {
        this.limitPointMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad limitPointGeneral.
     * 
     */
    public double getLimitPointGeneral() {
        return limitPointGeneral;
    }

    /**
     * Define el valor de la propiedad limitPointGeneral.
     * 
     */
    public void setLimitPointGeneral(double value) {
        this.limitPointGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad movKindChargePointsByDay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovKindChargePointsByDay() {
        return movKindChargePointsByDay;
    }

    /**
     * Define el valor de la propiedad movKindChargePointsByDay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovKindChargePointsByDay(String value) {
        this.movKindChargePointsByDay = value;
    }

    /**
     * Obtiene el valor de la propiedad movKindChargePointsByMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovKindChargePointsByMonth() {
        return movKindChargePointsByMonth;
    }

    /**
     * Define el valor de la propiedad movKindChargePointsByMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovKindChargePointsByMonth(String value) {
        this.movKindChargePointsByMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad movKindChargePointsByGeneral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovKindChargePointsByGeneral() {
        return movKindChargePointsByGeneral;
    }

    /**
     * Define el valor de la propiedad movKindChargePointsByGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovKindChargePointsByGeneral(String value) {
        this.movKindChargePointsByGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad movKindChargePointsByWeek.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovKindChargePointsByWeek() {
        return movKindChargePointsByWeek;
    }

    /**
     * Define el valor de la propiedad movKindChargePointsByWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovKindChargePointsByWeek(String value) {
        this.movKindChargePointsByWeek = value;
    }

}

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
 * <p>Clase Java para WS_ShopByCampaign complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ShopByCampaign"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cardsCharged" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cardsEmitted" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="balancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="balanceCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="balanceCreditsGift" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="balanceCards" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShopByCampaign", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "campaignId",
    "shopId",
    "name",
    "chargedPoints",
    "dischargedPoints",
    "chargedCredits",
    "dischargedCredits",
    "chargedCreditsGift",
    "dischargedCreditsGift",
    "chargedPointsStatus",
    "dischargedPointsStatus",
    "cardsCharged",
    "cardsEmitted",
    "balancePoints",
    "balanceCredits",
    "balanceCreditsGift",
    "balanceCards"
})
public class WSShopByCampaign {

    protected long campaignId;
    protected long shopId;
    @XmlElement(required = true)
    protected String name;
    protected double chargedPoints;
    protected double dischargedPoints;
    protected double chargedCredits;
    protected double dischargedCredits;
    protected double chargedCreditsGift;
    protected double dischargedCreditsGift;
    protected double chargedPointsStatus;
    protected double dischargedPointsStatus;
    protected long cardsCharged;
    protected long cardsEmitted;
    protected double balancePoints;
    protected double balanceCredits;
    protected double balanceCreditsGift;
    protected int balanceCards;

    /**
     * Obtiene el valor de la propiedad campaignId.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Define el valor de la propiedad campaignId.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
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
     * Obtiene el valor de la propiedad chargedPoints.
     * 
     */
    public double getChargedPoints() {
        return chargedPoints;
    }

    /**
     * Define el valor de la propiedad chargedPoints.
     * 
     */
    public void setChargedPoints(double value) {
        this.chargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPoints.
     * 
     */
    public double getDischargedPoints() {
        return dischargedPoints;
    }

    /**
     * Define el valor de la propiedad dischargedPoints.
     * 
     */
    public void setDischargedPoints(double value) {
        this.dischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedCredits.
     * 
     */
    public double getChargedCredits() {
        return chargedCredits;
    }

    /**
     * Define el valor de la propiedad chargedCredits.
     * 
     */
    public void setChargedCredits(double value) {
        this.chargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedCredits.
     * 
     */
    public double getDischargedCredits() {
        return dischargedCredits;
    }

    /**
     * Define el valor de la propiedad dischargedCredits.
     * 
     */
    public void setDischargedCredits(double value) {
        this.dischargedCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedCreditsGift.
     * 
     */
    public double getChargedCreditsGift() {
        return chargedCreditsGift;
    }

    /**
     * Define el valor de la propiedad chargedCreditsGift.
     * 
     */
    public void setChargedCreditsGift(double value) {
        this.chargedCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedCreditsGift.
     * 
     */
    public double getDischargedCreditsGift() {
        return dischargedCreditsGift;
    }

    /**
     * Define el valor de la propiedad dischargedCreditsGift.
     * 
     */
    public void setDischargedCreditsGift(double value) {
        this.dischargedCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad chargedPointsStatus.
     * 
     */
    public double getChargedPointsStatus() {
        return chargedPointsStatus;
    }

    /**
     * Define el valor de la propiedad chargedPointsStatus.
     * 
     */
    public void setChargedPointsStatus(double value) {
        this.chargedPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad dischargedPointsStatus.
     * 
     */
    public double getDischargedPointsStatus() {
        return dischargedPointsStatus;
    }

    /**
     * Define el valor de la propiedad dischargedPointsStatus.
     * 
     */
    public void setDischargedPointsStatus(double value) {
        this.dischargedPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsCharged.
     * 
     */
    public long getCardsCharged() {
        return cardsCharged;
    }

    /**
     * Define el valor de la propiedad cardsCharged.
     * 
     */
    public void setCardsCharged(long value) {
        this.cardsCharged = value;
    }

    /**
     * Obtiene el valor de la propiedad cardsEmitted.
     * 
     */
    public long getCardsEmitted() {
        return cardsEmitted;
    }

    /**
     * Define el valor de la propiedad cardsEmitted.
     * 
     */
    public void setCardsEmitted(long value) {
        this.cardsEmitted = value;
    }

    /**
     * Obtiene el valor de la propiedad balancePoints.
     * 
     */
    public double getBalancePoints() {
        return balancePoints;
    }

    /**
     * Define el valor de la propiedad balancePoints.
     * 
     */
    public void setBalancePoints(double value) {
        this.balancePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCredits.
     * 
     */
    public double getBalanceCredits() {
        return balanceCredits;
    }

    /**
     * Define el valor de la propiedad balanceCredits.
     * 
     */
    public void setBalanceCredits(double value) {
        this.balanceCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCreditsGift.
     * 
     */
    public double getBalanceCreditsGift() {
        return balanceCreditsGift;
    }

    /**
     * Define el valor de la propiedad balanceCreditsGift.
     * 
     */
    public void setBalanceCreditsGift(double value) {
        this.balanceCreditsGift = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceCards.
     * 
     */
    public int getBalanceCards() {
        return balanceCards;
    }

    /**
     * Define el valor de la propiedad balanceCards.
     * 
     */
    public void setBalanceCards(int value) {
        this.balanceCards = value;
    }

}

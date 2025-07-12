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
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="customerUserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="periodToExpired" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="badgesWons" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pointBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="accumulatedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="redeemedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="expiredPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currentBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="balanceStatusPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="currentLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="missingStatusPointsToChangeLevel" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="missingBadgesToChangeLevel" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pendingBadges" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pointsToExpire" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="initialBalancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="finalBalancePoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "customerId",
    "customerUserName",
    "customerName",
    "customerSurname",
    "customerCard",
    "periodToExpired",
    "badgesWons",
    "pointBalance",
    "accumulatedPoints",
    "redeemedPoints",
    "expiredPoints",
    "currentBalance",
    "balanceStatusPoints",
    "currentLevel",
    "missingStatusPointsToChangeLevel",
    "missingBadgesToChangeLevel",
    "pendingBadges",
    "link",
    "pointsToExpire",
    "initialBalancePoints",
    "finalBalancePoints"
})
@XmlRootElement(name = "GetAccountStateByCustomerResponse")
public class GetAccountStateByCustomerResponse {

    protected int answerCode;
    protected long customerId;
    @XmlElement(required = true)
    protected String customerUserName;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected String customerSurname;
    @XmlElement(required = true)
    protected String customerCard;
    @XmlElement(required = true)
    protected String periodToExpired;
    @XmlElement(required = true)
    protected List<String> badgesWons;
    protected double pointBalance;
    protected double accumulatedPoints;
    protected double redeemedPoints;
    protected double expiredPoints;
    protected double currentBalance;
    protected double balanceStatusPoints;
    @XmlElement(required = true)
    protected String currentLevel;
    protected double missingStatusPointsToChangeLevel;
    @XmlElement(required = true)
    protected List<String> missingBadgesToChangeLevel;
    @XmlElement(required = true)
    protected List<String> pendingBadges;
    @XmlElement(required = true)
    protected String link;
    protected double pointsToExpire;
    protected double initialBalancePoints;
    protected double finalBalancePoints;

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
     * Obtiene el valor de la propiedad customerId.
     * 
     */
    public long getCustomerId() {
        return customerId;
    }

    /**
     * Define el valor de la propiedad customerId.
     * 
     */
    public void setCustomerId(long value) {
        this.customerId = value;
    }

    /**
     * Obtiene el valor de la propiedad customerUserName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    /**
     * Define el valor de la propiedad customerUserName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserName(String value) {
        this.customerUserName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define el valor de la propiedad customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtiene el valor de la propiedad customerSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSurname() {
        return customerSurname;
    }

    /**
     * Define el valor de la propiedad customerSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSurname(String value) {
        this.customerSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad customerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCard() {
        return customerCard;
    }

    /**
     * Define el valor de la propiedad customerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCard(String value) {
        this.customerCard = value;
    }

    /**
     * Obtiene el valor de la propiedad periodToExpired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodToExpired() {
        return periodToExpired;
    }

    /**
     * Define el valor de la propiedad periodToExpired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodToExpired(String value) {
        this.periodToExpired = value;
    }

    /**
     * Gets the value of the badgesWons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the badgesWons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBadgesWons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBadgesWons() {
        if (badgesWons == null) {
            badgesWons = new ArrayList<String>();
        }
        return this.badgesWons;
    }

    /**
     * Obtiene el valor de la propiedad pointBalance.
     * 
     */
    public double getPointBalance() {
        return pointBalance;
    }

    /**
     * Define el valor de la propiedad pointBalance.
     * 
     */
    public void setPointBalance(double value) {
        this.pointBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad accumulatedPoints.
     * 
     */
    public double getAccumulatedPoints() {
        return accumulatedPoints;
    }

    /**
     * Define el valor de la propiedad accumulatedPoints.
     * 
     */
    public void setAccumulatedPoints(double value) {
        this.accumulatedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad redeemedPoints.
     * 
     */
    public double getRedeemedPoints() {
        return redeemedPoints;
    }

    /**
     * Define el valor de la propiedad redeemedPoints.
     * 
     */
    public void setRedeemedPoints(double value) {
        this.redeemedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad expiredPoints.
     * 
     */
    public double getExpiredPoints() {
        return expiredPoints;
    }

    /**
     * Define el valor de la propiedad expiredPoints.
     * 
     */
    public void setExpiredPoints(double value) {
        this.expiredPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad currentBalance.
     * 
     */
    public double getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Define el valor de la propiedad currentBalance.
     * 
     */
    public void setCurrentBalance(double value) {
        this.currentBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceStatusPoints.
     * 
     */
    public double getBalanceStatusPoints() {
        return balanceStatusPoints;
    }

    /**
     * Define el valor de la propiedad balanceStatusPoints.
     * 
     */
    public void setBalanceStatusPoints(double value) {
        this.balanceStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad currentLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Define el valor de la propiedad currentLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentLevel(String value) {
        this.currentLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad missingStatusPointsToChangeLevel.
     * 
     */
    public double getMissingStatusPointsToChangeLevel() {
        return missingStatusPointsToChangeLevel;
    }

    /**
     * Define el valor de la propiedad missingStatusPointsToChangeLevel.
     * 
     */
    public void setMissingStatusPointsToChangeLevel(double value) {
        this.missingStatusPointsToChangeLevel = value;
    }

    /**
     * Gets the value of the missingBadgesToChangeLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingBadgesToChangeLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingBadgesToChangeLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMissingBadgesToChangeLevel() {
        if (missingBadgesToChangeLevel == null) {
            missingBadgesToChangeLevel = new ArrayList<String>();
        }
        return this.missingBadgesToChangeLevel;
    }

    /**
     * Gets the value of the pendingBadges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pendingBadges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPendingBadges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPendingBadges() {
        if (pendingBadges == null) {
            pendingBadges = new ArrayList<String>();
        }
        return this.pendingBadges;
    }

    /**
     * Obtiene el valor de la propiedad link.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Define el valor de la propiedad link.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsToExpire.
     * 
     */
    public double getPointsToExpire() {
        return pointsToExpire;
    }

    /**
     * Define el valor de la propiedad pointsToExpire.
     * 
     */
    public void setPointsToExpire(double value) {
        this.pointsToExpire = value;
    }

    /**
     * Obtiene el valor de la propiedad initialBalancePoints.
     * 
     */
    public double getInitialBalancePoints() {
        return initialBalancePoints;
    }

    /**
     * Define el valor de la propiedad initialBalancePoints.
     * 
     */
    public void setInitialBalancePoints(double value) {
        this.initialBalancePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad finalBalancePoints.
     * 
     */
    public double getFinalBalancePoints() {
        return finalBalancePoints;
    }

    /**
     * Define el valor de la propiedad finalBalancePoints.
     * 
     */
    public void setFinalBalancePoints(double value) {
        this.finalBalancePoints = value;
    }

}

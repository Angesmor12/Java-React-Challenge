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
 * <p>Clase Java para WS_Movement complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_Movement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaign" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="terminal" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="netId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shopForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="netForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="terminalForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="card" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardOld" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customer" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="customerForeignId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerSurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="chargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedGiftCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="chargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedGiftCredits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dischargedPointsStatus" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="totalBenefits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ticketId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paymentMethods" type="{http://FidelyNET3_SW_01_89_00}WS_PurchasePaymentMethod" maxOccurs="unbounded"/&gt;
 *         &lt;element name="kindCharge" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="operatorForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productList" type="{http://FidelyNET3_SW_01_89_00}WS_Product4Sale" maxOccurs="unbounded"/&gt;
 *         &lt;element name="exchangedPrizeList" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrize" maxOccurs="unbounded"/&gt;
 *         &lt;element name="causeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="periodId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promotionErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sellerId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sellerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellerSurname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sellerCard" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="conceptList" type="{http://FidelyNET3_SW_01_89_00}WS_ConceptList" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pointsBenefits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="discountBenefits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="foreignPeriodId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="foreignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="forGift" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalMoneyPaid" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="useFeeFix" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Movement", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaign",
    "terminal",
    "shopId",
    "netId",
    "shopForeignId",
    "netForeignId",
    "terminalForeignId",
    "card",
    "cardOld",
    "kind",
    "customer",
    "customerForeignId",
    "customerName",
    "customerSurname",
    "dateTime",
    "localTime",
    "chargedCredits",
    "chargedGiftCredits",
    "chargedPoints",
    "chargedPointsStatus",
    "dischargedCredits",
    "dischargedGiftCredits",
    "dischargedPoints",
    "dischargedPointsStatus",
    "totalMoney",
    "totalBenefits",
    "notes",
    "discount",
    "ticketId",
    "paymentMethods",
    "kindCharge",
    "operatorForeignId",
    "productList",
    "exchangedPrizeList",
    "causeId",
    "periodId",
    "promotionErrorCode",
    "sellerId",
    "sellerName",
    "sellerSurname",
    "sellerCard",
    "conceptList",
    "pointsBenefits",
    "discountBenefits",
    "foreignPeriodId",
    "foreignId",
    "forGift",
    "totalMoneyPaid",
    "useFeeFix"
})
public class WSMovement {

    protected long id;
    protected long campaign;
    protected long terminal;
    protected long shopId;
    protected long netId;
    protected long shopForeignId;
    protected long netForeignId;
    protected long terminalForeignId;
    @XmlElement(required = true)
    protected String card;
    @XmlElement(required = true)
    protected String cardOld;
    protected int kind;
    protected long customer;
    @XmlElement(required = true)
    protected String customerForeignId;
    @XmlElement(required = true)
    protected String customerName;
    @XmlElement(required = true)
    protected String customerSurname;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar localTime;
    protected double chargedCredits;
    protected double chargedGiftCredits;
    protected double chargedPoints;
    protected double chargedPointsStatus;
    protected double dischargedCredits;
    protected double dischargedGiftCredits;
    protected double dischargedPoints;
    protected double dischargedPointsStatus;
    protected double totalMoney;
    protected double totalBenefits;
    @XmlElement(required = true)
    protected String notes;
    protected double discount;
    @XmlElement(required = true)
    protected String ticketId;
    @XmlElement(required = true)
    protected List<WSPurchasePaymentMethod> paymentMethods;
    protected long kindCharge;
    protected long operatorForeignId;
    @XmlElement(required = true)
    protected List<WSProduct4Sale> productList;
    @XmlElement(required = true)
    protected List<WSExchangedPrize> exchangedPrizeList;
    protected long causeId;
    protected long periodId;
    protected int promotionErrorCode;
    protected long sellerId;
    @XmlElement(required = true)
    protected String sellerName;
    @XmlElement(required = true)
    protected String sellerSurname;
    @XmlElement(required = true)
    protected String sellerCard;
    @XmlElement(required = true)
    protected List<WSConceptList> conceptList;
    protected double pointsBenefits;
    protected double discountBenefits;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long foreignPeriodId;
    protected long foreignId;
    protected boolean forGift;
    protected double totalMoneyPaid;
    protected boolean useFeeFix;

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
     * Obtiene el valor de la propiedad campaign.
     * 
     */
    public long getCampaign() {
        return campaign;
    }

    /**
     * Define el valor de la propiedad campaign.
     * 
     */
    public void setCampaign(long value) {
        this.campaign = value;
    }

    /**
     * Obtiene el valor de la propiedad terminal.
     * 
     */
    public long getTerminal() {
        return terminal;
    }

    /**
     * Define el valor de la propiedad terminal.
     * 
     */
    public void setTerminal(long value) {
        this.terminal = value;
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
     * Obtiene el valor de la propiedad netId.
     * 
     */
    public long getNetId() {
        return netId;
    }

    /**
     * Define el valor de la propiedad netId.
     * 
     */
    public void setNetId(long value) {
        this.netId = value;
    }

    /**
     * Obtiene el valor de la propiedad shopForeignId.
     * 
     */
    public long getShopForeignId() {
        return shopForeignId;
    }

    /**
     * Define el valor de la propiedad shopForeignId.
     * 
     */
    public void setShopForeignId(long value) {
        this.shopForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad netForeignId.
     * 
     */
    public long getNetForeignId() {
        return netForeignId;
    }

    /**
     * Define el valor de la propiedad netForeignId.
     * 
     */
    public void setNetForeignId(long value) {
        this.netForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalForeignId.
     * 
     */
    public long getTerminalForeignId() {
        return terminalForeignId;
    }

    /**
     * Define el valor de la propiedad terminalForeignId.
     * 
     */
    public void setTerminalForeignId(long value) {
        this.terminalForeignId = value;
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
     * Obtiene el valor de la propiedad cardOld.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardOld() {
        return cardOld;
    }

    /**
     * Define el valor de la propiedad cardOld.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardOld(String value) {
        this.cardOld = value;
    }

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
     * Obtiene el valor de la propiedad customer.
     * 
     */
    public long getCustomer() {
        return customer;
    }

    /**
     * Define el valor de la propiedad customer.
     * 
     */
    public void setCustomer(long value) {
        this.customer = value;
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
     * Obtiene el valor de la propiedad dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Define el valor de la propiedad dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad localTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocalTime() {
        return localTime;
    }

    /**
     * Define el valor de la propiedad localTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocalTime(XMLGregorianCalendar value) {
        this.localTime = value;
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
     * Obtiene el valor de la propiedad chargedGiftCredits.
     * 
     */
    public double getChargedGiftCredits() {
        return chargedGiftCredits;
    }

    /**
     * Define el valor de la propiedad chargedGiftCredits.
     * 
     */
    public void setChargedGiftCredits(double value) {
        this.chargedGiftCredits = value;
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
     * Obtiene el valor de la propiedad dischargedGiftCredits.
     * 
     */
    public double getDischargedGiftCredits() {
        return dischargedGiftCredits;
    }

    /**
     * Define el valor de la propiedad dischargedGiftCredits.
     * 
     */
    public void setDischargedGiftCredits(double value) {
        this.dischargedGiftCredits = value;
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
     * Obtiene el valor de la propiedad totalMoney.
     * 
     */
    public double getTotalMoney() {
        return totalMoney;
    }

    /**
     * Define el valor de la propiedad totalMoney.
     * 
     */
    public void setTotalMoney(double value) {
        this.totalMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad totalBenefits.
     * 
     */
    public double getTotalBenefits() {
        return totalBenefits;
    }

    /**
     * Define el valor de la propiedad totalBenefits.
     * 
     */
    public void setTotalBenefits(double value) {
        this.totalBenefits = value;
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
     * Obtiene el valor de la propiedad discount.
     * 
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     */
    public void setDiscount(double value) {
        this.discount = value;
    }

    /**
     * Obtiene el valor de la propiedad ticketId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Define el valor de la propiedad ticketId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketId(String value) {
        this.ticketId = value;
    }

    /**
     * Gets the value of the paymentMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPurchasePaymentMethod }
     * 
     * 
     */
    public List<WSPurchasePaymentMethod> getPaymentMethods() {
        if (paymentMethods == null) {
            paymentMethods = new ArrayList<WSPurchasePaymentMethod>();
        }
        return this.paymentMethods;
    }

    /**
     * Obtiene el valor de la propiedad kindCharge.
     * 
     */
    public long getKindCharge() {
        return kindCharge;
    }

    /**
     * Define el valor de la propiedad kindCharge.
     * 
     */
    public void setKindCharge(long value) {
        this.kindCharge = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorForeignId.
     * 
     */
    public long getOperatorForeignId() {
        return operatorForeignId;
    }

    /**
     * Define el valor de la propiedad operatorForeignId.
     * 
     */
    public void setOperatorForeignId(long value) {
        this.operatorForeignId = value;
    }

    /**
     * Gets the value of the productList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSProduct4Sale }
     * 
     * 
     */
    public List<WSProduct4Sale> getProductList() {
        if (productList == null) {
            productList = new ArrayList<WSProduct4Sale>();
        }
        return this.productList;
    }

    /**
     * Gets the value of the exchangedPrizeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangedPrizeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangedPrizeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangedPrize }
     * 
     * 
     */
    public List<WSExchangedPrize> getExchangedPrizeList() {
        if (exchangedPrizeList == null) {
            exchangedPrizeList = new ArrayList<WSExchangedPrize>();
        }
        return this.exchangedPrizeList;
    }

    /**
     * Obtiene el valor de la propiedad causeId.
     * 
     */
    public long getCauseId() {
        return causeId;
    }

    /**
     * Define el valor de la propiedad causeId.
     * 
     */
    public void setCauseId(long value) {
        this.causeId = value;
    }

    /**
     * Obtiene el valor de la propiedad periodId.
     * 
     */
    public long getPeriodId() {
        return periodId;
    }

    /**
     * Define el valor de la propiedad periodId.
     * 
     */
    public void setPeriodId(long value) {
        this.periodId = value;
    }

    /**
     * Obtiene el valor de la propiedad promotionErrorCode.
     * 
     */
    public int getPromotionErrorCode() {
        return promotionErrorCode;
    }

    /**
     * Define el valor de la propiedad promotionErrorCode.
     * 
     */
    public void setPromotionErrorCode(int value) {
        this.promotionErrorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerId.
     * 
     */
    public long getSellerId() {
        return sellerId;
    }

    /**
     * Define el valor de la propiedad sellerId.
     * 
     */
    public void setSellerId(long value) {
        this.sellerId = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Define el valor de la propiedad sellerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerName(String value) {
        this.sellerName = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerSurname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerSurname() {
        return sellerSurname;
    }

    /**
     * Define el valor de la propiedad sellerSurname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerSurname(String value) {
        this.sellerSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad sellerCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerCard() {
        return sellerCard;
    }

    /**
     * Define el valor de la propiedad sellerCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerCard(String value) {
        this.sellerCard = value;
    }

    /**
     * Gets the value of the conceptList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conceptList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConceptList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSConceptList }
     * 
     * 
     */
    public List<WSConceptList> getConceptList() {
        if (conceptList == null) {
            conceptList = new ArrayList<WSConceptList>();
        }
        return this.conceptList;
    }

    /**
     * Obtiene el valor de la propiedad pointsBenefits.
     * 
     */
    public double getPointsBenefits() {
        return pointsBenefits;
    }

    /**
     * Define el valor de la propiedad pointsBenefits.
     * 
     */
    public void setPointsBenefits(double value) {
        this.pointsBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad discountBenefits.
     * 
     */
    public double getDiscountBenefits() {
        return discountBenefits;
    }

    /**
     * Define el valor de la propiedad discountBenefits.
     * 
     */
    public void setDiscountBenefits(double value) {
        this.discountBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignPeriodId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getForeignPeriodId() {
        return foreignPeriodId;
    }

    /**
     * Define el valor de la propiedad foreignPeriodId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setForeignPeriodId(Long value) {
        this.foreignPeriodId = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     */
    public long getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     */
    public void setForeignId(long value) {
        this.foreignId = value;
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
     * Obtiene el valor de la propiedad totalMoneyPaid.
     * 
     */
    public double getTotalMoneyPaid() {
        return totalMoneyPaid;
    }

    /**
     * Define el valor de la propiedad totalMoneyPaid.
     * 
     */
    public void setTotalMoneyPaid(double value) {
        this.totalMoneyPaid = value;
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

}

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="customerID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaignID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="initialDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="finalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="periodId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="periodForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productCategoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="productCategoryForeignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promotionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="advancePercentYear" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="advancePercentMonth" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="addGrouped" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="billingTargetKind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="conceptCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pagination" type="{http://FidelyNET3_SW_01_89_00}WS_PaginationResult"/&gt;
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
    "customerID",
    "campaignID",
    "initialDate",
    "finalDate",
    "periodId",
    "periodForeignId",
    "sku",
    "productCategoryId",
    "productCategoryForeignId",
    "promotionId",
    "advancePercentYear",
    "advancePercentMonth",
    "addGrouped",
    "billingTargetKind",
    "conceptCode",
    "pagination"
})
@XmlRootElement(name = "GetLastMovementsByCustomerRequest")
public class GetLastMovementsByCustomerRequest {

    @XmlElement(required = true)
    protected String sessionID;
    protected long customerID;
    protected long campaignID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finalDate;
    protected long periodId;
    protected long periodForeignId;
    @XmlElement(required = true)
    protected String sku;
    protected long productCategoryId;
    protected long productCategoryForeignId;
    protected long promotionId;
    protected long advancePercentYear;
    protected long advancePercentMonth;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean addGrouped;
    protected int billingTargetKind;
    @XmlElement(required = true)
    protected String conceptCode;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

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
     * Obtiene el valor de la propiedad campaignID.
     * 
     */
    public long getCampaignID() {
        return campaignID;
    }

    /**
     * Define el valor de la propiedad campaignID.
     * 
     */
    public void setCampaignID(long value) {
        this.campaignID = value;
    }

    /**
     * Obtiene el valor de la propiedad initialDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialDate() {
        return initialDate;
    }

    /**
     * Define el valor de la propiedad initialDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialDate(XMLGregorianCalendar value) {
        this.initialDate = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinalDate() {
        return finalDate;
    }

    /**
     * Define el valor de la propiedad finalDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinalDate(XMLGregorianCalendar value) {
        this.finalDate = value;
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
     * Obtiene el valor de la propiedad periodForeignId.
     * 
     */
    public long getPeriodForeignId() {
        return periodForeignId;
    }

    /**
     * Define el valor de la propiedad periodForeignId.
     * 
     */
    public void setPeriodForeignId(long value) {
        this.periodForeignId = value;
    }

    /**
     * Obtiene el valor de la propiedad sku.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Define el valor de la propiedad sku.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
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
     * Obtiene el valor de la propiedad promotionId.
     * 
     */
    public long getPromotionId() {
        return promotionId;
    }

    /**
     * Define el valor de la propiedad promotionId.
     * 
     */
    public void setPromotionId(long value) {
        this.promotionId = value;
    }

    /**
     * Obtiene el valor de la propiedad advancePercentYear.
     * 
     */
    public long getAdvancePercentYear() {
        return advancePercentYear;
    }

    /**
     * Define el valor de la propiedad advancePercentYear.
     * 
     */
    public void setAdvancePercentYear(long value) {
        this.advancePercentYear = value;
    }

    /**
     * Obtiene el valor de la propiedad advancePercentMonth.
     * 
     */
    public long getAdvancePercentMonth() {
        return advancePercentMonth;
    }

    /**
     * Define el valor de la propiedad advancePercentMonth.
     * 
     */
    public void setAdvancePercentMonth(long value) {
        this.advancePercentMonth = value;
    }

    /**
     * Obtiene el valor de la propiedad addGrouped.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddGrouped() {
        return addGrouped;
    }

    /**
     * Define el valor de la propiedad addGrouped.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddGrouped(Boolean value) {
        this.addGrouped = value;
    }

    /**
     * Obtiene el valor de la propiedad billingTargetKind.
     * 
     */
    public int getBillingTargetKind() {
        return billingTargetKind;
    }

    /**
     * Define el valor de la propiedad billingTargetKind.
     * 
     */
    public void setBillingTargetKind(int value) {
        this.billingTargetKind = value;
    }

    /**
     * Obtiene el valor de la propiedad conceptCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptCode() {
        return conceptCode;
    }

    /**
     * Define el valor de la propiedad conceptCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptCode(String value) {
        this.conceptCode = value;
    }

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link WSPaginationResult }
     *     
     */
    public WSPaginationResult getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaginationResult }
     *     
     */
    public void setPagination(WSPaginationResult value) {
        this.pagination = value;
    }

}

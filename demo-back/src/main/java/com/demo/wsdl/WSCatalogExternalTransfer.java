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
 * <p>Clase Java para WS_CatalogExternalTransfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CatalogExternalTransfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CatalogFlagsExternalTransfer"/&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pdfPath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="periods" type="{http://FidelyNET3_SW_01_89_00}WS_PeriodSimple" maxOccurs="unbounded"/&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="category" type="{http://FidelyNET3_SW_01_89_00}WS_ExternalTransfer_Category"/&gt;
 *         &lt;element name="pathImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="otherImages" type="{http://FidelyNET3_SW_01_89_00}WS_OtherImage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="externalTransferProviderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="lowerPointsLimit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="upperPointsLimit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="fixedPoints" type="{http://FidelyNET3_SW_01_89_00}WS_FixedPoints" maxOccurs="unbounded"/&gt;
 *         &lt;element name="transferDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="exchangeUnit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="categoriesWeight" type="{http://FidelyNET3_SW_01_89_00}WS_WeightExternalTransfer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="orderBy" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CatalogExternalTransfer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "description",
    "dateFrom",
    "dateTo",
    "flags",
    "campaignId",
    "pdfPath",
    "periods",
    "sku",
    "category",
    "pathImage",
    "otherImages",
    "stock",
    "externalTransferProviderId",
    "lowerPointsLimit",
    "upperPointsLimit",
    "fixedPoints",
    "transferDescription",
    "exchangeUnit",
    "categoriesWeight",
    "orderBy"
})
public class WSCatalogExternalTransfer {

    protected long id;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateTo;
    @XmlElement(required = true)
    protected WSCatalogFlagsExternalTransfer flags;
    protected long campaignId;
    @XmlElement(required = true)
    protected String pdfPath;
    @XmlElement(required = true)
    protected List<WSPeriodSimple> periods;
    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected WSExternalTransferCategory category;
    @XmlElement(required = true)
    protected String pathImage;
    @XmlElement(nillable = true)
    protected List<WSOtherImage> otherImages;
    protected long stock;
    protected long externalTransferProviderId;
    protected double lowerPointsLimit;
    protected double upperPointsLimit;
    @XmlElement(required = true)
    protected List<WSFixedPoints> fixedPoints;
    @XmlElement(required = true)
    protected String transferDescription;
    @XmlElement(required = true)
    protected String exchangeUnit;
    @XmlElement(required = true)
    protected List<WSWeightExternalTransfer> categoriesWeight;
    protected long orderBy;

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
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFrom(XMLGregorianCalendar value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTo(XMLGregorianCalendar value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCatalogFlagsExternalTransfer }
     *     
     */
    public WSCatalogFlagsExternalTransfer getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCatalogFlagsExternalTransfer }
     *     
     */
    public void setFlags(WSCatalogFlagsExternalTransfer value) {
        this.flags = value;
    }

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
     * Obtiene el valor de la propiedad pdfPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfPath() {
        return pdfPath;
    }

    /**
     * Define el valor de la propiedad pdfPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfPath(String value) {
        this.pdfPath = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPeriodSimple }
     * 
     * 
     */
    public List<WSPeriodSimple> getPeriods() {
        if (periods == null) {
            periods = new ArrayList<WSPeriodSimple>();
        }
        return this.periods;
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
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link WSExternalTransferCategory }
     *     
     */
    public WSExternalTransferCategory getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExternalTransferCategory }
     *     
     */
    public void setCategory(WSExternalTransferCategory value) {
        this.category = value;
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

    /**
     * Gets the value of the otherImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOtherImage }
     * 
     * 
     */
    public List<WSOtherImage> getOtherImages() {
        if (otherImages == null) {
            otherImages = new ArrayList<WSOtherImage>();
        }
        return this.otherImages;
    }

    /**
     * Obtiene el valor de la propiedad stock.
     * 
     */
    public long getStock() {
        return stock;
    }

    /**
     * Define el valor de la propiedad stock.
     * 
     */
    public void setStock(long value) {
        this.stock = value;
    }

    /**
     * Obtiene el valor de la propiedad externalTransferProviderId.
     * 
     */
    public long getExternalTransferProviderId() {
        return externalTransferProviderId;
    }

    /**
     * Define el valor de la propiedad externalTransferProviderId.
     * 
     */
    public void setExternalTransferProviderId(long value) {
        this.externalTransferProviderId = value;
    }

    /**
     * Obtiene el valor de la propiedad lowerPointsLimit.
     * 
     */
    public double getLowerPointsLimit() {
        return lowerPointsLimit;
    }

    /**
     * Define el valor de la propiedad lowerPointsLimit.
     * 
     */
    public void setLowerPointsLimit(double value) {
        this.lowerPointsLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad upperPointsLimit.
     * 
     */
    public double getUpperPointsLimit() {
        return upperPointsLimit;
    }

    /**
     * Define el valor de la propiedad upperPointsLimit.
     * 
     */
    public void setUpperPointsLimit(double value) {
        this.upperPointsLimit = value;
    }

    /**
     * Gets the value of the fixedPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixedPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixedPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSFixedPoints }
     * 
     * 
     */
    public List<WSFixedPoints> getFixedPoints() {
        if (fixedPoints == null) {
            fixedPoints = new ArrayList<WSFixedPoints>();
        }
        return this.fixedPoints;
    }

    /**
     * Obtiene el valor de la propiedad transferDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Define el valor de la propiedad transferDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDescription(String value) {
        this.transferDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad exchangeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeUnit() {
        return exchangeUnit;
    }

    /**
     * Define el valor de la propiedad exchangeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeUnit(String value) {
        this.exchangeUnit = value;
    }

    /**
     * Gets the value of the categoriesWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriesWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriesWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSWeightExternalTransfer }
     * 
     * 
     */
    public List<WSWeightExternalTransfer> getCategoriesWeight() {
        if (categoriesWeight == null) {
            categoriesWeight = new ArrayList<WSWeightExternalTransfer>();
        }
        return this.categoriesWeight;
    }

    /**
     * Obtiene el valor de la propiedad orderBy.
     * 
     */
    public long getOrderBy() {
        return orderBy;
    }

    /**
     * Define el valor de la propiedad orderBy.
     * 
     */
    public void setOrderBy(long value) {
        this.orderBy = value;
    }

}

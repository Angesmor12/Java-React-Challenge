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
 * <p>Clase Java para WS_NewsByCustomer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_NewsByCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="summaryText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fullText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imageHiperLink" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="viewDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="seen" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="seenCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="seenDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="newsCategory" type="{http://FidelyNET3_SW_01_89_00}WS_NewsCategory"/&gt;
 *         &lt;element name="seenList" type="{http://FidelyNET3_SW_01_89_00}WS_NewsSeen" maxOccurs="unbounded"/&gt;
 *         &lt;element name="imagesList" type="{http://FidelyNET3_SW_01_89_00}WS_NewsImages" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NewsByCustomer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "title",
    "summaryText",
    "fullText",
    "image",
    "imageHiperLink",
    "issuedDate",
    "viewDate",
    "expireDate",
    "campaignId",
    "seen",
    "seenCount",
    "seenDate",
    "newsCategory",
    "seenList",
    "imagesList"
})
public class WSNewsByCustomer {

    protected long id;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String summaryText;
    @XmlElement(required = true)
    protected String fullText;
    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String imageHiperLink;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issuedDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar viewDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expireDate;
    protected long campaignId;
    protected boolean seen;
    protected long seenCount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar seenDate;
    @XmlElement(required = true)
    protected WSNewsCategory newsCategory;
    @XmlElement(required = true)
    protected List<WSNewsSeen> seenList;
    @XmlElement(required = true)
    protected List<WSNewsImages> imagesList;

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
     * Obtiene el valor de la propiedad summaryText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummaryText() {
        return summaryText;
    }

    /**
     * Define el valor de la propiedad summaryText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummaryText(String value) {
        this.summaryText = value;
    }

    /**
     * Obtiene el valor de la propiedad fullText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullText() {
        return fullText;
    }

    /**
     * Define el valor de la propiedad fullText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullText(String value) {
        this.fullText = value;
    }

    /**
     * Obtiene el valor de la propiedad image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define el valor de la propiedad image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    /**
     * Obtiene el valor de la propiedad imageHiperLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageHiperLink() {
        return imageHiperLink;
    }

    /**
     * Define el valor de la propiedad imageHiperLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageHiperLink(String value) {
        this.imageHiperLink = value;
    }

    /**
     * Obtiene el valor de la propiedad issuedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedDate() {
        return issuedDate;
    }

    /**
     * Define el valor de la propiedad issuedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedDate(XMLGregorianCalendar value) {
        this.issuedDate = value;
    }

    /**
     * Obtiene el valor de la propiedad viewDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViewDate() {
        return viewDate;
    }

    /**
     * Define el valor de la propiedad viewDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViewDate(XMLGregorianCalendar value) {
        this.viewDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expireDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Define el valor de la propiedad expireDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
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
     * Obtiene el valor de la propiedad seen.
     * 
     */
    public boolean isSeen() {
        return seen;
    }

    /**
     * Define el valor de la propiedad seen.
     * 
     */
    public void setSeen(boolean value) {
        this.seen = value;
    }

    /**
     * Obtiene el valor de la propiedad seenCount.
     * 
     */
    public long getSeenCount() {
        return seenCount;
    }

    /**
     * Define el valor de la propiedad seenCount.
     * 
     */
    public void setSeenCount(long value) {
        this.seenCount = value;
    }

    /**
     * Obtiene el valor de la propiedad seenDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeenDate() {
        return seenDate;
    }

    /**
     * Define el valor de la propiedad seenDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeenDate(XMLGregorianCalendar value) {
        this.seenDate = value;
    }

    /**
     * Obtiene el valor de la propiedad newsCategory.
     * 
     * @return
     *     possible object is
     *     {@link WSNewsCategory }
     *     
     */
    public WSNewsCategory getNewsCategory() {
        return newsCategory;
    }

    /**
     * Define el valor de la propiedad newsCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNewsCategory }
     *     
     */
    public void setNewsCategory(WSNewsCategory value) {
        this.newsCategory = value;
    }

    /**
     * Gets the value of the seenList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seenList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeenList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSNewsSeen }
     * 
     * 
     */
    public List<WSNewsSeen> getSeenList() {
        if (seenList == null) {
            seenList = new ArrayList<WSNewsSeen>();
        }
        return this.seenList;
    }

    /**
     * Gets the value of the imagesList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagesList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagesList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSNewsImages }
     * 
     * 
     */
    public List<WSNewsImages> getImagesList() {
        if (imagesList == null) {
            imagesList = new ArrayList<WSNewsImages>();
        }
        return this.imagesList;
    }

}

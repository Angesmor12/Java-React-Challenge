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
 * <p>Clase Java para WS_Voucher complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_Voucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="voucherCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="urlImageWS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ignoreInPromotion" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="isByProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="productCategoryId" type="{http://FidelyNET3_SW_01_89_00}SW_CategoryVoucher" maxOccurs="unbounded"/&gt;
 *         &lt;element name="productsList" type="{http://FidelyNET3_SW_01_89_00}SW_ProductVoucher" maxOccurs="unbounded"/&gt;
 *         &lt;element name="prizeCatalogList" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeCatalogVoucher" maxOccurs="unbounded"/&gt;
 *         &lt;element name="applyInProducts" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="canUseVoucherOnlyInNet" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="netInUseId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nominal" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="foreignNetInUseId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="isByCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="applyInCheapestProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="applyinExpensiveProduct" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Voucher", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "voucherCode",
    "kind",
    "value",
    "urlImageWS",
    "title",
    "description",
    "ignoreInPromotion",
    "isByProduct",
    "productCategoryId",
    "productsList",
    "prizeCatalogList",
    "applyInProducts",
    "canUseVoucherOnlyInNet",
    "netInUseId",
    "nominal",
    "expirationDate",
    "foreignNetInUseId",
    "isByCategory",
    "applyInCheapestProduct",
    "applyinExpensiveProduct"
})
public class WSVoucher {

    protected long id;
    protected long voucherCode;
    protected long kind;
    protected double value;
    @XmlElement(required = true)
    protected String urlImageWS;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String description;
    protected long ignoreInPromotion;
    protected boolean isByProduct;
    @XmlElement(required = true)
    protected List<SWCategoryVoucher> productCategoryId;
    @XmlElement(required = true)
    protected List<SWProductVoucher> productsList;
    @XmlElement(required = true)
    protected List<WSPrizeCatalogVoucher> prizeCatalogList;
    protected int applyInProducts;
    protected boolean canUseVoucherOnlyInNet;
    protected long netInUseId;
    protected boolean nominal;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    protected long foreignNetInUseId;
    protected boolean isByCategory;
    protected boolean applyInCheapestProduct;
    protected boolean applyinExpensiveProduct;

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
     * Obtiene el valor de la propiedad voucherCode.
     * 
     */
    public long getVoucherCode() {
        return voucherCode;
    }

    /**
     * Define el valor de la propiedad voucherCode.
     * 
     */
    public void setVoucherCode(long value) {
        this.voucherCode = value;
    }

    /**
     * Obtiene el valor de la propiedad kind.
     * 
     */
    public long getKind() {
        return kind;
    }

    /**
     * Define el valor de la propiedad kind.
     * 
     */
    public void setKind(long value) {
        this.kind = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
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
     * Obtiene el valor de la propiedad ignoreInPromotion.
     * 
     */
    public long getIgnoreInPromotion() {
        return ignoreInPromotion;
    }

    /**
     * Define el valor de la propiedad ignoreInPromotion.
     * 
     */
    public void setIgnoreInPromotion(long value) {
        this.ignoreInPromotion = value;
    }

    /**
     * Obtiene el valor de la propiedad isByProduct.
     * 
     */
    public boolean isIsByProduct() {
        return isByProduct;
    }

    /**
     * Define el valor de la propiedad isByProduct.
     * 
     */
    public void setIsByProduct(boolean value) {
        this.isByProduct = value;
    }

    /**
     * Gets the value of the productCategoryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategoryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategoryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWCategoryVoucher }
     * 
     * 
     */
    public List<SWCategoryVoucher> getProductCategoryId() {
        if (productCategoryId == null) {
            productCategoryId = new ArrayList<SWCategoryVoucher>();
        }
        return this.productCategoryId;
    }

    /**
     * Gets the value of the productsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWProductVoucher }
     * 
     * 
     */
    public List<SWProductVoucher> getProductsList() {
        if (productsList == null) {
            productsList = new ArrayList<SWProductVoucher>();
        }
        return this.productsList;
    }

    /**
     * Gets the value of the prizeCatalogList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prizeCatalogList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrizeCatalogList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPrizeCatalogVoucher }
     * 
     * 
     */
    public List<WSPrizeCatalogVoucher> getPrizeCatalogList() {
        if (prizeCatalogList == null) {
            prizeCatalogList = new ArrayList<WSPrizeCatalogVoucher>();
        }
        return this.prizeCatalogList;
    }

    /**
     * Obtiene el valor de la propiedad applyInProducts.
     * 
     */
    public int getApplyInProducts() {
        return applyInProducts;
    }

    /**
     * Define el valor de la propiedad applyInProducts.
     * 
     */
    public void setApplyInProducts(int value) {
        this.applyInProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad canUseVoucherOnlyInNet.
     * 
     */
    public boolean isCanUseVoucherOnlyInNet() {
        return canUseVoucherOnlyInNet;
    }

    /**
     * Define el valor de la propiedad canUseVoucherOnlyInNet.
     * 
     */
    public void setCanUseVoucherOnlyInNet(boolean value) {
        this.canUseVoucherOnlyInNet = value;
    }

    /**
     * Obtiene el valor de la propiedad netInUseId.
     * 
     */
    public long getNetInUseId() {
        return netInUseId;
    }

    /**
     * Define el valor de la propiedad netInUseId.
     * 
     */
    public void setNetInUseId(long value) {
        this.netInUseId = value;
    }

    /**
     * Obtiene el valor de la propiedad nominal.
     * 
     */
    public boolean isNominal() {
        return nominal;
    }

    /**
     * Define el valor de la propiedad nominal.
     * 
     */
    public void setNominal(boolean value) {
        this.nominal = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignNetInUseId.
     * 
     */
    public long getForeignNetInUseId() {
        return foreignNetInUseId;
    }

    /**
     * Define el valor de la propiedad foreignNetInUseId.
     * 
     */
    public void setForeignNetInUseId(long value) {
        this.foreignNetInUseId = value;
    }

    /**
     * Obtiene el valor de la propiedad isByCategory.
     * 
     */
    public boolean isIsByCategory() {
        return isByCategory;
    }

    /**
     * Define el valor de la propiedad isByCategory.
     * 
     */
    public void setIsByCategory(boolean value) {
        this.isByCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad applyInCheapestProduct.
     * 
     */
    public boolean isApplyInCheapestProduct() {
        return applyInCheapestProduct;
    }

    /**
     * Define el valor de la propiedad applyInCheapestProduct.
     * 
     */
    public void setApplyInCheapestProduct(boolean value) {
        this.applyInCheapestProduct = value;
    }

    /**
     * Obtiene el valor de la propiedad applyinExpensiveProduct.
     * 
     */
    public boolean isApplyinExpensiveProduct() {
        return applyinExpensiveProduct;
    }

    /**
     * Define el valor de la propiedad applyinExpensiveProduct.
     * 
     */
    public void setApplyinExpensiveProduct(boolean value) {
        this.applyinExpensiveProduct = value;
    }

}

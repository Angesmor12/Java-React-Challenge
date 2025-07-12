//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ProductDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ProductDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="foreign_id" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="productCategorySpecialFeatureList" type="{http://FidelyNET3_SW_01_89_00}ProductCategorySpecialFeatureWithValue" maxOccurs="unbounded"/&gt;
 *         &lt;element name="path_image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="netId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="points" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ponderationMoney" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ponderationPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ProductDetail", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "code",
    "description",
    "name",
    "kind",
    "price",
    "amount",
    "foreignId",
    "productCategorySpecialFeatureList",
    "pathImage",
    "netId",
    "flags",
    "categoryId",
    "points",
    "ponderationMoney",
    "ponderationPoints"
})
public class WSProductDetail {

    protected long id;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String name;
    protected int kind;
    protected double price;
    protected float amount;
    @XmlElement(name = "foreign_id", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger foreignId;
    @XmlElement(required = true)
    protected List<ProductCategorySpecialFeatureWithValue> productCategorySpecialFeatureList;
    @XmlElement(name = "path_image", required = true)
    protected String pathImage;
    protected long netId;
    protected long flags;
    protected long categoryId;
    protected double points;
    protected double ponderationMoney;
    protected double ponderationPoints;

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
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Obtiene el valor de la propiedad price.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     */
    public float getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     */
    public void setAmount(float value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad foreignId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getForeignId() {
        return foreignId;
    }

    /**
     * Define el valor de la propiedad foreignId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setForeignId(BigInteger value) {
        this.foreignId = value;
    }

    /**
     * Gets the value of the productCategorySpecialFeatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategorySpecialFeatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategorySpecialFeatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategorySpecialFeatureWithValue }
     * 
     * 
     */
    public List<ProductCategorySpecialFeatureWithValue> getProductCategorySpecialFeatureList() {
        if (productCategorySpecialFeatureList == null) {
            productCategorySpecialFeatureList = new ArrayList<ProductCategorySpecialFeatureWithValue>();
        }
        return this.productCategorySpecialFeatureList;
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
     * Obtiene el valor de la propiedad flags.
     * 
     */
    public long getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     */
    public void setFlags(long value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad categoryId.
     * 
     */
    public long getCategoryId() {
        return categoryId;
    }

    /**
     * Define el valor de la propiedad categoryId.
     * 
     */
    public void setCategoryId(long value) {
        this.categoryId = value;
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
     * Obtiene el valor de la propiedad ponderationMoney.
     * 
     */
    public double getPonderationMoney() {
        return ponderationMoney;
    }

    /**
     * Define el valor de la propiedad ponderationMoney.
     * 
     */
    public void setPonderationMoney(double value) {
        this.ponderationMoney = value;
    }

    /**
     * Obtiene el valor de la propiedad ponderationPoints.
     * 
     */
    public double getPonderationPoints() {
        return ponderationPoints;
    }

    /**
     * Define el valor de la propiedad ponderationPoints.
     * 
     */
    public void setPonderationPoints(double value) {
        this.ponderationPoints = value;
    }

}

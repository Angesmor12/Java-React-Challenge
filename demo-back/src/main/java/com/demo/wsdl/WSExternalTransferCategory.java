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
 * <p>Clase Java para WS_ExternalTransfer_Category complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ExternalTransfer_Category"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idFather" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="imageFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_ExternalTransferCategoryFlags"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ExternalTransfer_Category", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "description",
    "idFather",
    "order",
    "imageFile",
    "flags"
})
public class WSExternalTransferCategory {

    protected long id;
    @XmlElement(required = true)
    protected String description;
    protected long idFather;
    protected long order;
    @XmlElement(required = true)
    protected String imageFile;
    @XmlElement(required = true)
    protected WSExternalTransferCategoryFlags flags;

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
     * Obtiene el valor de la propiedad idFather.
     * 
     */
    public long getIdFather() {
        return idFather;
    }

    /**
     * Define el valor de la propiedad idFather.
     * 
     */
    public void setIdFather(long value) {
        this.idFather = value;
    }

    /**
     * Obtiene el valor de la propiedad order.
     * 
     */
    public long getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     */
    public void setOrder(long value) {
        this.order = value;
    }

    /**
     * Obtiene el valor de la propiedad imageFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageFile() {
        return imageFile;
    }

    /**
     * Define el valor de la propiedad imageFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageFile(String value) {
        this.imageFile = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSExternalTransferCategoryFlags }
     *     
     */
    public WSExternalTransferCategoryFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSExternalTransferCategoryFlags }
     *     
     */
    public void setFlags(WSExternalTransferCategoryFlags value) {
        this.flags = value;
    }

}

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
 * <p>Clase Java para WS_CategoryByShop complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CategoryByShop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://FidelyNET3_SW_01_89_00}WS_CategoryByShopBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaign" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CategoryFlags"/&gt;
 *         &lt;element name="labelPointsValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="urlImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryByShop", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "code",
    "campaign",
    "name",
    "flags",
    "labelPointsValue",
    "urlImage"
})
public class WSCategoryByShop
    extends WSCategoryByShopBase
{

    protected long code;
    protected long campaign;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected WSCategoryFlags flags;
    @XmlElement(required = true)
    protected String labelPointsValue;
    @XmlElement(required = true)
    protected String urlImage;

    /**
     * Obtiene el valor de la propiedad code.
     * 
     */
    public long getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     */
    public void setCode(long value) {
        this.code = value;
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
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCategoryFlags }
     *     
     */
    public WSCategoryFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCategoryFlags }
     *     
     */
    public void setFlags(WSCategoryFlags value) {
        this.flags = value;
    }

    /**
     * Obtiene el valor de la propiedad labelPointsValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelPointsValue() {
        return labelPointsValue;
    }

    /**
     * Define el valor de la propiedad labelPointsValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelPointsValue(String value) {
        this.labelPointsValue = value;
    }

    /**
     * Obtiene el valor de la propiedad urlImage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImage() {
        return urlImage;
    }

    /**
     * Define el valor de la propiedad urlImage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImage(String value) {
        this.urlImage = value;
    }

}

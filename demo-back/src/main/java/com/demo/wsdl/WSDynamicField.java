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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_DynamicField complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_DynamicField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dictionaryKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldFlags"/&gt;
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="options" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldOption" maxOccurs="unbounded"/&gt;
 *         &lt;element name="representation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://FidelyNET3_SW_01_89_00}WS_DynamicFieldType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_DynamicField", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "campaignId",
    "name",
    "dictionaryKey",
    "defaultValue",
    "flags",
    "order",
    "options",
    "representation",
    "type"
})
public class WSDynamicField {

    protected long id;
    protected long campaignId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String dictionaryKey;
    @XmlElement(required = true)
    protected String defaultValue;
    @XmlElement(required = true)
    protected WSDynamicFieldFlags flags;
    protected long order;
    @XmlElement(required = true)
    protected List<WSDynamicFieldOption> options;
    protected int representation;
    @XmlElement(required = true)
    protected WSDynamicFieldType type;

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
     * Obtiene el valor de la propiedad dictionaryKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDictionaryKey() {
        return dictionaryKey;
    }

    /**
     * Define el valor de la propiedad dictionaryKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDictionaryKey(String value) {
        this.dictionaryKey = value;
    }

    /**
     * Obtiene el valor de la propiedad defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Define el valor de la propiedad defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSDynamicFieldFlags }
     *     
     */
    public WSDynamicFieldFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDynamicFieldFlags }
     *     
     */
    public void setFlags(WSDynamicFieldFlags value) {
        this.flags = value;
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
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDynamicFieldOption }
     * 
     * 
     */
    public List<WSDynamicFieldOption> getOptions() {
        if (options == null) {
            options = new ArrayList<WSDynamicFieldOption>();
        }
        return this.options;
    }

    /**
     * Obtiene el valor de la propiedad representation.
     * 
     */
    public int getRepresentation() {
        return representation;
    }

    /**
     * Define el valor de la propiedad representation.
     * 
     */
    public void setRepresentation(int value) {
        this.representation = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link WSDynamicFieldType }
     *     
     */
    public WSDynamicFieldType getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link WSDynamicFieldType }
     *     
     */
    public void setType(WSDynamicFieldType value) {
        this.type = value;
    }

}

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
 * <p>Clase Java para WS_NewsImages complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_NewsImages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imageHiperLink" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imageOrder" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NewsImages", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "image",
    "imageHiperLink",
    "imageOrder"
})
public class WSNewsImages {

    @XmlElement(required = true)
    protected String image;
    @XmlElement(required = true)
    protected String imageHiperLink;
    protected long imageOrder;

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
     * Obtiene el valor de la propiedad imageOrder.
     * 
     */
    public long getImageOrder() {
        return imageOrder;
    }

    /**
     * Define el valor de la propiedad imageOrder.
     * 
     */
    public void setImageOrder(long value) {
        this.imageOrder = value;
    }

}

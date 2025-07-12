//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_NetFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_NetFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="useProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useAmountProducts" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_NetFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "useProducts",
    "useAmountProducts"
})
public class WSNetFlags {

    protected long flags;
    protected boolean useProducts;
    protected boolean useAmountProducts;

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
     * Obtiene el valor de la propiedad useProducts.
     * 
     */
    public boolean isUseProducts() {
        return useProducts;
    }

    /**
     * Define el valor de la propiedad useProducts.
     * 
     */
    public void setUseProducts(boolean value) {
        this.useProducts = value;
    }

    /**
     * Obtiene el valor de la propiedad useAmountProducts.
     * 
     */
    public boolean isUseAmountProducts() {
        return useAmountProducts;
    }

    /**
     * Define el valor de la propiedad useAmountProducts.
     * 
     */
    public void setUseAmountProducts(boolean value) {
        this.useAmountProducts = value;
    }

}

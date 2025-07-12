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
 * <p>Clase Java para WS_CategoryByShopModify complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CategoryByShopModify"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://FidelyNET3_SW_01_89_00}WS_CategoryByShopBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_CategoryFlagsBase"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CategoryByShopModify", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags"
})
public class WSCategoryByShopModify
    extends WSCategoryByShopBase
{

    @XmlElement(required = true)
    protected WSCategoryFlagsBase flags;

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSCategoryFlagsBase }
     *     
     */
    public WSCategoryFlagsBase getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCategoryFlagsBase }
     *     
     */
    public void setFlags(WSCategoryFlagsBase value) {
        this.flags = value;
    }

}

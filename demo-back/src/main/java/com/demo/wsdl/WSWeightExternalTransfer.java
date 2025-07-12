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
 * <p>Clase Java para WS_WeightExternalTransfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_WeightExternalTransfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="categoryId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="pvPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pvUnits" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_WeightExternalTransfer", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "categoryId",
    "pvPoints",
    "pvUnits"
})
public class WSWeightExternalTransfer {

    protected long id;
    protected long categoryId;
    protected double pvPoints;
    protected double pvUnits;

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
     * Obtiene el valor de la propiedad pvPoints.
     * 
     */
    public double getPvPoints() {
        return pvPoints;
    }

    /**
     * Define el valor de la propiedad pvPoints.
     * 
     */
    public void setPvPoints(double value) {
        this.pvPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad pvUnits.
     * 
     */
    public double getPvUnits() {
        return pvUnits;
    }

    /**
     * Define el valor de la propiedad pvUnits.
     * 
     */
    public void setPvUnits(double value) {
        this.pvUnits = value;
    }

}

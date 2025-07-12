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
 * <p>Clase Java para WS_PrizeCatalogVoucher complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PrizeCatalogVoucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_PrizeInfo"/&gt;
 *         &lt;element name="pointsDiscount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="pointsVoucherValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCatalogVoucher", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "prize",
    "pointsDiscount",
    "pointsVoucherValue"
})
public class WSPrizeCatalogVoucher {

    protected long id;
    @XmlElement(required = true)
    protected WSPrizeInfo prize;
    protected double pointsDiscount;
    protected double pointsVoucherValue;

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
     * Obtiene el valor de la propiedad prize.
     * 
     * @return
     *     possible object is
     *     {@link WSPrizeInfo }
     *     
     */
    public WSPrizeInfo getPrize() {
        return prize;
    }

    /**
     * Define el valor de la propiedad prize.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPrizeInfo }
     *     
     */
    public void setPrize(WSPrizeInfo value) {
        this.prize = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsDiscount.
     * 
     */
    public double getPointsDiscount() {
        return pointsDiscount;
    }

    /**
     * Define el valor de la propiedad pointsDiscount.
     * 
     */
    public void setPointsDiscount(double value) {
        this.pointsDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsVoucherValue.
     * 
     */
    public double getPointsVoucherValue() {
        return pointsVoucherValue;
    }

    /**
     * Define el valor de la propiedad pointsVoucherValue.
     * 
     */
    public void setPointsVoucherValue(double value) {
        this.pointsVoucherValue = value;
    }

}

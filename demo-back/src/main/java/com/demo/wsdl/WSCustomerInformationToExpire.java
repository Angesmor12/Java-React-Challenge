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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para WS_CustomerInformationToExpire complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CustomerInformationToExpire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointToExpire" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="periodoForeignid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="dateClose" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CustomerInformationToExpire", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "pointToExpire",
    "periodoForeignid",
    "dateClose"
})
public class WSCustomerInformationToExpire {

    protected double pointToExpire;
    protected long periodoForeignid;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateClose;

    /**
     * Obtiene el valor de la propiedad pointToExpire.
     * 
     */
    public double getPointToExpire() {
        return pointToExpire;
    }

    /**
     * Define el valor de la propiedad pointToExpire.
     * 
     */
    public void setPointToExpire(double value) {
        this.pointToExpire = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoForeignid.
     * 
     */
    public long getPeriodoForeignid() {
        return periodoForeignid;
    }

    /**
     * Define el valor de la propiedad periodoForeignid.
     * 
     */
    public void setPeriodoForeignid(long value) {
        this.periodoForeignid = value;
    }

    /**
     * Obtiene el valor de la propiedad dateClose.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateClose() {
        return dateClose;
    }

    /**
     * Define el valor de la propiedad dateClose.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateClose(XMLGregorianCalendar value) {
        this.dateClose = value;
    }

}

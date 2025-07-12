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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="answerCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="voucher" type="{http://FidelyNET3_SW_01_89_00}WS_Voucher"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "answerCode",
    "voucher"
})
@XmlRootElement(name = "ValidateVoucherCatalogPrizeResponse")
public class ValidateVoucherCatalogPrizeResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSVoucher voucher;

    /**
     * Obtiene el valor de la propiedad answerCode.
     * 
     */
    public int getAnswerCode() {
        return answerCode;
    }

    /**
     * Define el valor de la propiedad answerCode.
     * 
     */
    public void setAnswerCode(int value) {
        this.answerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad voucher.
     * 
     * @return
     *     possible object is
     *     {@link WSVoucher }
     *     
     */
    public WSVoucher getVoucher() {
        return voucher;
    }

    /**
     * Define el valor de la propiedad voucher.
     * 
     * @param value
     *     allowed object is
     *     {@link WSVoucher }
     *     
     */
    public void setVoucher(WSVoucher value) {
        this.voucher = value;
    }

}

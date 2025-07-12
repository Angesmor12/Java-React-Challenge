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
 * <p>Clase Java para WS_PrizeCategoryFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PrizeCategoryFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="outstandingPrizeCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="useReview" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sendReviewByMail" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sendReviewBySms" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sendReviewByPush" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="requiredShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PrizeCategoryFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "enabled",
    "outstandingPrizeCategory",
    "useReview",
    "sendReviewByMail",
    "sendReviewBySms",
    "sendReviewByPush",
    "requiredShipping"
})
public class WSPrizeCategoryFlags {

    protected long flags;
    protected boolean enabled;
    protected boolean outstandingPrizeCategory;
    protected boolean useReview;
    protected boolean sendReviewByMail;
    protected boolean sendReviewBySms;
    protected boolean sendReviewByPush;
    protected boolean requiredShipping;

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
     * Obtiene el valor de la propiedad enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Define el valor de la propiedad enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

    /**
     * Obtiene el valor de la propiedad outstandingPrizeCategory.
     * 
     */
    public boolean isOutstandingPrizeCategory() {
        return outstandingPrizeCategory;
    }

    /**
     * Define el valor de la propiedad outstandingPrizeCategory.
     * 
     */
    public void setOutstandingPrizeCategory(boolean value) {
        this.outstandingPrizeCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad useReview.
     * 
     */
    public boolean isUseReview() {
        return useReview;
    }

    /**
     * Define el valor de la propiedad useReview.
     * 
     */
    public void setUseReview(boolean value) {
        this.useReview = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewByMail.
     * 
     */
    public boolean isSendReviewByMail() {
        return sendReviewByMail;
    }

    /**
     * Define el valor de la propiedad sendReviewByMail.
     * 
     */
    public void setSendReviewByMail(boolean value) {
        this.sendReviewByMail = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewBySms.
     * 
     */
    public boolean isSendReviewBySms() {
        return sendReviewBySms;
    }

    /**
     * Define el valor de la propiedad sendReviewBySms.
     * 
     */
    public void setSendReviewBySms(boolean value) {
        this.sendReviewBySms = value;
    }

    /**
     * Obtiene el valor de la propiedad sendReviewByPush.
     * 
     */
    public boolean isSendReviewByPush() {
        return sendReviewByPush;
    }

    /**
     * Define el valor de la propiedad sendReviewByPush.
     * 
     */
    public void setSendReviewByPush(boolean value) {
        this.sendReviewByPush = value;
    }

    /**
     * Obtiene el valor de la propiedad requiredShipping.
     * 
     */
    public boolean isRequiredShipping() {
        return requiredShipping;
    }

    /**
     * Define el valor de la propiedad requiredShipping.
     * 
     */
    public void setRequiredShipping(boolean value) {
        this.requiredShipping = value;
    }

}

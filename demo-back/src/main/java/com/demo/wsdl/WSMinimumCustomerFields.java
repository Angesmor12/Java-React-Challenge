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
 * <p>Clase Java para WS_MinimumCustomerFields complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_MinimumCustomerFields"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="showName" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showSurname" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showBirthdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showExpirationDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showDNI" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_MinimumCustomerFields", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "showName",
    "showSurname",
    "showBirthdate",
    "showExpirationDate",
    "showDNI",
    "showCategory"
})
public class WSMinimumCustomerFields {

    protected long flags;
    protected boolean showName;
    protected boolean showSurname;
    protected boolean showBirthdate;
    protected boolean showExpirationDate;
    protected boolean showDNI;
    protected boolean showCategory;

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
     * Obtiene el valor de la propiedad showName.
     * 
     */
    public boolean isShowName() {
        return showName;
    }

    /**
     * Define el valor de la propiedad showName.
     * 
     */
    public void setShowName(boolean value) {
        this.showName = value;
    }

    /**
     * Obtiene el valor de la propiedad showSurname.
     * 
     */
    public boolean isShowSurname() {
        return showSurname;
    }

    /**
     * Define el valor de la propiedad showSurname.
     * 
     */
    public void setShowSurname(boolean value) {
        this.showSurname = value;
    }

    /**
     * Obtiene el valor de la propiedad showBirthdate.
     * 
     */
    public boolean isShowBirthdate() {
        return showBirthdate;
    }

    /**
     * Define el valor de la propiedad showBirthdate.
     * 
     */
    public void setShowBirthdate(boolean value) {
        this.showBirthdate = value;
    }

    /**
     * Obtiene el valor de la propiedad showExpirationDate.
     * 
     */
    public boolean isShowExpirationDate() {
        return showExpirationDate;
    }

    /**
     * Define el valor de la propiedad showExpirationDate.
     * 
     */
    public void setShowExpirationDate(boolean value) {
        this.showExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad showDNI.
     * 
     */
    public boolean isShowDNI() {
        return showDNI;
    }

    /**
     * Define el valor de la propiedad showDNI.
     * 
     */
    public void setShowDNI(boolean value) {
        this.showDNI = value;
    }

    /**
     * Obtiene el valor de la propiedad showCategory.
     * 
     */
    public boolean isShowCategory() {
        return showCategory;
    }

    /**
     * Define el valor de la propiedad showCategory.
     * 
     */
    public void setShowCategory(boolean value) {
        this.showCategory = value;
    }

}

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
 * <p>Clase Java para WS_CampaignTicketFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_CampaignTicketFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="printCustomerCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="printPointsBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="printCreditsBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="printCreditsGiftBalance" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="printPointsStatus" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="printSignatureOnCustomerCopy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_CampaignTicketFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "printCustomerCopy",
    "printPointsBalance",
    "printCreditsBalance",
    "printCreditsGiftBalance",
    "printPointsStatus",
    "printSignatureOnCustomerCopy"
})
public class WSCampaignTicketFlags {

    protected boolean printCustomerCopy;
    protected boolean printPointsBalance;
    protected boolean printCreditsBalance;
    protected boolean printCreditsGiftBalance;
    protected boolean printPointsStatus;
    protected boolean printSignatureOnCustomerCopy;

    /**
     * Obtiene el valor de la propiedad printCustomerCopy.
     * 
     */
    public boolean isPrintCustomerCopy() {
        return printCustomerCopy;
    }

    /**
     * Define el valor de la propiedad printCustomerCopy.
     * 
     */
    public void setPrintCustomerCopy(boolean value) {
        this.printCustomerCopy = value;
    }

    /**
     * Obtiene el valor de la propiedad printPointsBalance.
     * 
     */
    public boolean isPrintPointsBalance() {
        return printPointsBalance;
    }

    /**
     * Define el valor de la propiedad printPointsBalance.
     * 
     */
    public void setPrintPointsBalance(boolean value) {
        this.printPointsBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printCreditsBalance.
     * 
     */
    public boolean isPrintCreditsBalance() {
        return printCreditsBalance;
    }

    /**
     * Define el valor de la propiedad printCreditsBalance.
     * 
     */
    public void setPrintCreditsBalance(boolean value) {
        this.printCreditsBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printCreditsGiftBalance.
     * 
     */
    public boolean isPrintCreditsGiftBalance() {
        return printCreditsGiftBalance;
    }

    /**
     * Define el valor de la propiedad printCreditsGiftBalance.
     * 
     */
    public void setPrintCreditsGiftBalance(boolean value) {
        this.printCreditsGiftBalance = value;
    }

    /**
     * Obtiene el valor de la propiedad printPointsStatus.
     * 
     */
    public boolean isPrintPointsStatus() {
        return printPointsStatus;
    }

    /**
     * Define el valor de la propiedad printPointsStatus.
     * 
     */
    public void setPrintPointsStatus(boolean value) {
        this.printPointsStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad printSignatureOnCustomerCopy.
     * 
     */
    public boolean isPrintSignatureOnCustomerCopy() {
        return printSignatureOnCustomerCopy;
    }

    /**
     * Define el valor de la propiedad printSignatureOnCustomerCopy.
     * 
     */
    public void setPrintSignatureOnCustomerCopy(boolean value) {
        this.printSignatureOnCustomerCopy = value;
    }

}

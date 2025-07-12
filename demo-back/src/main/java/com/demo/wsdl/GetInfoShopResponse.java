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
 *         &lt;element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/&gt;
 *         &lt;element name="shopByCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/&gt;
 *         &lt;element name="terminalByCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalByCampaign"/&gt;
 *         &lt;element name="terminalBehavior" type="{http://FidelyNET3_SW_01_89_00}WS_TerminalBehavior"/&gt;
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
    "shop",
    "shopByCampaignByDefault",
    "terminalByCampaignByDefault",
    "terminalBehavior"
})
@XmlRootElement(name = "GetInfoShopResponse")
public class GetInfoShopResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true, nillable = true)
    protected WSShopByCampaignBehavior shopByCampaignByDefault;
    @XmlElement(required = true, nillable = true)
    protected WSTerminalByCampaign terminalByCampaignByDefault;
    @XmlElement(required = true, nillable = true)
    protected WSTerminalBehavior terminalBehavior;

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
     * Obtiene el valor de la propiedad shop.
     * 
     * @return
     *     possible object is
     *     {@link WSShop }
     *     
     */
    public WSShop getShop() {
        return shop;
    }

    /**
     * Define el valor de la propiedad shop.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShop }
     *     
     */
    public void setShop(WSShop value) {
        this.shop = value;
    }

    /**
     * Obtiene el valor de la propiedad shopByCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopByCampaignByDefault() {
        return shopByCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad shopByCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopByCampaignByDefault(WSShopByCampaignBehavior value) {
        this.shopByCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalByCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public WSTerminalByCampaign getTerminalByCampaignByDefault() {
        return terminalByCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad terminalByCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalByCampaign }
     *     
     */
    public void setTerminalByCampaignByDefault(WSTerminalByCampaign value) {
        this.terminalByCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalBehavior.
     * 
     * @return
     *     possible object is
     *     {@link WSTerminalBehavior }
     *     
     */
    public WSTerminalBehavior getTerminalBehavior() {
        return terminalBehavior;
    }

    /**
     * Define el valor de la propiedad terminalBehavior.
     * 
     * @param value
     *     allowed object is
     *     {@link WSTerminalBehavior }
     *     
     */
    public void setTerminalBehavior(WSTerminalBehavior value) {
        this.terminalBehavior = value;
    }

}

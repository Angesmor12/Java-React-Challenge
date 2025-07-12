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
 * <p>Clase Java para WS_ShopStatus complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ShopStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shop" type="{http://FidelyNET3_SW_01_89_00}WS_Shop"/&gt;
 *         &lt;element name="shopCurrentCampaign" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/&gt;
 *         &lt;element name="shopCampaignByDefault" type="{http://FidelyNET3_SW_01_89_00}WS_ShopByCampaignBehavior"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShopStatus", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "shop",
    "shopCurrentCampaign",
    "shopCampaignByDefault"
})
public class WSShopStatus {

    @XmlElement(required = true)
    protected WSShop shop;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shopCurrentCampaign;
    @XmlElement(required = true)
    protected WSShopByCampaignBehavior shopCampaignByDefault;

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
     * Obtiene el valor de la propiedad shopCurrentCampaign.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopCurrentCampaign() {
        return shopCurrentCampaign;
    }

    /**
     * Define el valor de la propiedad shopCurrentCampaign.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopCurrentCampaign(WSShopByCampaignBehavior value) {
        this.shopCurrentCampaign = value;
    }

    /**
     * Obtiene el valor de la propiedad shopCampaignByDefault.
     * 
     * @return
     *     possible object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public WSShopByCampaignBehavior getShopCampaignByDefault() {
        return shopCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad shopCampaignByDefault.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShopByCampaignBehavior }
     *     
     */
    public void setShopCampaignByDefault(WSShopByCampaignBehavior value) {
        this.shopCampaignByDefault = value;
    }

}

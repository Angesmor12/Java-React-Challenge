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
 * <p>Clase Java para WS_Shop complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_Shop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="logoSwUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bannerSwUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="logoPosUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="campaignIdByDefault" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currencyId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="currencySymbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="behaviorFlags" type="{http://FidelyNET3_SW_01_89_00}WS_NetBehaviorFlags"/&gt;
 *         &lt;element name="addressPrefix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geoLevel1" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geoLevel2" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geoLevel3" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geoLevel4" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="geoLevel5" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="geoLat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="geoLong" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="addressNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flags" type="{http://FidelyNET3_SW_01_89_00}WS_NetFlags"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_Shop", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "id",
    "name",
    "logoSwUrl",
    "bannerSwUrl",
    "logoPosUrl",
    "campaignIdByDefault",
    "currencyId",
    "currencySymbol",
    "behaviorFlags",
    "addressPrefix",
    "country",
    "geoLevel1",
    "geoLevel2",
    "geoLevel3",
    "geoLevel4",
    "geoLevel5",
    "address",
    "geoLat",
    "geoLong",
    "addressNumber",
    "zip",
    "flags"
})
public class WSShop {

    protected long id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String logoSwUrl;
    @XmlElement(required = true)
    protected String bannerSwUrl;
    @XmlElement(required = true)
    protected String logoPosUrl;
    protected long campaignIdByDefault;
    protected long currencyId;
    @XmlElement(required = true)
    protected String currencySymbol;
    @XmlElement(required = true)
    protected WSNetBehaviorFlags behaviorFlags;
    @XmlElement(required = true)
    protected String addressPrefix;
    protected long country;
    protected long geoLevel1;
    protected long geoLevel2;
    protected long geoLevel3;
    protected long geoLevel4;
    protected long geoLevel5;
    @XmlElement(required = true)
    protected String address;
    protected double geoLat;
    protected double geoLong;
    @XmlElement(required = true)
    protected String addressNumber;
    @XmlElement(required = true)
    protected String zip;
    @XmlElement(required = true)
    protected WSNetFlags flags;

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
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad logoSwUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoSwUrl() {
        return logoSwUrl;
    }

    /**
     * Define el valor de la propiedad logoSwUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoSwUrl(String value) {
        this.logoSwUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad bannerSwUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerSwUrl() {
        return bannerSwUrl;
    }

    /**
     * Define el valor de la propiedad bannerSwUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerSwUrl(String value) {
        this.bannerSwUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad logoPosUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoPosUrl() {
        return logoPosUrl;
    }

    /**
     * Define el valor de la propiedad logoPosUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoPosUrl(String value) {
        this.logoPosUrl = value;
    }

    /**
     * Obtiene el valor de la propiedad campaignIdByDefault.
     * 
     */
    public long getCampaignIdByDefault() {
        return campaignIdByDefault;
    }

    /**
     * Define el valor de la propiedad campaignIdByDefault.
     * 
     */
    public void setCampaignIdByDefault(long value) {
        this.campaignIdByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyId.
     * 
     */
    public long getCurrencyId() {
        return currencyId;
    }

    /**
     * Define el valor de la propiedad currencyId.
     * 
     */
    public void setCurrencyId(long value) {
        this.currencyId = value;
    }

    /**
     * Obtiene el valor de la propiedad currencySymbol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Define el valor de la propiedad currencySymbol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    /**
     * Obtiene el valor de la propiedad behaviorFlags.
     * 
     * @return
     *     possible object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public WSNetBehaviorFlags getBehaviorFlags() {
        return behaviorFlags;
    }

    /**
     * Define el valor de la propiedad behaviorFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNetBehaviorFlags }
     *     
     */
    public void setBehaviorFlags(WSNetBehaviorFlags value) {
        this.behaviorFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad addressPrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressPrefix() {
        return addressPrefix;
    }

    /**
     * Define el valor de la propiedad addressPrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressPrefix(String value) {
        this.addressPrefix = value;
    }

    /**
     * Obtiene el valor de la propiedad country.
     * 
     */
    public long getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     * 
     */
    public void setCountry(long value) {
        this.country = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel1.
     * 
     */
    public long getGeoLevel1() {
        return geoLevel1;
    }

    /**
     * Define el valor de la propiedad geoLevel1.
     * 
     */
    public void setGeoLevel1(long value) {
        this.geoLevel1 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel2.
     * 
     */
    public long getGeoLevel2() {
        return geoLevel2;
    }

    /**
     * Define el valor de la propiedad geoLevel2.
     * 
     */
    public void setGeoLevel2(long value) {
        this.geoLevel2 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel3.
     * 
     */
    public long getGeoLevel3() {
        return geoLevel3;
    }

    /**
     * Define el valor de la propiedad geoLevel3.
     * 
     */
    public void setGeoLevel3(long value) {
        this.geoLevel3 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel4.
     * 
     */
    public long getGeoLevel4() {
        return geoLevel4;
    }

    /**
     * Define el valor de la propiedad geoLevel4.
     * 
     */
    public void setGeoLevel4(long value) {
        this.geoLevel4 = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLevel5.
     * 
     */
    public long getGeoLevel5() {
        return geoLevel5;
    }

    /**
     * Define el valor de la propiedad geoLevel5.
     * 
     */
    public void setGeoLevel5(long value) {
        this.geoLevel5 = value;
    }

    /**
     * Obtiene el valor de la propiedad address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Define el valor de la propiedad address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLat.
     * 
     */
    public double getGeoLat() {
        return geoLat;
    }

    /**
     * Define el valor de la propiedad geoLat.
     * 
     */
    public void setGeoLat(double value) {
        this.geoLat = value;
    }

    /**
     * Obtiene el valor de la propiedad geoLong.
     * 
     */
    public double getGeoLong() {
        return geoLong;
    }

    /**
     * Define el valor de la propiedad geoLong.
     * 
     */
    public void setGeoLong(double value) {
        this.geoLong = value;
    }

    /**
     * Obtiene el valor de la propiedad addressNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * Define el valor de la propiedad addressNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad zip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Define el valor de la propiedad zip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Obtiene el valor de la propiedad flags.
     * 
     * @return
     *     possible object is
     *     {@link WSNetFlags }
     *     
     */
    public WSNetFlags getFlags() {
        return flags;
    }

    /**
     * Define el valor de la propiedad flags.
     * 
     * @param value
     *     allowed object is
     *     {@link WSNetFlags }
     *     
     */
    public void setFlags(WSNetFlags value) {
        this.flags = value;
    }

}

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
 * <p>Clase Java para WS_TerminalInformativeFlags complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_TerminalInformativeFlags"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="informativeFlags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="hasToUpdateLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInUpdateLogo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasToUpdateFW" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasToUpdateCampaignByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasToUpdateShopBanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="errorInUpdateShopBanner" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="hasToUpdateGeoLevelsFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_TerminalInformativeFlags", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "informativeFlags",
    "hasToUpdateLogo",
    "errorInUpdateLogo",
    "hasToUpdateFW",
    "hasToUpdateCampaignByDefault",
    "hasToUpdateShopBanner",
    "errorInUpdateShopBanner",
    "hasToUpdateGeoLevelsFile"
})
public class WSTerminalInformativeFlags {

    protected long informativeFlags;
    protected boolean hasToUpdateLogo;
    protected boolean errorInUpdateLogo;
    protected boolean hasToUpdateFW;
    protected boolean hasToUpdateCampaignByDefault;
    protected boolean hasToUpdateShopBanner;
    protected boolean errorInUpdateShopBanner;
    protected boolean hasToUpdateGeoLevelsFile;

    /**
     * Obtiene el valor de la propiedad informativeFlags.
     * 
     */
    public long getInformativeFlags() {
        return informativeFlags;
    }

    /**
     * Define el valor de la propiedad informativeFlags.
     * 
     */
    public void setInformativeFlags(long value) {
        this.informativeFlags = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateLogo.
     * 
     */
    public boolean isHasToUpdateLogo() {
        return hasToUpdateLogo;
    }

    /**
     * Define el valor de la propiedad hasToUpdateLogo.
     * 
     */
    public void setHasToUpdateLogo(boolean value) {
        this.hasToUpdateLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateLogo.
     * 
     */
    public boolean isErrorInUpdateLogo() {
        return errorInUpdateLogo;
    }

    /**
     * Define el valor de la propiedad errorInUpdateLogo.
     * 
     */
    public void setErrorInUpdateLogo(boolean value) {
        this.errorInUpdateLogo = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateFW.
     * 
     */
    public boolean isHasToUpdateFW() {
        return hasToUpdateFW;
    }

    /**
     * Define el valor de la propiedad hasToUpdateFW.
     * 
     */
    public void setHasToUpdateFW(boolean value) {
        this.hasToUpdateFW = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateCampaignByDefault.
     * 
     */
    public boolean isHasToUpdateCampaignByDefault() {
        return hasToUpdateCampaignByDefault;
    }

    /**
     * Define el valor de la propiedad hasToUpdateCampaignByDefault.
     * 
     */
    public void setHasToUpdateCampaignByDefault(boolean value) {
        this.hasToUpdateCampaignByDefault = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateShopBanner.
     * 
     */
    public boolean isHasToUpdateShopBanner() {
        return hasToUpdateShopBanner;
    }

    /**
     * Define el valor de la propiedad hasToUpdateShopBanner.
     * 
     */
    public void setHasToUpdateShopBanner(boolean value) {
        this.hasToUpdateShopBanner = value;
    }

    /**
     * Obtiene el valor de la propiedad errorInUpdateShopBanner.
     * 
     */
    public boolean isErrorInUpdateShopBanner() {
        return errorInUpdateShopBanner;
    }

    /**
     * Define el valor de la propiedad errorInUpdateShopBanner.
     * 
     */
    public void setErrorInUpdateShopBanner(boolean value) {
        this.errorInUpdateShopBanner = value;
    }

    /**
     * Obtiene el valor de la propiedad hasToUpdateGeoLevelsFile.
     * 
     */
    public boolean isHasToUpdateGeoLevelsFile() {
        return hasToUpdateGeoLevelsFile;
    }

    /**
     * Define el valor de la propiedad hasToUpdateGeoLevelsFile.
     * 
     */
    public void setHasToUpdateGeoLevelsFile(boolean value) {
        this.hasToUpdateGeoLevelsFile = value;
    }

}

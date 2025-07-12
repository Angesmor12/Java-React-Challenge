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
 * <p>Clase Java para WS_FlagsPromotion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_FlagsPromotion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="canceled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="winPromo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="winDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_FlagsPromotion", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "flags",
    "canceled",
    "winPromo",
    "winDiscount"
})
public class WSFlagsPromotion {

    protected long flags;
    protected boolean canceled;
    protected boolean winPromo;
    protected boolean winDiscount;

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
     * Obtiene el valor de la propiedad canceled.
     * 
     */
    public boolean isCanceled() {
        return canceled;
    }

    /**
     * Define el valor de la propiedad canceled.
     * 
     */
    public void setCanceled(boolean value) {
        this.canceled = value;
    }

    /**
     * Obtiene el valor de la propiedad winPromo.
     * 
     */
    public boolean isWinPromo() {
        return winPromo;
    }

    /**
     * Define el valor de la propiedad winPromo.
     * 
     */
    public void setWinPromo(boolean value) {
        this.winPromo = value;
    }

    /**
     * Obtiene el valor de la propiedad winDiscount.
     * 
     */
    public boolean isWinDiscount() {
        return winDiscount;
    }

    /**
     * Define el valor de la propiedad winDiscount.
     * 
     */
    public void setWinDiscount(boolean value) {
        this.winDiscount = value;
    }

}

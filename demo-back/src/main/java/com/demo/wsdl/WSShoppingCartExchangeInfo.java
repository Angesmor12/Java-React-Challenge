//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.03.14 a las 10:29:30 AM ART 
//


package com.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_ShoppingCartExchangeInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_ShoppingCartExchangeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shoppingCartId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="shoppingCartStatus" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prize" type="{http://FidelyNET3_SW_01_89_00}WS_ExchangedPrizeWithPromotions" maxOccurs="unbounded"/&gt;
 *         &lt;element name="voucher" type="{http://FidelyNET3_SW_01_89_00}WS_Voucher"/&gt;
 *         &lt;element name="shoppingCartBalance" type="{http://FidelyNET3_SW_01_89_00}WS_ShoppingCartBalance"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_ShoppingCartExchangeInfo", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "shoppingCartId",
    "shoppingCartStatus",
    "prize",
    "voucher",
    "shoppingCartBalance"
})
public class WSShoppingCartExchangeInfo {

    protected long shoppingCartId;
    protected long shoppingCartStatus;
    @XmlElement(required = true)
    protected List<WSExchangedPrizeWithPromotions> prize;
    @XmlElement(required = true, nillable = true)
    protected WSVoucher voucher;
    @XmlElement(required = true)
    protected WSShoppingCartBalance shoppingCartBalance;

    /**
     * Obtiene el valor de la propiedad shoppingCartId.
     * 
     */
    public long getShoppingCartId() {
        return shoppingCartId;
    }

    /**
     * Define el valor de la propiedad shoppingCartId.
     * 
     */
    public void setShoppingCartId(long value) {
        this.shoppingCartId = value;
    }

    /**
     * Obtiene el valor de la propiedad shoppingCartStatus.
     * 
     */
    public long getShoppingCartStatus() {
        return shoppingCartStatus;
    }

    /**
     * Define el valor de la propiedad shoppingCartStatus.
     * 
     */
    public void setShoppingCartStatus(long value) {
        this.shoppingCartStatus = value;
    }

    /**
     * Gets the value of the prize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSExchangedPrizeWithPromotions }
     * 
     * 
     */
    public List<WSExchangedPrizeWithPromotions> getPrize() {
        if (prize == null) {
            prize = new ArrayList<WSExchangedPrizeWithPromotions>();
        }
        return this.prize;
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

    /**
     * Obtiene el valor de la propiedad shoppingCartBalance.
     * 
     * @return
     *     possible object is
     *     {@link WSShoppingCartBalance }
     *     
     */
    public WSShoppingCartBalance getShoppingCartBalance() {
        return shoppingCartBalance;
    }

    /**
     * Define el valor de la propiedad shoppingCartBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link WSShoppingCartBalance }
     *     
     */
    public void setShoppingCartBalance(WSShoppingCartBalance value) {
        this.shoppingCartBalance = value;
    }

}

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
 * <p>Clase Java para WS_SimpleTerminalProfile complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_SimpleTerminalProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rights" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="canDoNewCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canChargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDischargeCredits" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canChargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDischargePoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDoSale" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canApplyDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canAcceptVouchers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDeliverPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canLockCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canUnlockCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canReplaceCard" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canSearchCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canExchangePrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDeliverPrizes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canExtendExpirationDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canModifyCategory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDeliverStatusPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canRequestPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canCancelTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canTransferPoints" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canCancelOtherTerminalTransactions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canCancelTransactionById" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canLockCustomers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canUnlockCustomers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canModifyCustomer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDoCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="canDoCheckOut" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_SimpleTerminalProfile", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "rights",
    "canDoNewCard",
    "canChargeCredits",
    "canDischargeCredits",
    "canChargePoints",
    "canDischargePoints",
    "canDoSale",
    "canApplyDiscount",
    "canAcceptVouchers",
    "canDeliverPromotions",
    "canLockCard",
    "canUnlockCard",
    "canReplaceCard",
    "canSearchCustomer",
    "canExchangePrizes",
    "canDeliverPrizes",
    "canExtendExpirationDate",
    "canModifyCategory",
    "canDeliverStatusPoints",
    "canRequestPoints",
    "canCancelTransaction",
    "canTransferPoints",
    "canCancelOtherTerminalTransactions",
    "canCancelTransactionById",
    "canLockCustomers",
    "canUnlockCustomers",
    "canModifyCustomer",
    "canDoCheckIn",
    "canDoCheckOut"
})
public class WSSimpleTerminalProfile {

    protected long rights;
    protected boolean canDoNewCard;
    protected boolean canChargeCredits;
    protected boolean canDischargeCredits;
    protected boolean canChargePoints;
    protected boolean canDischargePoints;
    protected boolean canDoSale;
    protected boolean canApplyDiscount;
    protected boolean canAcceptVouchers;
    protected boolean canDeliverPromotions;
    protected boolean canLockCard;
    protected boolean canUnlockCard;
    protected boolean canReplaceCard;
    protected boolean canSearchCustomer;
    protected boolean canExchangePrizes;
    protected boolean canDeliverPrizes;
    protected boolean canExtendExpirationDate;
    protected boolean canModifyCategory;
    protected boolean canDeliverStatusPoints;
    protected boolean canRequestPoints;
    protected boolean canCancelTransaction;
    protected boolean canTransferPoints;
    protected boolean canCancelOtherTerminalTransactions;
    protected boolean canCancelTransactionById;
    protected boolean canLockCustomers;
    protected boolean canUnlockCustomers;
    protected boolean canModifyCustomer;
    protected boolean canDoCheckIn;
    protected boolean canDoCheckOut;

    /**
     * Obtiene el valor de la propiedad rights.
     * 
     */
    public long getRights() {
        return rights;
    }

    /**
     * Define el valor de la propiedad rights.
     * 
     */
    public void setRights(long value) {
        this.rights = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoNewCard.
     * 
     */
    public boolean isCanDoNewCard() {
        return canDoNewCard;
    }

    /**
     * Define el valor de la propiedad canDoNewCard.
     * 
     */
    public void setCanDoNewCard(boolean value) {
        this.canDoNewCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canChargeCredits.
     * 
     */
    public boolean isCanChargeCredits() {
        return canChargeCredits;
    }

    /**
     * Define el valor de la propiedad canChargeCredits.
     * 
     */
    public void setCanChargeCredits(boolean value) {
        this.canChargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad canDischargeCredits.
     * 
     */
    public boolean isCanDischargeCredits() {
        return canDischargeCredits;
    }

    /**
     * Define el valor de la propiedad canDischargeCredits.
     * 
     */
    public void setCanDischargeCredits(boolean value) {
        this.canDischargeCredits = value;
    }

    /**
     * Obtiene el valor de la propiedad canChargePoints.
     * 
     */
    public boolean isCanChargePoints() {
        return canChargePoints;
    }

    /**
     * Define el valor de la propiedad canChargePoints.
     * 
     */
    public void setCanChargePoints(boolean value) {
        this.canChargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canDischargePoints.
     * 
     */
    public boolean isCanDischargePoints() {
        return canDischargePoints;
    }

    /**
     * Define el valor de la propiedad canDischargePoints.
     * 
     */
    public void setCanDischargePoints(boolean value) {
        this.canDischargePoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoSale.
     * 
     */
    public boolean isCanDoSale() {
        return canDoSale;
    }

    /**
     * Define el valor de la propiedad canDoSale.
     * 
     */
    public void setCanDoSale(boolean value) {
        this.canDoSale = value;
    }

    /**
     * Obtiene el valor de la propiedad canApplyDiscount.
     * 
     */
    public boolean isCanApplyDiscount() {
        return canApplyDiscount;
    }

    /**
     * Define el valor de la propiedad canApplyDiscount.
     * 
     */
    public void setCanApplyDiscount(boolean value) {
        this.canApplyDiscount = value;
    }

    /**
     * Obtiene el valor de la propiedad canAcceptVouchers.
     * 
     */
    public boolean isCanAcceptVouchers() {
        return canAcceptVouchers;
    }

    /**
     * Define el valor de la propiedad canAcceptVouchers.
     * 
     */
    public void setCanAcceptVouchers(boolean value) {
        this.canAcceptVouchers = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverPromotions.
     * 
     */
    public boolean isCanDeliverPromotions() {
        return canDeliverPromotions;
    }

    /**
     * Define el valor de la propiedad canDeliverPromotions.
     * 
     */
    public void setCanDeliverPromotions(boolean value) {
        this.canDeliverPromotions = value;
    }

    /**
     * Obtiene el valor de la propiedad canLockCard.
     * 
     */
    public boolean isCanLockCard() {
        return canLockCard;
    }

    /**
     * Define el valor de la propiedad canLockCard.
     * 
     */
    public void setCanLockCard(boolean value) {
        this.canLockCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canUnlockCard.
     * 
     */
    public boolean isCanUnlockCard() {
        return canUnlockCard;
    }

    /**
     * Define el valor de la propiedad canUnlockCard.
     * 
     */
    public void setCanUnlockCard(boolean value) {
        this.canUnlockCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canReplaceCard.
     * 
     */
    public boolean isCanReplaceCard() {
        return canReplaceCard;
    }

    /**
     * Define el valor de la propiedad canReplaceCard.
     * 
     */
    public void setCanReplaceCard(boolean value) {
        this.canReplaceCard = value;
    }

    /**
     * Obtiene el valor de la propiedad canSearchCustomer.
     * 
     */
    public boolean isCanSearchCustomer() {
        return canSearchCustomer;
    }

    /**
     * Define el valor de la propiedad canSearchCustomer.
     * 
     */
    public void setCanSearchCustomer(boolean value) {
        this.canSearchCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad canExchangePrizes.
     * 
     */
    public boolean isCanExchangePrizes() {
        return canExchangePrizes;
    }

    /**
     * Define el valor de la propiedad canExchangePrizes.
     * 
     */
    public void setCanExchangePrizes(boolean value) {
        this.canExchangePrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverPrizes.
     * 
     */
    public boolean isCanDeliverPrizes() {
        return canDeliverPrizes;
    }

    /**
     * Define el valor de la propiedad canDeliverPrizes.
     * 
     */
    public void setCanDeliverPrizes(boolean value) {
        this.canDeliverPrizes = value;
    }

    /**
     * Obtiene el valor de la propiedad canExtendExpirationDate.
     * 
     */
    public boolean isCanExtendExpirationDate() {
        return canExtendExpirationDate;
    }

    /**
     * Define el valor de la propiedad canExtendExpirationDate.
     * 
     */
    public void setCanExtendExpirationDate(boolean value) {
        this.canExtendExpirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad canModifyCategory.
     * 
     */
    public boolean isCanModifyCategory() {
        return canModifyCategory;
    }

    /**
     * Define el valor de la propiedad canModifyCategory.
     * 
     */
    public void setCanModifyCategory(boolean value) {
        this.canModifyCategory = value;
    }

    /**
     * Obtiene el valor de la propiedad canDeliverStatusPoints.
     * 
     */
    public boolean isCanDeliverStatusPoints() {
        return canDeliverStatusPoints;
    }

    /**
     * Define el valor de la propiedad canDeliverStatusPoints.
     * 
     */
    public void setCanDeliverStatusPoints(boolean value) {
        this.canDeliverStatusPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canRequestPoints.
     * 
     */
    public boolean isCanRequestPoints() {
        return canRequestPoints;
    }

    /**
     * Define el valor de la propiedad canRequestPoints.
     * 
     */
    public void setCanRequestPoints(boolean value) {
        this.canRequestPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canCancelTransaction.
     * 
     */
    public boolean isCanCancelTransaction() {
        return canCancelTransaction;
    }

    /**
     * Define el valor de la propiedad canCancelTransaction.
     * 
     */
    public void setCanCancelTransaction(boolean value) {
        this.canCancelTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad canTransferPoints.
     * 
     */
    public boolean isCanTransferPoints() {
        return canTransferPoints;
    }

    /**
     * Define el valor de la propiedad canTransferPoints.
     * 
     */
    public void setCanTransferPoints(boolean value) {
        this.canTransferPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad canCancelOtherTerminalTransactions.
     * 
     */
    public boolean isCanCancelOtherTerminalTransactions() {
        return canCancelOtherTerminalTransactions;
    }

    /**
     * Define el valor de la propiedad canCancelOtherTerminalTransactions.
     * 
     */
    public void setCanCancelOtherTerminalTransactions(boolean value) {
        this.canCancelOtherTerminalTransactions = value;
    }

    /**
     * Obtiene el valor de la propiedad canCancelTransactionById.
     * 
     */
    public boolean isCanCancelTransactionById() {
        return canCancelTransactionById;
    }

    /**
     * Define el valor de la propiedad canCancelTransactionById.
     * 
     */
    public void setCanCancelTransactionById(boolean value) {
        this.canCancelTransactionById = value;
    }

    /**
     * Obtiene el valor de la propiedad canLockCustomers.
     * 
     */
    public boolean isCanLockCustomers() {
        return canLockCustomers;
    }

    /**
     * Define el valor de la propiedad canLockCustomers.
     * 
     */
    public void setCanLockCustomers(boolean value) {
        this.canLockCustomers = value;
    }

    /**
     * Obtiene el valor de la propiedad canUnlockCustomers.
     * 
     */
    public boolean isCanUnlockCustomers() {
        return canUnlockCustomers;
    }

    /**
     * Define el valor de la propiedad canUnlockCustomers.
     * 
     */
    public void setCanUnlockCustomers(boolean value) {
        this.canUnlockCustomers = value;
    }

    /**
     * Obtiene el valor de la propiedad canModifyCustomer.
     * 
     */
    public boolean isCanModifyCustomer() {
        return canModifyCustomer;
    }

    /**
     * Define el valor de la propiedad canModifyCustomer.
     * 
     */
    public void setCanModifyCustomer(boolean value) {
        this.canModifyCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoCheckIn.
     * 
     */
    public boolean isCanDoCheckIn() {
        return canDoCheckIn;
    }

    /**
     * Define el valor de la propiedad canDoCheckIn.
     * 
     */
    public void setCanDoCheckIn(boolean value) {
        this.canDoCheckIn = value;
    }

    /**
     * Obtiene el valor de la propiedad canDoCheckOut.
     * 
     */
    public boolean isCanDoCheckOut() {
        return canDoCheckOut;
    }

    /**
     * Define el valor de la propiedad canDoCheckOut.
     * 
     */
    public void setCanDoCheckOut(boolean value) {
        this.canDoCheckOut = value;
    }

}

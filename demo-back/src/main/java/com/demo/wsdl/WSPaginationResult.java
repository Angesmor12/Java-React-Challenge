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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para WS_PaginationResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="WS_PaginationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="initLimit" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="orders" type="{http://FidelyNET3_SW_01_89_00}WS_OrderFields" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recordsTotal" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="actualPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS_PaginationResult", namespace = "http://FidelyNET3_SW_01_89_00", propOrder = {
    "initLimit",
    "rowCount",
    "orders",
    "recordsTotal",
    "actualPage",
    "totalPages"
})
public class WSPaginationResult {

    protected long initLimit;
    protected long rowCount;
    protected List<WSOrderFields> orders;
    protected long recordsTotal;
    protected int actualPage;
    protected int totalPages;

    /**
     * Obtiene el valor de la propiedad initLimit.
     * 
     */
    public long getInitLimit() {
        return initLimit;
    }

    /**
     * Define el valor de la propiedad initLimit.
     * 
     */
    public void setInitLimit(long value) {
        this.initLimit = value;
    }

    /**
     * Obtiene el valor de la propiedad rowCount.
     * 
     */
    public long getRowCount() {
        return rowCount;
    }

    /**
     * Define el valor de la propiedad rowCount.
     * 
     */
    public void setRowCount(long value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the orders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOrderFields }
     * 
     * 
     */
    public List<WSOrderFields> getOrders() {
        if (orders == null) {
            orders = new ArrayList<WSOrderFields>();
        }
        return this.orders;
    }

    /**
     * Obtiene el valor de la propiedad recordsTotal.
     * 
     */
    public long getRecordsTotal() {
        return recordsTotal;
    }

    /**
     * Define el valor de la propiedad recordsTotal.
     * 
     */
    public void setRecordsTotal(long value) {
        this.recordsTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad actualPage.
     * 
     */
    public int getActualPage() {
        return actualPage;
    }

    /**
     * Define el valor de la propiedad actualPage.
     * 
     */
    public void setActualPage(int value) {
        this.actualPage = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPages.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Define el valor de la propiedad totalPages.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}

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
 *         &lt;element name="superiorLevelCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo"/&gt;
 *         &lt;element name="mlmChargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="mlmDischargedPoints" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="mlmChargedPointsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="mlmDischargedPointsCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="inferiorLevelCustomers" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo" maxOccurs="unbounded"/&gt;
 *         &lt;element name="currentCustomer" type="{http://FidelyNET3_SW_01_89_00}WS_CustomerInfo"/&gt;
 *         &lt;element name="pagination" type="{http://FidelyNET3_SW_01_89_00}WS_PaginationResult"/&gt;
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
    "superiorLevelCustomer",
    "mlmChargedPoints",
    "mlmDischargedPoints",
    "mlmChargedPointsCount",
    "mlmDischargedPointsCount",
    "inferiorLevelCustomers",
    "currentCustomer",
    "pagination"
})
@XmlRootElement(name = "GetMLMInfoResponse")
public class GetMLMInfoResponse {

    protected int answerCode;
    @XmlElement(required = true)
    protected WSCustomerInfo superiorLevelCustomer;
    protected double mlmChargedPoints;
    protected double mlmDischargedPoints;
    protected long mlmChargedPointsCount;
    protected long mlmDischargedPointsCount;
    @XmlElement(required = true)
    protected List<WSCustomerInfo> inferiorLevelCustomers;
    @XmlElement(required = true)
    protected WSCustomerInfo currentCustomer;
    @XmlElement(required = true)
    protected WSPaginationResult pagination;

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
     * Obtiene el valor de la propiedad superiorLevelCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInfo }
     *     
     */
    public WSCustomerInfo getSuperiorLevelCustomer() {
        return superiorLevelCustomer;
    }

    /**
     * Define el valor de la propiedad superiorLevelCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInfo }
     *     
     */
    public void setSuperiorLevelCustomer(WSCustomerInfo value) {
        this.superiorLevelCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmChargedPoints.
     * 
     */
    public double getMlmChargedPoints() {
        return mlmChargedPoints;
    }

    /**
     * Define el valor de la propiedad mlmChargedPoints.
     * 
     */
    public void setMlmChargedPoints(double value) {
        this.mlmChargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmDischargedPoints.
     * 
     */
    public double getMlmDischargedPoints() {
        return mlmDischargedPoints;
    }

    /**
     * Define el valor de la propiedad mlmDischargedPoints.
     * 
     */
    public void setMlmDischargedPoints(double value) {
        this.mlmDischargedPoints = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmChargedPointsCount.
     * 
     */
    public long getMlmChargedPointsCount() {
        return mlmChargedPointsCount;
    }

    /**
     * Define el valor de la propiedad mlmChargedPointsCount.
     * 
     */
    public void setMlmChargedPointsCount(long value) {
        this.mlmChargedPointsCount = value;
    }

    /**
     * Obtiene el valor de la propiedad mlmDischargedPointsCount.
     * 
     */
    public long getMlmDischargedPointsCount() {
        return mlmDischargedPointsCount;
    }

    /**
     * Define el valor de la propiedad mlmDischargedPointsCount.
     * 
     */
    public void setMlmDischargedPointsCount(long value) {
        this.mlmDischargedPointsCount = value;
    }

    /**
     * Gets the value of the inferiorLevelCustomers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inferiorLevelCustomers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInferiorLevelCustomers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCustomerInfo }
     * 
     * 
     */
    public List<WSCustomerInfo> getInferiorLevelCustomers() {
        if (inferiorLevelCustomers == null) {
            inferiorLevelCustomers = new ArrayList<WSCustomerInfo>();
        }
        return this.inferiorLevelCustomers;
    }

    /**
     * Obtiene el valor de la propiedad currentCustomer.
     * 
     * @return
     *     possible object is
     *     {@link WSCustomerInfo }
     *     
     */
    public WSCustomerInfo getCurrentCustomer() {
        return currentCustomer;
    }

    /**
     * Define el valor de la propiedad currentCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link WSCustomerInfo }
     *     
     */
    public void setCurrentCustomer(WSCustomerInfo value) {
        this.currentCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad pagination.
     * 
     * @return
     *     possible object is
     *     {@link WSPaginationResult }
     *     
     */
    public WSPaginationResult getPagination() {
        return pagination;
    }

    /**
     * Define el valor de la propiedad pagination.
     * 
     * @param value
     *     allowed object is
     *     {@link WSPaginationResult }
     *     
     */
    public void setPagination(WSPaginationResult value) {
        this.pagination = value;
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationDeleteCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationDeleteCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="difflistId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderCriteria" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationDeleteCriteria", propOrder = {
    "token",
    "difflistId",
    "orderCriteria"
})
public class SegmentationDeleteCriteria {

    @XmlElement(required = true)
    protected String token;
    protected long difflistId;
    protected int orderCriteria;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the difflistId property.
     * 
     */
    public long getDifflistId() {
        return difflistId;
    }

    /**
     * Sets the value of the difflistId property.
     * 
     */
    public void setDifflistId(long value) {
        this.difflistId = value;
    }

    /**
     * Gets the value of the orderCriteria property.
     * 
     */
    public int getOrderCriteria() {
        return orderCriteria;
    }

    /**
     * Sets the value of the orderCriteria property.
     * 
     */
    public void setOrderCriteria(int value) {
        this.orderCriteria = value;
    }

}

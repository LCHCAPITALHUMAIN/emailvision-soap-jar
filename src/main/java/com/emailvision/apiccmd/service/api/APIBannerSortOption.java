
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIBannerSortOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIBannerSortOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="column" type="{http://api.service.apiccmd.emailvision.com/}apiBannerCriteriaColumn" minOccurs="0"/>
 *         &lt;element name="order" type="{http://api.service.apiccmd.emailvision.com/}sortOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIBannerSortOption", propOrder = {
    "column",
    "order"
})
public class APIBannerSortOption {

    protected ApiBannerCriteriaColumn column;
    protected SortOrder order;

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBannerCriteriaColumn }
     *     
     */
    public ApiBannerCriteriaColumn getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBannerCriteriaColumn }
     *     
     */
    public void setColumn(ApiBannerCriteriaColumn value) {
        this.column = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrder }
     *     
     */
    public SortOrder getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrder }
     *     
     */
    public void setOrder(SortOrder value) {
        this.order = value;
    }

}

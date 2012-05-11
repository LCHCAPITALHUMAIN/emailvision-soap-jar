
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIBannerSearchCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIBannerSearchCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bannerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxModifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentType" type="{http://api.service.apiccmd.emailvision.com/}apiBannerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIBannerSearchCriteria", propOrder = {
    "bannerId",
    "name",
    "minCreatedDate",
    "maxCreatedDate",
    "minModifiedDate",
    "maxModifiedDate",
    "contentType"
})
public class APIBannerSearchCriteria {

    protected Long bannerId;
    protected String name;
    protected String minCreatedDate;
    protected String maxCreatedDate;
    protected String minModifiedDate;
    protected String maxModifiedDate;
    protected ApiBannerType contentType;

    /**
     * Gets the value of the bannerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBannerId() {
        return bannerId;
    }

    /**
     * Sets the value of the bannerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBannerId(Long value) {
        this.bannerId = value;
    }

    /**
     * Gets the value of the name property.
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
     * Sets the value of the name property.
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
     * Gets the value of the minCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinCreatedDate() {
        return minCreatedDate;
    }

    /**
     * Sets the value of the minCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinCreatedDate(String value) {
        this.minCreatedDate = value;
    }

    /**
     * Gets the value of the maxCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCreatedDate() {
        return maxCreatedDate;
    }

    /**
     * Sets the value of the maxCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCreatedDate(String value) {
        this.maxCreatedDate = value;
    }

    /**
     * Gets the value of the minModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinModifiedDate() {
        return minModifiedDate;
    }

    /**
     * Sets the value of the minModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinModifiedDate(String value) {
        this.minModifiedDate = value;
    }

    /**
     * Gets the value of the maxModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxModifiedDate() {
        return maxModifiedDate;
    }

    /**
     * Sets the value of the maxModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxModifiedDate(String value) {
        this.maxModifiedDate = value;
    }

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBannerType }
     *     
     */
    public ApiBannerType getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBannerType }
     *     
     */
    public void setContentType(ApiBannerType value) {
        this.contentType = value;
    }

}

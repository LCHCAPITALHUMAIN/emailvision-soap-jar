
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddStringDemographicCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddStringDemographicCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stringDemographicCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiStringDemographicCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddStringDemographicCriteriaByObj", propOrder = {
    "token",
    "stringDemographicCriteria"
})
public class SegmentationAddStringDemographicCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiStringDemographicCriteria stringDemographicCriteria;

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
     * Gets the value of the stringDemographicCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiStringDemographicCriteria }
     *     
     */
    public ApiStringDemographicCriteria getStringDemographicCriteria() {
        return stringDemographicCriteria;
    }

    /**
     * Sets the value of the stringDemographicCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiStringDemographicCriteria }
     *     
     */
    public void setStringDemographicCriteria(ApiStringDemographicCriteria value) {
        this.stringDemographicCriteria = value;
    }

}

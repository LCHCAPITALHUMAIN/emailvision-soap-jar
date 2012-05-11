
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddNumericDemographicCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddNumericDemographicCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numericDemographicCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiNumericDemographicCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddNumericDemographicCriteriaByObj", propOrder = {
    "token",
    "numericDemographicCriteria"
})
public class SegmentationAddNumericDemographicCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiNumericDemographicCriteria numericDemographicCriteria;

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
     * Gets the value of the numericDemographicCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiNumericDemographicCriteria }
     *     
     */
    public ApiNumericDemographicCriteria getNumericDemographicCriteria() {
        return numericDemographicCriteria;
    }

    /**
     * Sets the value of the numericDemographicCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiNumericDemographicCriteria }
     *     
     */
    public void setNumericDemographicCriteria(ApiNumericDemographicCriteria value) {
        this.numericDemographicCriteria = value;
    }

}

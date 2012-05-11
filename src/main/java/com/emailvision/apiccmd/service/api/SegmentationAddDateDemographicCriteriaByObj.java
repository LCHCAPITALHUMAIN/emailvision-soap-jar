
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddDateDemographicCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddDateDemographicCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateDemographicCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiDateDemographicCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddDateDemographicCriteriaByObj", propOrder = {
    "token",
    "dateDemographicCriteria"
})
public class SegmentationAddDateDemographicCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiDateDemographicCriteria dateDemographicCriteria;

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
     * Gets the value of the dateDemographicCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDateDemographicCriteria }
     *     
     */
    public ApiDateDemographicCriteria getDateDemographicCriteria() {
        return dateDemographicCriteria;
    }

    /**
     * Sets the value of the dateDemographicCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDateDemographicCriteria }
     *     
     */
    public void setDateDemographicCriteria(ApiDateDemographicCriteria value) {
        this.dateDemographicCriteria = value;
    }

}

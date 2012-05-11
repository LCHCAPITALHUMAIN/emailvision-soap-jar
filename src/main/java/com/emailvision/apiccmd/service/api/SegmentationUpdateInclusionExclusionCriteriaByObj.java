
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationUpdateInclusionExclusionCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationUpdateInclusionExclusionCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apiInclusionExclusionCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiInclusionExclusionCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationUpdateInclusionExclusionCriteriaByObj", propOrder = {
    "token",
    "apiInclusionExclusionCriteria"
})
public class SegmentationUpdateInclusionExclusionCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiInclusionExclusionCriteria apiInclusionExclusionCriteria;

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
     * Gets the value of the apiInclusionExclusionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiInclusionExclusionCriteria }
     *     
     */
    public ApiInclusionExclusionCriteria getApiInclusionExclusionCriteria() {
        return apiInclusionExclusionCriteria;
    }

    /**
     * Sets the value of the apiInclusionExclusionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiInclusionExclusionCriteria }
     *     
     */
    public void setApiInclusionExclusionCriteria(ApiInclusionExclusionCriteria value) {
        this.apiInclusionExclusionCriteria = value;
    }

}

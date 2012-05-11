
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddSocialNetworkCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddSocialNetworkCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="socialNetworkCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiSocialNetworkCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddSocialNetworkCriteriaByObj", propOrder = {
    "token",
    "socialNetworkCriteria"
})
public class SegmentationAddSocialNetworkCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiSocialNetworkCriteria socialNetworkCriteria;

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
     * Gets the value of the socialNetworkCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSocialNetworkCriteria }
     *     
     */
    public ApiSocialNetworkCriteria getSocialNetworkCriteria() {
        return socialNetworkCriteria;
    }

    /**
     * Sets the value of the socialNetworkCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSocialNetworkCriteria }
     *     
     */
    public void setSocialNetworkCriteria(ApiSocialNetworkCriteria value) {
        this.socialNetworkCriteria = value;
    }

}

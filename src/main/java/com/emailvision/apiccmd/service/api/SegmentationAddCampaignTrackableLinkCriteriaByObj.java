
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddCampaignTrackableLinkCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddCampaignTrackableLinkCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="trackableLinkCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiTrackableLinkCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddCampaignTrackableLinkCriteriaByObj", propOrder = {
    "token",
    "trackableLinkCriteria"
})
public class SegmentationAddCampaignTrackableLinkCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiTrackableLinkCriteria trackableLinkCriteria;

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
     * Gets the value of the trackableLinkCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackableLinkCriteria }
     *     
     */
    public ApiTrackableLinkCriteria getTrackableLinkCriteria() {
        return trackableLinkCriteria;
    }

    /**
     * Sets the value of the trackableLinkCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackableLinkCriteria }
     *     
     */
    public void setTrackableLinkCriteria(ApiTrackableLinkCriteria value) {
        this.trackableLinkCriteria = value;
    }

}

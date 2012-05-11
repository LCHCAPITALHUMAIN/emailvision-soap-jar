
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationAddCampaignActionCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationAddCampaignActionCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="actionCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiActionCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationAddCampaignActionCriteriaByObj", propOrder = {
    "token",
    "actionCriteria"
})
public class SegmentationAddCampaignActionCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiActionCriteria actionCriteria;

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
     * Gets the value of the actionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiActionCriteria }
     *     
     */
    public ApiActionCriteria getActionCriteria() {
        return actionCriteria;
    }

    /**
     * Sets the value of the actionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiActionCriteria }
     *     
     */
    public void setActionCriteria(ApiActionCriteria value) {
        this.actionCriteria = value;
    }

}

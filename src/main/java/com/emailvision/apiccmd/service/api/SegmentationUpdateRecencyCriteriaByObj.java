
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationUpdateRecencyCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationUpdateRecencyCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recencyCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiRecencyCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationUpdateRecencyCriteriaByObj", propOrder = {
    "token",
    "recencyCriteria"
})
public class SegmentationUpdateRecencyCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiRecencyCriteria recencyCriteria;

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
     * Gets the value of the recencyCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiRecencyCriteria }
     *     
     */
    public ApiRecencyCriteria getRecencyCriteria() {
        return recencyCriteria;
    }

    /**
     * Sets the value of the recencyCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiRecencyCriteria }
     *     
     */
    public void setRecencyCriteria(ApiRecencyCriteria value) {
        this.recencyCriteria = value;
    }

}

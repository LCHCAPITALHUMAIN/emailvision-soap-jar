
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationUpdateSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationUpdateSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apiSegmentation" type="{http://api.service.apiccmd.emailvision.com/}ApiSegmentation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationUpdateSegment", propOrder = {
    "token",
    "apiSegmentation"
})
public class SegmentationUpdateSegment {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiSegmentation apiSegmentation;

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
     * Gets the value of the apiSegmentation property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSegmentation }
     *     
     */
    public ApiSegmentation getApiSegmentation() {
        return apiSegmentation;
    }

    /**
     * Sets the value of the apiSegmentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSegmentation }
     *     
     */
    public void setApiSegmentation(ApiSegmentation value) {
        this.apiSegmentation = value;
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for segmentationUpdateDataMartCriteriaByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="segmentationUpdateDataMartCriteriaByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataMartCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiDataMartCriteria"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentationUpdateDataMartCriteriaByObj", propOrder = {
    "token",
    "dataMartCriteria"
})
public class SegmentationUpdateDataMartCriteriaByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiDataMartCriteria dataMartCriteria;

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
     * Gets the value of the dataMartCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDataMartCriteria }
     *     
     */
    public ApiDataMartCriteria getDataMartCriteria() {
        return dataMartCriteria;
    }

    /**
     * Sets the value of the dataMartCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDataMartCriteria }
     *     
     */
    public void setDataMartCriteria(ApiDataMartCriteria value) {
        this.dataMartCriteria = value;
    }

}

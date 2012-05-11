
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBannerByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBannerByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="banner" type="{http://api.service.apiccmd.emailvision.com/}apiBanner"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBannerByObj", propOrder = {
    "token",
    "banner"
})
public class CreateBannerByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiBanner banner;

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
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link ApiBanner }
     *     
     */
    public ApiBanner getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiBanner }
     *     
     */
    public void setBanner(ApiBanner value) {
        this.banner = value;
    }

}

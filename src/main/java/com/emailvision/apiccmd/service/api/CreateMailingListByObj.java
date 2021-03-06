
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createMailingListByObj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createMailingListByObj">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mailingList" type="{http://api.service.apiccmd.emailvision.com/}apiMailingList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createMailingListByObj", propOrder = {
    "token",
    "mailingList"
})
public class CreateMailingListByObj {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected ApiMailingList mailingList;

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
     * Gets the value of the mailingList property.
     * 
     * @return
     *     possible object is
     *     {@link ApiMailingList }
     *     
     */
    public ApiMailingList getMailingList() {
        return mailingList;
    }

    /**
     * Sets the value of the mailingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiMailingList }
     *     
     */
    public void setMailingList(ApiMailingList value) {
        this.mailingList = value;
    }

}

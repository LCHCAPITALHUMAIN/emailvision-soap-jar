
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMessageSummaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMessageSummaryList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listOptionsEntity" type="{http://api.service.apiccmd.emailvision.com/}APIMessageListOptions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMessageSummaryList", propOrder = {
    "token",
    "listOptionsEntity"
})
public class GetMessageSummaryList {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected APIMessageListOptions listOptionsEntity;

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
     * Gets the value of the listOptionsEntity property.
     * 
     * @return
     *     possible object is
     *     {@link APIMessageListOptions }
     *     
     */
    public APIMessageListOptions getListOptionsEntity() {
        return listOptionsEntity;
    }

    /**
     * Sets the value of the listOptionsEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIMessageListOptions }
     *     
     */
    public void setListOptionsEntity(APIMessageListOptions value) {
        this.listOptionsEntity = value;
    }

}

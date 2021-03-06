
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createAndAddActionBannerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createAndAddActionBannerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bannerId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageOK" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="pageError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageError" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createAndAddActionBannerLink", propOrder = {
    "token",
    "bannerId",
    "name",
    "action",
    "pageOK",
    "messageOK",
    "pageError",
    "messageError"
})
public class CreateAndAddActionBannerLink {

    @XmlElement(required = true)
    protected String token;
    protected long bannerId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String action;
    protected String pageOK;
    protected long messageOK;
    protected String pageError;
    protected long messageError;

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
     * Gets the value of the bannerId property.
     * 
     */
    public long getBannerId() {
        return bannerId;
    }

    /**
     * Sets the value of the bannerId property.
     * 
     */
    public void setBannerId(long value) {
        this.bannerId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the pageOK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageOK() {
        return pageOK;
    }

    /**
     * Sets the value of the pageOK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageOK(String value) {
        this.pageOK = value;
    }

    /**
     * Gets the value of the messageOK property.
     * 
     */
    public long getMessageOK() {
        return messageOK;
    }

    /**
     * Sets the value of the messageOK property.
     * 
     */
    public void setMessageOK(long value) {
        this.messageOK = value;
    }

    /**
     * Gets the value of the pageError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageError() {
        return pageError;
    }

    /**
     * Sets the value of the pageError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageError(String value) {
        this.pageError = value;
    }

    /**
     * Gets the value of the messageError property.
     * 
     */
    public long getMessageError() {
        return messageError;
    }

    /**
     * Sets the value of the messageError property.
     * 
     */
    public void setMessageError(long value) {
        this.messageError = value;
    }

}

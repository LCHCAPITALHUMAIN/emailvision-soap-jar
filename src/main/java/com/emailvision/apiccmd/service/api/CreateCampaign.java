
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mailingListId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="notifProgress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postClickTracking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="emaildedupflg" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createCampaign", propOrder = {
    "token",
    "name",
    "desc",
    "sendDate",
    "messageId",
    "mailingListId",
    "notifProgress",
    "postClickTracking",
    "emaildedupflg"
})
public class CreateCampaign {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String name;
    protected String desc;
    @XmlElement(required = true)
    protected String sendDate;
    protected long messageId;
    protected long mailingListId;
    protected boolean notifProgress;
    protected boolean postClickTracking;
    protected boolean emaildedupflg;

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
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendDate(String value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(long value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the mailingListId property.
     * 
     */
    public long getMailingListId() {
        return mailingListId;
    }

    /**
     * Sets the value of the mailingListId property.
     * 
     */
    public void setMailingListId(long value) {
        this.mailingListId = value;
    }

    /**
     * Gets the value of the notifProgress property.
     * 
     */
    public boolean isNotifProgress() {
        return notifProgress;
    }

    /**
     * Sets the value of the notifProgress property.
     * 
     */
    public void setNotifProgress(boolean value) {
        this.notifProgress = value;
    }

    /**
     * Gets the value of the postClickTracking property.
     * 
     */
    public boolean isPostClickTracking() {
        return postClickTracking;
    }

    /**
     * Sets the value of the postClickTracking property.
     * 
     */
    public void setPostClickTracking(boolean value) {
        this.postClickTracking = value;
    }

    /**
     * Gets the value of the emaildedupflg property.
     * 
     */
    public boolean isEmaildedupflg() {
        return emaildedupflg;
    }

    /**
     * Sets the value of the emaildedupflg property.
     * 
     */
    public void setEmaildedupflg(boolean value) {
        this.emaildedupflg = value;
    }

}

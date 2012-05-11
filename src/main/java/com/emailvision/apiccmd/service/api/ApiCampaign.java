
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for apiCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analytics" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deliverySpeed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emaildedupflg" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="lifeStatus" type="{http://api.service.apiccmd.emailvision.com/}apiLifeStatus" minOccurs="0"/>
 *         &lt;element name="mailinglistId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notification" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="postClickTracking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="segmentIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sendDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="status" type="{http://api.service.apiccmd.emailvision.com/}apiCampaignStatus" minOccurs="0"/>
 *         &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlEndCampaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valid" type="{http://api.service.apiccmd.emailvision.com/}apiValidStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiCampaign", propOrder = {
    "analytics",
    "deliverySpeed",
    "description",
    "emaildedupflg",
    "format",
    "id",
    "lifeStatus",
    "mailinglistId",
    "messageId",
    "name",
    "notification",
    "postClickTracking",
    "segmentIds",
    "sendDate",
    "status",
    "strategy",
    "target",
    "urlEndCampaign",
    "urlHost",
    "valid"
})
public class ApiCampaign {

    protected boolean analytics;
    protected int deliverySpeed;
    protected String description;
    protected boolean emaildedupflg;
    protected String format;
    protected long id;
    protected ApiLifeStatus lifeStatus;
    protected long mailinglistId;
    protected Long messageId;
    protected String name;
    protected boolean notification;
    protected boolean postClickTracking;
    @XmlElement(nillable = true)
    protected List<Long> segmentIds;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendDate;
    protected ApiCampaignStatus status;
    protected String strategy;
    protected String target;
    protected String urlEndCampaign;
    protected String urlHost;
    protected ApiValidStatus valid;

    /**
     * Gets the value of the analytics property.
     * 
     */
    public boolean isAnalytics() {
        return analytics;
    }

    /**
     * Sets the value of the analytics property.
     * 
     */
    public void setAnalytics(boolean value) {
        this.analytics = value;
    }

    /**
     * Gets the value of the deliverySpeed property.
     * 
     */
    public int getDeliverySpeed() {
        return deliverySpeed;
    }

    /**
     * Sets the value of the deliverySpeed property.
     * 
     */
    public void setDeliverySpeed(int value) {
        this.deliverySpeed = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the lifeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ApiLifeStatus }
     *     
     */
    public ApiLifeStatus getLifeStatus() {
        return lifeStatus;
    }

    /**
     * Sets the value of the lifeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiLifeStatus }
     *     
     */
    public void setLifeStatus(ApiLifeStatus value) {
        this.lifeStatus = value;
    }

    /**
     * Gets the value of the mailinglistId property.
     * 
     */
    public long getMailinglistId() {
        return mailinglistId;
    }

    /**
     * Sets the value of the mailinglistId property.
     * 
     */
    public void setMailinglistId(long value) {
        this.mailinglistId = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMessageId(Long value) {
        this.messageId = value;
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
     * Gets the value of the notification property.
     * 
     */
    public boolean isNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     */
    public void setNotification(boolean value) {
        this.notification = value;
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
     * Gets the value of the segmentIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentIds() {
        if (segmentIds == null) {
            segmentIds = new ArrayList<Long>();
        }
        return this.segmentIds;
    }

    /**
     * Gets the value of the sendDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendDate() {
        return sendDate;
    }

    /**
     * Sets the value of the sendDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendDate(XMLGregorianCalendar value) {
        this.sendDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ApiCampaignStatus }
     *     
     */
    public ApiCampaignStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiCampaignStatus }
     *     
     */
    public void setStatus(ApiCampaignStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the strategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * Sets the value of the strategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrategy(String value) {
        this.strategy = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the urlEndCampaign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEndCampaign() {
        return urlEndCampaign;
    }

    /**
     * Sets the value of the urlEndCampaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEndCampaign(String value) {
        this.urlEndCampaign = value;
    }

    /**
     * Gets the value of the urlHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlHost() {
        return urlHost;
    }

    /**
     * Sets the value of the urlHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlHost(String value) {
        this.urlHost = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link ApiValidStatus }
     *     
     */
    public ApiValidStatus getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiValidStatus }
     *     
     */
    public void setValid(ApiValidStatus value) {
        this.valid = value;
    }

}

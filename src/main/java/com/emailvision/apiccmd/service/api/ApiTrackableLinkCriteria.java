
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiTrackableLinkCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiTrackableLinkCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="linkOrder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiTrackableLinkOperator" minOccurs="0"/>
 *         &lt;element name="periodDayBegin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="periodDayEnd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serieId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiTrackableLinkCriteria", propOrder = {
    "campaignId",
    "linkOrder",
    "messageOrder",
    "operator",
    "periodDayBegin",
    "periodDayEnd",
    "serieId"
})
public class ApiTrackableLinkCriteria
    extends ApiSegmentationCriteria
{

    protected long campaignId;
    protected long linkOrder;
    protected int messageOrder;
    protected ApiTrackableLinkOperator operator;
    protected int periodDayBegin;
    protected int periodDayEnd;
    protected long serieId;

    /**
     * Gets the value of the campaignId property.
     * 
     */
    public long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     */
    public void setCampaignId(long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the linkOrder property.
     * 
     */
    public long getLinkOrder() {
        return linkOrder;
    }

    /**
     * Sets the value of the linkOrder property.
     * 
     */
    public void setLinkOrder(long value) {
        this.linkOrder = value;
    }

    /**
     * Gets the value of the messageOrder property.
     * 
     */
    public int getMessageOrder() {
        return messageOrder;
    }

    /**
     * Sets the value of the messageOrder property.
     * 
     */
    public void setMessageOrder(int value) {
        this.messageOrder = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ApiTrackableLinkOperator }
     *     
     */
    public ApiTrackableLinkOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiTrackableLinkOperator }
     *     
     */
    public void setOperator(ApiTrackableLinkOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the periodDayBegin property.
     * 
     */
    public int getPeriodDayBegin() {
        return periodDayBegin;
    }

    /**
     * Sets the value of the periodDayBegin property.
     * 
     */
    public void setPeriodDayBegin(int value) {
        this.periodDayBegin = value;
    }

    /**
     * Gets the value of the periodDayEnd property.
     * 
     */
    public int getPeriodDayEnd() {
        return periodDayEnd;
    }

    /**
     * Sets the value of the periodDayEnd property.
     * 
     */
    public void setPeriodDayEnd(int value) {
        this.periodDayEnd = value;
    }

    /**
     * Gets the value of the serieId property.
     * 
     */
    public long getSerieId() {
        return serieId;
    }

    /**
     * Sets the value of the serieId property.
     * 
     */
    public void setSerieId(long value) {
        this.serieId = value;
    }

}

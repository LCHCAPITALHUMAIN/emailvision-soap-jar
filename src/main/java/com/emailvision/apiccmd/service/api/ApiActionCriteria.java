
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiActionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiActionCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiActionOperator" minOccurs="0"/>
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
@XmlType(name = "apiActionCriteria", propOrder = {
    "campaignId",
    "messageOrder",
    "operator",
    "serieId"
})
public class ApiActionCriteria
    extends ApiSegmentationCriteria
{

    protected long campaignId;
    protected int messageOrder;
    protected ApiActionOperator operator;
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
     *     {@link ApiActionOperator }
     *     
     */
    public ApiActionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiActionOperator }
     *     
     */
    public void setOperator(ApiActionOperator value) {
        this.operator = value;
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


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSocialNetworkCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiSocialNetworkCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="columnName" type="{http://api.service.apiccmd.emailvision.com/}apiSocialNetworkColumn" minOccurs="0"/>
 *         &lt;element name="messageOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiSocialNetworkOperator" minOccurs="0"/>
 *         &lt;element name="serieId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="snIds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiSocialNetworkCriteria", propOrder = {
    "campaignId",
    "columnName",
    "messageOrder",
    "operator",
    "serieId",
    "snIds",
    "value1",
    "value2"
})
public class ApiSocialNetworkCriteria
    extends ApiSegmentationCriteria
{

    protected long campaignId;
    protected ApiSocialNetworkColumn columnName;
    protected int messageOrder;
    protected ApiSocialNetworkOperator operator;
    protected long serieId;
    protected String snIds;
    protected long value1;
    protected long value2;

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
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link ApiSocialNetworkColumn }
     *     
     */
    public ApiSocialNetworkColumn getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSocialNetworkColumn }
     *     
     */
    public void setColumnName(ApiSocialNetworkColumn value) {
        this.columnName = value;
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
     *     {@link ApiSocialNetworkOperator }
     *     
     */
    public ApiSocialNetworkOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiSocialNetworkOperator }
     *     
     */
    public void setOperator(ApiSocialNetworkOperator value) {
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

    /**
     * Gets the value of the snIds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnIds() {
        return snIds;
    }

    /**
     * Sets the value of the snIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnIds(String value) {
        this.snIds = value;
    }

    /**
     * Gets the value of the value1 property.
     * 
     */
    public long getValue1() {
        return value1;
    }

    /**
     * Sets the value of the value1 property.
     * 
     */
    public void setValue1(long value) {
        this.value1 = value;
    }

    /**
     * Gets the value of the value2 property.
     * 
     */
    public long getValue2() {
        return value2;
    }

    /**
     * Sets the value of the value2 property.
     * 
     */
    public void setValue2(long value) {
        this.value2 = value;
    }

}

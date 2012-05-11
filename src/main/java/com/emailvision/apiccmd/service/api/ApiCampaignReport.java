
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for apiCampaignReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiCampaignReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="initDuration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbBadEmail" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbConversion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbError" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbJoin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbMessage" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbMultiple" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbOpen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbOpened" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbResponse" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSelected" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSingle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSkipped" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSoftError" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbTotalClick" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbUniqueClick" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbUnjoined" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="passThruFlg" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiCampaignReport", propOrder = {
    "beginDate",
    "campaignId",
    "endDate",
    "initDuration",
    "messageId",
    "nbBadEmail",
    "nbConversion",
    "nbError",
    "nbJoin",
    "nbMessage",
    "nbMultiple",
    "nbOpen",
    "nbOpened",
    "nbResponse",
    "nbSelected",
    "nbSingle",
    "nbSkipped",
    "nbSoftError",
    "nbTotalClick",
    "nbUniqueClick",
    "nbUnjoined",
    "passThruFlg"
})
public class ApiCampaignReport {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    protected long campaignId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected long initDuration;
    protected long messageId;
    protected long nbBadEmail;
    protected long nbConversion;
    protected long nbError;
    protected long nbJoin;
    protected long nbMessage;
    protected long nbMultiple;
    protected long nbOpen;
    protected long nbOpened;
    protected long nbResponse;
    protected long nbSelected;
    protected long nbSingle;
    protected long nbSkipped;
    protected long nbSoftError;
    protected long nbTotalClick;
    protected long nbUniqueClick;
    protected long nbUnjoined;
    protected boolean passThruFlg;

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

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
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the initDuration property.
     * 
     */
    public long getInitDuration() {
        return initDuration;
    }

    /**
     * Sets the value of the initDuration property.
     * 
     */
    public void setInitDuration(long value) {
        this.initDuration = value;
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
     * Gets the value of the nbBadEmail property.
     * 
     */
    public long getNbBadEmail() {
        return nbBadEmail;
    }

    /**
     * Sets the value of the nbBadEmail property.
     * 
     */
    public void setNbBadEmail(long value) {
        this.nbBadEmail = value;
    }

    /**
     * Gets the value of the nbConversion property.
     * 
     */
    public long getNbConversion() {
        return nbConversion;
    }

    /**
     * Sets the value of the nbConversion property.
     * 
     */
    public void setNbConversion(long value) {
        this.nbConversion = value;
    }

    /**
     * Gets the value of the nbError property.
     * 
     */
    public long getNbError() {
        return nbError;
    }

    /**
     * Sets the value of the nbError property.
     * 
     */
    public void setNbError(long value) {
        this.nbError = value;
    }

    /**
     * Gets the value of the nbJoin property.
     * 
     */
    public long getNbJoin() {
        return nbJoin;
    }

    /**
     * Sets the value of the nbJoin property.
     * 
     */
    public void setNbJoin(long value) {
        this.nbJoin = value;
    }

    /**
     * Gets the value of the nbMessage property.
     * 
     */
    public long getNbMessage() {
        return nbMessage;
    }

    /**
     * Sets the value of the nbMessage property.
     * 
     */
    public void setNbMessage(long value) {
        this.nbMessage = value;
    }

    /**
     * Gets the value of the nbMultiple property.
     * 
     */
    public long getNbMultiple() {
        return nbMultiple;
    }

    /**
     * Sets the value of the nbMultiple property.
     * 
     */
    public void setNbMultiple(long value) {
        this.nbMultiple = value;
    }

    /**
     * Gets the value of the nbOpen property.
     * 
     */
    public long getNbOpen() {
        return nbOpen;
    }

    /**
     * Sets the value of the nbOpen property.
     * 
     */
    public void setNbOpen(long value) {
        this.nbOpen = value;
    }

    /**
     * Gets the value of the nbOpened property.
     * 
     */
    public long getNbOpened() {
        return nbOpened;
    }

    /**
     * Sets the value of the nbOpened property.
     * 
     */
    public void setNbOpened(long value) {
        this.nbOpened = value;
    }

    /**
     * Gets the value of the nbResponse property.
     * 
     */
    public long getNbResponse() {
        return nbResponse;
    }

    /**
     * Sets the value of the nbResponse property.
     * 
     */
    public void setNbResponse(long value) {
        this.nbResponse = value;
    }

    /**
     * Gets the value of the nbSelected property.
     * 
     */
    public long getNbSelected() {
        return nbSelected;
    }

    /**
     * Sets the value of the nbSelected property.
     * 
     */
    public void setNbSelected(long value) {
        this.nbSelected = value;
    }

    /**
     * Gets the value of the nbSingle property.
     * 
     */
    public long getNbSingle() {
        return nbSingle;
    }

    /**
     * Sets the value of the nbSingle property.
     * 
     */
    public void setNbSingle(long value) {
        this.nbSingle = value;
    }

    /**
     * Gets the value of the nbSkipped property.
     * 
     */
    public long getNbSkipped() {
        return nbSkipped;
    }

    /**
     * Sets the value of the nbSkipped property.
     * 
     */
    public void setNbSkipped(long value) {
        this.nbSkipped = value;
    }

    /**
     * Gets the value of the nbSoftError property.
     * 
     */
    public long getNbSoftError() {
        return nbSoftError;
    }

    /**
     * Sets the value of the nbSoftError property.
     * 
     */
    public void setNbSoftError(long value) {
        this.nbSoftError = value;
    }

    /**
     * Gets the value of the nbTotalClick property.
     * 
     */
    public long getNbTotalClick() {
        return nbTotalClick;
    }

    /**
     * Sets the value of the nbTotalClick property.
     * 
     */
    public void setNbTotalClick(long value) {
        this.nbTotalClick = value;
    }

    /**
     * Gets the value of the nbUniqueClick property.
     * 
     */
    public long getNbUniqueClick() {
        return nbUniqueClick;
    }

    /**
     * Sets the value of the nbUniqueClick property.
     * 
     */
    public void setNbUniqueClick(long value) {
        this.nbUniqueClick = value;
    }

    /**
     * Gets the value of the nbUnjoined property.
     * 
     */
    public long getNbUnjoined() {
        return nbUnjoined;
    }

    /**
     * Sets the value of the nbUnjoined property.
     * 
     */
    public void setNbUnjoined(long value) {
        this.nbUnjoined = value;
    }

    /**
     * Gets the value of the passThruFlg property.
     * 
     */
    public boolean isPassThruFlg() {
        return passThruFlg;
    }

    /**
     * Sets the value of the passThruFlg property.
     * 
     */
    public void setPassThruFlg(boolean value) {
        this.passThruFlg = value;
    }

}

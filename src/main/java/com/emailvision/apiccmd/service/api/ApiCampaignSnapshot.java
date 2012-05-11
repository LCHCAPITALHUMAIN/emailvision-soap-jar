
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for apiCampaignSnapshot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiCampaignSnapshot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nbBounce" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbComplaint" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbConversion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbDelivered" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbFiltered" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbHardBounce" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSelected" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbSoftBounce" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbUniqueClick" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbUniqueOpen" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nbUnsubscribe" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiCampaignSnapshot", propOrder = {
    "beginDate",
    "campaignId",
    "endDate",
    "nbBounce",
    "nbComplaint",
    "nbConversion",
    "nbDelivered",
    "nbFiltered",
    "nbHardBounce",
    "nbSelected",
    "nbSoftBounce",
    "nbUniqueClick",
    "nbUniqueOpen",
    "nbUnsubscribe"
})
public class ApiCampaignSnapshot {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDate;
    protected long campaignId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected long nbBounce;
    protected long nbComplaint;
    protected long nbConversion;
    protected long nbDelivered;
    protected long nbFiltered;
    protected long nbHardBounce;
    protected long nbSelected;
    protected long nbSoftBounce;
    protected long nbUniqueClick;
    protected long nbUniqueOpen;
    protected long nbUnsubscribe;

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
     * Gets the value of the nbBounce property.
     * 
     */
    public long getNbBounce() {
        return nbBounce;
    }

    /**
     * Sets the value of the nbBounce property.
     * 
     */
    public void setNbBounce(long value) {
        this.nbBounce = value;
    }

    /**
     * Gets the value of the nbComplaint property.
     * 
     */
    public long getNbComplaint() {
        return nbComplaint;
    }

    /**
     * Sets the value of the nbComplaint property.
     * 
     */
    public void setNbComplaint(long value) {
        this.nbComplaint = value;
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
     * Gets the value of the nbDelivered property.
     * 
     */
    public long getNbDelivered() {
        return nbDelivered;
    }

    /**
     * Sets the value of the nbDelivered property.
     * 
     */
    public void setNbDelivered(long value) {
        this.nbDelivered = value;
    }

    /**
     * Gets the value of the nbFiltered property.
     * 
     */
    public long getNbFiltered() {
        return nbFiltered;
    }

    /**
     * Sets the value of the nbFiltered property.
     * 
     */
    public void setNbFiltered(long value) {
        this.nbFiltered = value;
    }

    /**
     * Gets the value of the nbHardBounce property.
     * 
     */
    public long getNbHardBounce() {
        return nbHardBounce;
    }

    /**
     * Sets the value of the nbHardBounce property.
     * 
     */
    public void setNbHardBounce(long value) {
        this.nbHardBounce = value;
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
     * Gets the value of the nbSoftBounce property.
     * 
     */
    public long getNbSoftBounce() {
        return nbSoftBounce;
    }

    /**
     * Sets the value of the nbSoftBounce property.
     * 
     */
    public void setNbSoftBounce(long value) {
        this.nbSoftBounce = value;
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
     * Gets the value of the nbUniqueOpen property.
     * 
     */
    public long getNbUniqueOpen() {
        return nbUniqueOpen;
    }

    /**
     * Sets the value of the nbUniqueOpen property.
     * 
     */
    public void setNbUniqueOpen(long value) {
        this.nbUniqueOpen = value;
    }

    /**
     * Gets the value of the nbUnsubscribe property.
     * 
     */
    public long getNbUnsubscribe() {
        return nbUnsubscribe;
    }

    /**
     * Sets the value of the nbUnsubscribe property.
     * 
     */
    public void setNbUnsubscribe(long value) {
        this.nbUnsubscribe = value;
    }

}

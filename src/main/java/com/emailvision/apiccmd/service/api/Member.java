
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for member complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="member">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dateJoin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUnJoin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emvCellPhone" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="emvHBQ" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emvISP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hbqRaison" type="{http://api.service.apiccmd.emailvision.com/}hbqReason" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://api.service.apiccmd.emailvision.com/}status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "member", propOrder = {
    "clientId",
    "dateJoin",
    "dateUnJoin",
    "email",
    "emvCellPhone",
    "emvHBQ",
    "emvISP",
    "hbqRaison",
    "id",
    "status"
})
public class Member {

    protected long clientId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateJoin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUnJoin;
    protected String email;
    protected Long emvCellPhone;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emvHBQ;
    protected String emvISP;
    protected HbqReason hbqRaison;
    protected long id;
    protected Status status;

    /**
     * Gets the value of the clientId property.
     * 
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     */
    public void setClientId(long value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the dateJoin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateJoin() {
        return dateJoin;
    }

    /**
     * Sets the value of the dateJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateJoin(XMLGregorianCalendar value) {
        this.dateJoin = value;
    }

    /**
     * Gets the value of the dateUnJoin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUnJoin() {
        return dateUnJoin;
    }

    /**
     * Sets the value of the dateUnJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUnJoin(XMLGregorianCalendar value) {
        this.dateUnJoin = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the emvCellPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmvCellPhone() {
        return emvCellPhone;
    }

    /**
     * Sets the value of the emvCellPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmvCellPhone(Long value) {
        this.emvCellPhone = value;
    }

    /**
     * Gets the value of the emvHBQ property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmvHBQ() {
        return emvHBQ;
    }

    /**
     * Sets the value of the emvHBQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmvHBQ(XMLGregorianCalendar value) {
        this.emvHBQ = value;
    }

    /**
     * Gets the value of the emvISP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmvISP() {
        return emvISP;
    }

    /**
     * Sets the value of the emvISP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmvISP(String value) {
        this.emvISP = value;
    }

    /**
     * Gets the value of the hbqRaison property.
     * 
     * @return
     *     possible object is
     *     {@link HbqReason }
     *     
     */
    public HbqReason getHbqRaison() {
        return hbqRaison;
    }

    /**
     * Sets the value of the hbqRaison property.
     * 
     * @param value
     *     allowed object is
     *     {@link HbqReason }
     *     
     */
    public void setHbqRaison(HbqReason value) {
        this.hbqRaison = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

}

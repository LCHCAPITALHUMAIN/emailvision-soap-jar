
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
 * <p>Java class for apiDateDemographicCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiDateDemographicCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="absoluteDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstAbsoluteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberDaysBeforeOrAfter" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiDateDemographicOperator" minOccurs="0"/>
 *         &lt;element name="relativeColumnNameBeforeOrAfter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secondAbsoluteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiDateDemographicCriteria", propOrder = {
    "absoluteDate",
    "columnName",
    "firstAbsoluteDate",
    "numberDaysBeforeOrAfter",
    "operator",
    "relativeColumnNameBeforeOrAfter",
    "secondAbsoluteDate"
})
public class ApiDateDemographicCriteria
    extends ApiSegmentationCriteria
{

    protected boolean absoluteDate;
    protected String columnName;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> firstAbsoluteDate;
    @XmlElement(nillable = true)
    protected List<Long> numberDaysBeforeOrAfter;
    protected ApiDateDemographicOperator operator;
    @XmlElement(nillable = true)
    protected List<String> relativeColumnNameBeforeOrAfter;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> secondAbsoluteDate;

    /**
     * Gets the value of the absoluteDate property.
     * 
     */
    public boolean isAbsoluteDate() {
        return absoluteDate;
    }

    /**
     * Sets the value of the absoluteDate property.
     * 
     */
    public void setAbsoluteDate(boolean value) {
        this.absoluteDate = value;
    }

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnName(String value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the firstAbsoluteDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstAbsoluteDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstAbsoluteDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getFirstAbsoluteDate() {
        if (firstAbsoluteDate == null) {
            firstAbsoluteDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.firstAbsoluteDate;
    }

    /**
     * Gets the value of the numberDaysBeforeOrAfter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberDaysBeforeOrAfter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberDaysBeforeOrAfter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getNumberDaysBeforeOrAfter() {
        if (numberDaysBeforeOrAfter == null) {
            numberDaysBeforeOrAfter = new ArrayList<Long>();
        }
        return this.numberDaysBeforeOrAfter;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ApiDateDemographicOperator }
     *     
     */
    public ApiDateDemographicOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiDateDemographicOperator }
     *     
     */
    public void setOperator(ApiDateDemographicOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the relativeColumnNameBeforeOrAfter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativeColumnNameBeforeOrAfter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelativeColumnNameBeforeOrAfter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRelativeColumnNameBeforeOrAfter() {
        if (relativeColumnNameBeforeOrAfter == null) {
            relativeColumnNameBeforeOrAfter = new ArrayList<String>();
        }
        return this.relativeColumnNameBeforeOrAfter;
    }

    /**
     * Gets the value of the secondAbsoluteDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondAbsoluteDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondAbsoluteDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getSecondAbsoluteDate() {
        if (secondAbsoluteDate == null) {
            secondAbsoluteDate = new ArrayList<XMLGregorianCalendar>();
        }
        return this.secondAbsoluteDate;
    }

}

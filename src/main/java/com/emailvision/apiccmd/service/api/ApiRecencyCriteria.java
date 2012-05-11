
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
 * <p>Java class for apiRecencyCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiRecencyCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://api.service.apiccmd.emailvision.com/}apiRecencyColumn" minOccurs="0"/>
 *         &lt;element name="firstStaticValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiRecencyOperator" minOccurs="0"/>
 *         &lt;element name="periodDayBeginList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodDayEndList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="secondStaticValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiRecencyCriteria", propOrder = {
    "columnName",
    "firstStaticValue",
    "operator",
    "periodDayBeginList",
    "periodDayEndList",
    "secondStaticValue"
})
public class ApiRecencyCriteria
    extends ApiSegmentationCriteria
{

    protected ApiRecencyColumn columnName;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> firstStaticValue;
    protected ApiRecencyOperator operator;
    @XmlElement(nillable = true)
    protected List<Integer> periodDayBeginList;
    @XmlElement(nillable = true)
    protected List<Integer> periodDayEndList;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> secondStaticValue;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link ApiRecencyColumn }
     *     
     */
    public ApiRecencyColumn getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiRecencyColumn }
     *     
     */
    public void setColumnName(ApiRecencyColumn value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the firstStaticValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstStaticValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstStaticValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getFirstStaticValue() {
        if (firstStaticValue == null) {
            firstStaticValue = new ArrayList<XMLGregorianCalendar>();
        }
        return this.firstStaticValue;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ApiRecencyOperator }
     *     
     */
    public ApiRecencyOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiRecencyOperator }
     *     
     */
    public void setOperator(ApiRecencyOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the periodDayBeginList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodDayBeginList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodDayBeginList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPeriodDayBeginList() {
        if (periodDayBeginList == null) {
            periodDayBeginList = new ArrayList<Integer>();
        }
        return this.periodDayBeginList;
    }

    /**
     * Gets the value of the periodDayEndList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodDayEndList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodDayEndList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPeriodDayEndList() {
        if (periodDayEndList == null) {
            periodDayEndList = new ArrayList<Integer>();
        }
        return this.periodDayEndList;
    }

    /**
     * Gets the value of the secondStaticValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondStaticValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondStaticValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getSecondStaticValue() {
        if (secondStaticValue == null) {
            secondStaticValue = new ArrayList<XMLGregorianCalendar>();
        }
        return this.secondStaticValue;
    }

}

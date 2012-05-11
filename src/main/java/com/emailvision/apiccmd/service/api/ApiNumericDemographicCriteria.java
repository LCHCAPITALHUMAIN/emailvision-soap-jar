
package com.emailvision.apiccmd.service.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiNumericDemographicCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiNumericDemographicCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="columnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstValue" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiNumericDemographicOperator" minOccurs="0"/>
 *         &lt;element name="secondValue" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiNumericDemographicCriteria", propOrder = {
    "columnName",
    "firstValue",
    "operator",
    "secondValue"
})
public class ApiNumericDemographicCriteria
    extends ApiSegmentationCriteria
{

    protected String columnName;
    @XmlElement(nillable = true)
    protected List<Long> firstValue;
    protected ApiNumericDemographicOperator operator;
    @XmlElement(nillable = true)
    protected List<Long> secondValue;

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
     * Gets the value of the firstValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getFirstValue() {
        if (firstValue == null) {
            firstValue = new ArrayList<Long>();
        }
        return this.firstValue;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ApiNumericDemographicOperator }
     *     
     */
    public ApiNumericDemographicOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiNumericDemographicOperator }
     *     
     */
    public void setOperator(ApiNumericDemographicOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the secondValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSecondValue() {
        if (secondValue == null) {
            secondValue = new ArrayList<Long>();
        }
        return this.secondValue;
    }

}

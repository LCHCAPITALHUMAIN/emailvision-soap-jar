
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiInclusionExclusionCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiInclusionExclusionCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="difflistId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="operator" type="{http://api.service.apiccmd.emailvision.com/}apiInclusionExclusionOperator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiInclusionExclusionCriteria", propOrder = {
    "difflistId",
    "operator"
})
public class ApiInclusionExclusionCriteria
    extends ApiSegmentationCriteria
{

    protected long difflistId;
    protected ApiInclusionExclusionOperator operator;

    /**
     * Gets the value of the difflistId property.
     * 
     */
    public long getDifflistId() {
        return difflistId;
    }

    /**
     * Sets the value of the difflistId property.
     * 
     */
    public void setDifflistId(long value) {
        this.difflistId = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link ApiInclusionExclusionOperator }
     *     
     */
    public ApiInclusionExclusionOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiInclusionExclusionOperator }
     *     
     */
    public void setOperator(ApiInclusionExclusionOperator value) {
        this.operator = value;
    }

}

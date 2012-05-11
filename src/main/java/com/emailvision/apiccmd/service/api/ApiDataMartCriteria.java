
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiDataMartCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiDataMartCriteria">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apiccmd.emailvision.com/}apiSegmentationCriteria">
 *       &lt;sequence>
 *         &lt;element name="apiPersoFragCriteria" type="{http://api.service.apiccmd.emailvision.com/}apiPersoFragCriteria" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiDataMartCriteria", propOrder = {
    "apiPersoFragCriteria"
})
public class ApiDataMartCriteria
    extends ApiSegmentationCriteria
{

    protected ApiPersoFragCriteria apiPersoFragCriteria;

    /**
     * Gets the value of the apiPersoFragCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ApiPersoFragCriteria }
     *     
     */
    public ApiPersoFragCriteria getApiPersoFragCriteria() {
        return apiPersoFragCriteria;
    }

    /**
     * Sets the value of the apiPersoFragCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiPersoFragCriteria }
     *     
     */
    public void setApiPersoFragCriteria(ApiPersoFragCriteria value) {
        this.apiPersoFragCriteria = value;
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiPersoFragCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apiPersoFragCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="persoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="persoSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="persoFragId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apiPersoFragCriteria", propOrder = {
    "persoName",
    "persoDesc",
    "persoSQL"
})
public class ApiPersoFragCriteria {

    protected String persoName;
    protected String persoDesc;
    protected String persoSQL;
    @XmlAttribute(required = true)
    protected long persoFragId;

    /**
     * Gets the value of the persoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersoName() {
        return persoName;
    }

    /**
     * Sets the value of the persoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersoName(String value) {
        this.persoName = value;
    }

    /**
     * Gets the value of the persoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersoDesc() {
        return persoDesc;
    }

    /**
     * Sets the value of the persoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersoDesc(String value) {
        this.persoDesc = value;
    }

    /**
     * Gets the value of the persoSQL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersoSQL() {
        return persoSQL;
    }

    /**
     * Sets the value of the persoSQL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersoSQL(String value) {
        this.persoSQL = value;
    }

    /**
     * Gets the value of the persoFragId property.
     * 
     */
    public long getPersoFragId() {
        return persoFragId;
    }

    /**
     * Sets the value of the persoFragId property.
     * 
     */
    public void setPersoFragId(long value) {
        this.persoFragId = value;
    }

}

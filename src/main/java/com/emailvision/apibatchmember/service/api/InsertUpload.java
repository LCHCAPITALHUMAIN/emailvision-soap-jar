
package com.emailvision.apibatchmember.service.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertUpload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertUpload">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.service.apibatchmember.emailvision.com/}upload">
 *       &lt;sequence>
 *         &lt;element name="autoMapping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dedup" type="{http://api.service.apibatchmember.emailvision.com/}dedup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertUpload", propOrder = {
    "autoMapping",
    "dedup"
})
public class InsertUpload
    extends Upload
{

    protected boolean autoMapping;
    protected Dedup dedup;

    /**
     * Gets the value of the autoMapping property.
     * 
     */
    public boolean isAutoMapping() {
        return autoMapping;
    }

    /**
     * Sets the value of the autoMapping property.
     * 
     */
    public void setAutoMapping(boolean value) {
        this.autoMapping = value;
    }

    /**
     * Gets the value of the dedup property.
     * 
     * @return
     *     possible object is
     *     {@link Dedup }
     *     
     */
    public Dedup getDedup() {
        return dedup;
    }

    /**
     * Sets the value of the dedup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dedup }
     *     
     */
    public void setDedup(Dedup value) {
        this.dedup = value;
    }

}

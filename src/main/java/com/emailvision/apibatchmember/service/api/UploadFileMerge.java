
package com.emailvision.apibatchmember.service.api;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadFileMerge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadFileMerge">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mergeUpload" type="{http://api.service.apibatchmember.emailvision.com/}mergeUpload"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadFileMerge", propOrder = {
    "token",
    "mergeUpload",
    "file"
})
public class UploadFileMerge {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected MergeUpload mergeUpload;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler file;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the mergeUpload property.
     * 
     * @return
     *     possible object is
     *     {@link MergeUpload }
     *     
     */
    public MergeUpload getMergeUpload() {
        return mergeUpload;
    }

    /**
     * Sets the value of the mergeUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link MergeUpload }
     *     
     */
    public void setMergeUpload(MergeUpload value) {
        this.mergeUpload = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFile(DataHandler value) {
        this.file = value;
    }

}

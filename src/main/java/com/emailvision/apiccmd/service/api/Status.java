
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMTP_ERROR"/>
 *     &lt;enumeration value="INVALID_EMAIL"/>
 *     &lt;enumeration value="FORMAT_FAILURE"/>
 *     &lt;enumeration value="FILTERED_MARKPRES"/>
 *     &lt;enumeration value="FILTERED_EMAILDEDUP"/>
 *     &lt;enumeration value="SOFT_BOUNCE"/>
 *     &lt;enumeration value="HARD_BOUNCE"/>
 *     &lt;enumeration value="SENT"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="REGULAR"/>
 *     &lt;enumeration value="CONVERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "status")
@XmlEnum
public enum Status {

    SMTP_ERROR,
    INVALID_EMAIL,
    FORMAT_FAILURE,
    FILTERED_MARKPRES,
    FILTERED_EMAILDEDUP,
    SOFT_BOUNCE,
    HARD_BOUNCE,
    SENT,
    OPEN,
    REGULAR,
    CONVERT;

    public String value() {
        return name();
    }

    public static Status fromValue(String v) {
        return valueOf(v);
    }

}

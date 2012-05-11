
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="email"/>
 *     &lt;enumeration value="sms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiMessageType")
@XmlEnum
public enum ApiMessageType {

    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("sms")
    SMS("sms");
    private final String value;

    ApiMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiMessageType fromValue(String v) {
        for (ApiMessageType c: ApiMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiUrlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiUrlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="PERSONALIZABLE"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="ACTION"/>
 *     &lt;enumeration value="UNJOIN"/>
 *     &lt;enumeration value="MIRROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiUrlType")
@XmlEnum
public enum ApiUrlType {

    STANDARD,
    PERSONALIZABLE,
    UPDATE,
    ACTION,
    UNJOIN,
    MIRROR;

    public String value() {
        return name();
    }

    public static ApiUrlType fromValue(String v) {
        return valueOf(v);
    }

}

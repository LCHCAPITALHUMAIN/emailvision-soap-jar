
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSegmentationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSegmentationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMBINED"/>
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="MESSAGE"/>
 *     &lt;enumeration value="TRACKED_URL"/>
 *     &lt;enumeration value="SQL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSegmentationType")
@XmlEnum
public enum ApiSegmentationType {

    COMBINED,
    BASIC,
    MESSAGE,
    TRACKED_URL,
    SQL;

    public String value() {
        return name();
    }

    public static ApiSegmentationType fromValue(String v) {
        return valueOf(v);
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSegmentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSegmentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="oldSegment"/>
 *     &lt;enumeration value="newSegment"/>
 *     &lt;enumeration value="externalSegment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSegmentType")
@XmlEnum
public enum ApiSegmentType {

    @XmlEnumValue("oldSegment")
    OLD_SEGMENT("oldSegment"),
    @XmlEnumValue("newSegment")
    NEW_SEGMENT("newSegment"),
    @XmlEnumValue("externalSegment")
    EXTERNAL_SEGMENT("externalSegment");
    private final String value;

    ApiSegmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiSegmentType fromValue(String v) {
        for (ApiSegmentType c: ApiSegmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

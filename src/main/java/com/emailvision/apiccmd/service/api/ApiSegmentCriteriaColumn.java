
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSegmentCriteriaColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSegmentCriteriaColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="segmentId"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="createdDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSegmentCriteriaColumn")
@XmlEnum
public enum ApiSegmentCriteriaColumn {

    @XmlEnumValue("segmentId")
    SEGMENT_ID("segmentId"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("createdDate")
    CREATED_DATE("createdDate");
    private final String value;

    ApiSegmentCriteriaColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiSegmentCriteriaColumn fromValue(String v) {
        for (ApiSegmentCriteriaColumn c: ApiSegmentCriteriaColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

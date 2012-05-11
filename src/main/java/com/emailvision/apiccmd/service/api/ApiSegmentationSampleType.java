
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSegmentationSampleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSegmentationSampleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="FIX"/>
 *     &lt;enumeration value="PERCENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSegmentationSampleType")
@XmlEnum
public enum ApiSegmentationSampleType {

    ALL,
    FIX,
    PERCENT;

    public String value() {
        return name();
    }

    public static ApiSegmentationSampleType fromValue(String v) {
        return valueOf(v);
    }

}

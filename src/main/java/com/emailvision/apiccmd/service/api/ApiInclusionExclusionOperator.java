
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiInclusionExclusionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiInclusionExclusionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEGMENT_INCLUSION"/>
 *     &lt;enumeration value="SEGMENT_EXCLUSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiInclusionExclusionOperator")
@XmlEnum
public enum ApiInclusionExclusionOperator {

    SEGMENT_INCLUSION,
    SEGMENT_EXCLUSION;

    public String value() {
        return name();
    }

    public static ApiInclusionExclusionOperator fromValue(String v) {
        return valueOf(v);
    }

}

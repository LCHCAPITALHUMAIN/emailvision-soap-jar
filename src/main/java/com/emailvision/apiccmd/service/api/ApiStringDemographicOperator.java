
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiStringDemographicOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiStringDemographicOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="DOES_NOT_CONTAINS"/>
 *     &lt;enumeration value="BEGINS_WITH"/>
 *     &lt;enumeration value="ENDS_WITH"/>
 *     &lt;enumeration value="IS_EMPTY"/>
 *     &lt;enumeration value="IS_NOT_EMPTY"/>
 *     &lt;enumeration value="EQUALS_CASE_SENSITIVE"/>
 *     &lt;enumeration value="CONTAINS_CASE_SENSITIVE"/>
 *     &lt;enumeration value="DOES_NOT_CONTAINS_CASE_SENSITIVE"/>
 *     &lt;enumeration value="BEGINS_WITH_CASE_SENSITIVE"/>
 *     &lt;enumeration value="ENDS_WITH_CASE_SENSITIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiStringDemographicOperator")
@XmlEnum
public enum ApiStringDemographicOperator {

    EQUALS,
    CONTAINS,
    DOES_NOT_CONTAINS,
    BEGINS_WITH,
    ENDS_WITH,
    IS_EMPTY,
    IS_NOT_EMPTY,
    EQUALS_CASE_SENSITIVE,
    CONTAINS_CASE_SENSITIVE,
    DOES_NOT_CONTAINS_CASE_SENSITIVE,
    BEGINS_WITH_CASE_SENSITIVE,
    ENDS_WITH_CASE_SENSITIVE;

    public String value() {
        return name();
    }

    public static ApiStringDemographicOperator fromValue(String v) {
        return valueOf(v);
    }

}

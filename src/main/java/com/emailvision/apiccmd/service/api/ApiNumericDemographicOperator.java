
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiNumericDemographicOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiNumericDemographicOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="IS_EMPTY"/>
 *     &lt;enumeration value="IS_NOT_EMPTY"/>
 *     &lt;enumeration value="SUPERIOR"/>
 *     &lt;enumeration value="SUPERIOR_OR_EQUAL"/>
 *     &lt;enumeration value="INFERIOR"/>
 *     &lt;enumeration value="INFERIOR_OR_EQUAL"/>
 *     &lt;enumeration value="IS_BETWEEN"/>
 *     &lt;enumeration value="NOT_BETWEEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiNumericDemographicOperator")
@XmlEnum
public enum ApiNumericDemographicOperator {

    EQUALS,
    NOT_EQUALS,
    IS_EMPTY,
    IS_NOT_EMPTY,
    SUPERIOR,
    SUPERIOR_OR_EQUAL,
    INFERIOR,
    INFERIOR_OR_EQUAL,
    IS_BETWEEN,
    NOT_BETWEEN;

    public String value() {
        return name();
    }

    public static ApiNumericDemographicOperator fromValue(String v) {
        return valueOf(v);
    }

}

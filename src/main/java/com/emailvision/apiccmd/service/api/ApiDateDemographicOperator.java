
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiDateDemographicOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiDateDemographicOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE_AFTER_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_BEFORE_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_NOT_ON_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_ON_TIME_SENSITIVE"/>
 *     &lt;enumeration value="ABSOLUTE_AFTER"/>
 *     &lt;enumeration value="ABSOLUTE_AFTER_OR_ON"/>
 *     &lt;enumeration value="ABSOLUTE_BEFORE"/>
 *     &lt;enumeration value="ABSOLUTE_BEFORE_OR_ON"/>
 *     &lt;enumeration value="ABSOLUTE_IS_BETWEEN"/>
 *     &lt;enumeration value="ABSOLUTE_IS_NOT_BETWEEN"/>
 *     &lt;enumeration value="ABSOLUTE_NOT_ON"/>
 *     &lt;enumeration value="ABSOLUTE_ON"/>
 *     &lt;enumeration value="IS_EMPTY"/>
 *     &lt;enumeration value="IS_NOT_EMPTY"/>
 *     &lt;enumeration value="RELATIVE_AFTER_AFTER"/>
 *     &lt;enumeration value="RELATIVE_AFTER_BEFORE"/>
 *     &lt;enumeration value="RELATIVE_AFTER_OR_ON_AFTER"/>
 *     &lt;enumeration value="RELATIVE_AFTER_OR_ON_BEFORE"/>
 *     &lt;enumeration value="RELATIVE_BEFORE_AFTER"/>
 *     &lt;enumeration value="RELATIVE_BEFORE_BEFORE"/>
 *     &lt;enumeration value="RELATIVE_BEFORE_OR_ON_AFTER"/>
 *     &lt;enumeration value="RELATIVE_BEFORE_OR_ON_BEFORE"/>
 *     &lt;enumeration value="RELATIVE_NOT_ON_AFTER"/>
 *     &lt;enumeration value="RELATIVE_NOT_ON_BEFORE"/>
 *     &lt;enumeration value="RELATIVE_ON_AFTER"/>
 *     &lt;enumeration value="RELATIVE_ON_BEFORE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiDateDemographicOperator")
@XmlEnum
public enum ApiDateDemographicOperator {

    ABSOLUTE_AFTER_TIME_SENSITIVE,
    ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE,
    ABSOLUTE_BEFORE_TIME_SENSITIVE,
    ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE,
    ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE,
    ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE,
    ABSOLUTE_NOT_ON_TIME_SENSITIVE,
    ABSOLUTE_ON_TIME_SENSITIVE,
    ABSOLUTE_AFTER,
    ABSOLUTE_AFTER_OR_ON,
    ABSOLUTE_BEFORE,
    ABSOLUTE_BEFORE_OR_ON,
    ABSOLUTE_IS_BETWEEN,
    ABSOLUTE_IS_NOT_BETWEEN,
    ABSOLUTE_NOT_ON,
    ABSOLUTE_ON,
    IS_EMPTY,
    IS_NOT_EMPTY,
    RELATIVE_AFTER_AFTER,
    RELATIVE_AFTER_BEFORE,
    RELATIVE_AFTER_OR_ON_AFTER,
    RELATIVE_AFTER_OR_ON_BEFORE,
    RELATIVE_BEFORE_AFTER,
    RELATIVE_BEFORE_BEFORE,
    RELATIVE_BEFORE_OR_ON_AFTER,
    RELATIVE_BEFORE_OR_ON_BEFORE,
    RELATIVE_NOT_ON_AFTER,
    RELATIVE_NOT_ON_BEFORE,
    RELATIVE_ON_AFTER,
    RELATIVE_ON_BEFORE;

    public String value() {
        return name();
    }

    public static ApiDateDemographicOperator fromValue(String v) {
        return valueOf(v);
    }

}

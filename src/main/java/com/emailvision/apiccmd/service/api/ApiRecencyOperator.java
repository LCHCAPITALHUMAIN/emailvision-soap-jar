
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiRecencyOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiRecencyOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISBETWEEN_RELATIVE"/>
 *     &lt;enumeration value="ISNOTBETWEEN_RELATIVE"/>
 *     &lt;enumeration value="ON_RELATIVE"/>
 *     &lt;enumeration value="NOTON_RELATIVE"/>
 *     &lt;enumeration value="ISBETWEEN_STATIC"/>
 *     &lt;enumeration value="ISNOTBETWEEN_STATIC"/>
 *     &lt;enumeration value="ON_STATIC"/>
 *     &lt;enumeration value="NOTON_STATIC"/>
 *     &lt;enumeration value="BEFORE_STATIC"/>
 *     &lt;enumeration value="BEFOREORON_STATIC"/>
 *     &lt;enumeration value="AFTER_STATIC"/>
 *     &lt;enumeration value="AFTERORON_STATIC"/>
 *     &lt;enumeration value="EMPTY"/>
 *     &lt;enumeration value="NOT_EMPTY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiRecencyOperator")
@XmlEnum
public enum ApiRecencyOperator {

    ISBETWEEN_RELATIVE,
    ISNOTBETWEEN_RELATIVE,
    ON_RELATIVE,
    NOTON_RELATIVE,
    ISBETWEEN_STATIC,
    ISNOTBETWEEN_STATIC,
    ON_STATIC,
    NOTON_STATIC,
    BEFORE_STATIC,
    BEFOREORON_STATIC,
    AFTER_STATIC,
    AFTERORON_STATIC,
    EMPTY,
    NOT_EMPTY;

    public String value() {
        return name();
    }

    public static ApiRecencyOperator fromValue(String v) {
        return valueOf(v);
    }

}

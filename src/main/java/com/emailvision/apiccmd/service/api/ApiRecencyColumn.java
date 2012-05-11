
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiRecencyColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiRecencyColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LAST_DATE_PURCHASE"/>
 *     &lt;enumeration value="LAST_DATE_CLICK"/>
 *     &lt;enumeration value="LAST_DATE_OPEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiRecencyColumn")
@XmlEnum
public enum ApiRecencyColumn {

    LAST_DATE_PURCHASE,
    LAST_DATE_CLICK,
    LAST_DATE_OPEN;

    public String value() {
        return name();
    }

    public static ApiRecencyColumn fromValue(String v) {
        return valueOf(v);
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiValidStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiValidStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_SET"/>
 *     &lt;enumeration value="EDITABLE"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="REFUSED"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="STOPPED"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="PLANNED"/>
 *     &lt;enumeration value="PAUSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiValidStatus")
@XmlEnum
public enum ApiValidStatus {

    NOT_SET,
    EDITABLE,
    QUEUED,
    REFUSED,
    RUNNING,
    STOPPED,
    ARCHIVED,
    PLANNED,
    PAUSED;

    public String value() {
        return name();
    }

    public static ApiValidStatus fromValue(String v) {
        return valueOf(v);
    }

}

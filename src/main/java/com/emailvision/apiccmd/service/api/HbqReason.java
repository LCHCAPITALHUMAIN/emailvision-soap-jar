
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hbqReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="hbqReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QUARANTINE_SCRIPT"/>
 *     &lt;enumeration value="SCHEDULER"/>
 *     &lt;enumeration value="SANITY"/>
 *     &lt;enumeration value="LHE_EMAIL_CLEANER"/>
 *     &lt;enumeration value="LHE_BLACKLIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "hbqReason")
@XmlEnum
public enum HbqReason {

    QUARANTINE_SCRIPT,
    SCHEDULER,
    SANITY,
    LHE_EMAIL_CLEANER,
    LHE_BLACKLIST;

    public String value() {
        return name();
    }

    public static HbqReason fromValue(String v) {
        return valueOf(v);
    }

}

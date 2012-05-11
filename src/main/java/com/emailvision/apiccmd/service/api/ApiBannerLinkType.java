
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiBannerLinkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiBannerLinkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STANDARD"/>
 *     &lt;enumeration value="PERSONALIZABLE"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="ACTION"/>
 *     &lt;enumeration value="UNJOIN"/>
 *     &lt;enumeration value="MIRROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiBannerLinkType")
@XmlEnum
public enum ApiBannerLinkType {

    STANDARD,
    PERSONALIZABLE,
    UPDATE,
    ACTION,
    UNJOIN,
    MIRROR;

    public String value() {
        return name();
    }

    public static ApiBannerLinkType fromValue(String v) {
        return valueOf(v);
    }

}

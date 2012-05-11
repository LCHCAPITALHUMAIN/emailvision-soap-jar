
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSocialNetworkColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSocialNetworkColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOCIAL_SHARERS"/>
 *     &lt;enumeration value="EXTRA_OPENS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSocialNetworkColumn")
@XmlEnum
public enum ApiSocialNetworkColumn {

    SOCIAL_SHARERS,
    EXTRA_OPENS;

    public String value() {
        return name();
    }

    public static ApiSocialNetworkColumn fromValue(String v) {
        return valueOf(v);
    }

}

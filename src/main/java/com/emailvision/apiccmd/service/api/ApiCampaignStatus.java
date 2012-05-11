
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiCampaignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiCampaignStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EDITABLE"/>
 *     &lt;enumeration value="QUEUED"/>
 *     &lt;enumeration value="RUNNING"/>
 *     &lt;enumeration value="PAUSED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="KILLED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiCampaignStatus")
@XmlEnum
public enum ApiCampaignStatus {

    EDITABLE,
    QUEUED,
    RUNNING,
    PAUSED,
    COMPLETED,
    FAILED,
    KILLED;

    public String value() {
        return name();
    }

    public static ApiCampaignStatus fromValue(String v) {
        return valueOf(v);
    }

}

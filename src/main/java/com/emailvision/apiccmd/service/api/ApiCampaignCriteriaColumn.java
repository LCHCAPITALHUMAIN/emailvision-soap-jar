
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiCampaignCriteriaColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiCampaignCriteriaColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="campaignId"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="status"/>
 *     &lt;enumeration value="sendDate"/>
 *     &lt;enumeration value="messageId"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiCampaignCriteriaColumn")
@XmlEnum
public enum ApiCampaignCriteriaColumn {

    @XmlEnumValue("campaignId")
    CAMPAIGN_ID("campaignId"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("status")
    STATUS("status"),
    @XmlEnumValue("sendDate")
    SEND_DATE("sendDate"),
    @XmlEnumValue("messageId")
    MESSAGE_ID("messageId");
    private final String value;

    ApiCampaignCriteriaColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiCampaignCriteriaColumn fromValue(String v) {
        for (ApiCampaignCriteriaColumn c: ApiCampaignCriteriaColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

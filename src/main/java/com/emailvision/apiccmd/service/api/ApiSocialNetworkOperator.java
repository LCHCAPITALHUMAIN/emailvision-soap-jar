
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiSocialNetworkOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiSocialNetworkOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAMPAIGN_EQUALS"/>
 *     &lt;enumeration value="CAMPAIGN_NOT_EQUALS"/>
 *     &lt;enumeration value="CAMPAIGN_EMPTY"/>
 *     &lt;enumeration value="CAMPAIGN_NOT_EMPTY"/>
 *     &lt;enumeration value="CAMPAIGN_SUPERIOR"/>
 *     &lt;enumeration value="CAMPAIGN_SUPERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="CAMPAIGN_INFERIOR"/>
 *     &lt;enumeration value="CAMPAIGN_INFERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="CAMPAIGN_BETWEEN"/>
 *     &lt;enumeration value="CAMPAIGN_NOT_BETWEEN"/>
 *     &lt;enumeration value="SERIE_EQUALS"/>
 *     &lt;enumeration value="SERIE_NOT_EQUALS"/>
 *     &lt;enumeration value="SERIE_EMPTY"/>
 *     &lt;enumeration value="SERIE_NOT_EMPTY"/>
 *     &lt;enumeration value="SERIE_SUPERIOR"/>
 *     &lt;enumeration value="SERIE_SUPERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="SERIE_INFERIOR"/>
 *     &lt;enumeration value="SERIE_INFERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="SERIE_BETWEEN"/>
 *     &lt;enumeration value="SERIE_NOT_BETWEEN"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_EQUALS"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_NOT_EQUALS"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_EMPTY"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_NOT_EMPTY"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_SUPERIOR"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_SUPERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_INFERIOR"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_INFERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_BETWEEN"/>
 *     &lt;enumeration value="ANY_CAMPAIGN_NOT_BETWEEN"/>
 *     &lt;enumeration value="ANY_SERIE_EQUALS"/>
 *     &lt;enumeration value="ANY_SERIE_NOT_EQUALS"/>
 *     &lt;enumeration value="ANY_SERIE_EMPTY"/>
 *     &lt;enumeration value="ANY_SERIE_NOT_EMPTY"/>
 *     &lt;enumeration value="ANY_SERIE_SUPERIOR"/>
 *     &lt;enumeration value="ANY_SERIE_SUPERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_SERIE_INFERIOR"/>
 *     &lt;enumeration value="ANY_SERIE_INFERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_SERIE_BETWEEN"/>
 *     &lt;enumeration value="ANY_SERIE_NOT_BETWEEN"/>
 *     &lt;enumeration value="ANY_EQUALS"/>
 *     &lt;enumeration value="ANY_NOT_EQUALS"/>
 *     &lt;enumeration value="ANY_EMPTY"/>
 *     &lt;enumeration value="ANY_NOT_EMPTY"/>
 *     &lt;enumeration value="ANY_SUPERIOR"/>
 *     &lt;enumeration value="ANY_SUPERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_INFERIOR"/>
 *     &lt;enumeration value="ANY_INFERIOR_OR_EQUALS"/>
 *     &lt;enumeration value="ANY_BETWEEN"/>
 *     &lt;enumeration value="ANY_NOT_BETWEEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiSocialNetworkOperator")
@XmlEnum
public enum ApiSocialNetworkOperator {

    CAMPAIGN_EQUALS,
    CAMPAIGN_NOT_EQUALS,
    CAMPAIGN_EMPTY,
    CAMPAIGN_NOT_EMPTY,
    CAMPAIGN_SUPERIOR,
    CAMPAIGN_SUPERIOR_OR_EQUALS,
    CAMPAIGN_INFERIOR,
    CAMPAIGN_INFERIOR_OR_EQUALS,
    CAMPAIGN_BETWEEN,
    CAMPAIGN_NOT_BETWEEN,
    SERIE_EQUALS,
    SERIE_NOT_EQUALS,
    SERIE_EMPTY,
    SERIE_NOT_EMPTY,
    SERIE_SUPERIOR,
    SERIE_SUPERIOR_OR_EQUALS,
    SERIE_INFERIOR,
    SERIE_INFERIOR_OR_EQUALS,
    SERIE_BETWEEN,
    SERIE_NOT_BETWEEN,
    ANY_CAMPAIGN_EQUALS,
    ANY_CAMPAIGN_NOT_EQUALS,
    ANY_CAMPAIGN_EMPTY,
    ANY_CAMPAIGN_NOT_EMPTY,
    ANY_CAMPAIGN_SUPERIOR,
    ANY_CAMPAIGN_SUPERIOR_OR_EQUALS,
    ANY_CAMPAIGN_INFERIOR,
    ANY_CAMPAIGN_INFERIOR_OR_EQUALS,
    ANY_CAMPAIGN_BETWEEN,
    ANY_CAMPAIGN_NOT_BETWEEN,
    ANY_SERIE_EQUALS,
    ANY_SERIE_NOT_EQUALS,
    ANY_SERIE_EMPTY,
    ANY_SERIE_NOT_EMPTY,
    ANY_SERIE_SUPERIOR,
    ANY_SERIE_SUPERIOR_OR_EQUALS,
    ANY_SERIE_INFERIOR,
    ANY_SERIE_INFERIOR_OR_EQUALS,
    ANY_SERIE_BETWEEN,
    ANY_SERIE_NOT_BETWEEN,
    ANY_EQUALS,
    ANY_NOT_EQUALS,
    ANY_EMPTY,
    ANY_NOT_EMPTY,
    ANY_SUPERIOR,
    ANY_SUPERIOR_OR_EQUALS,
    ANY_INFERIOR,
    ANY_INFERIOR_OR_EQUALS,
    ANY_BETWEEN,
    ANY_NOT_BETWEEN;

    public String value() {
        return name();
    }

    public static ApiSocialNetworkOperator fromValue(String v) {
        return valueOf(v);
    }

}

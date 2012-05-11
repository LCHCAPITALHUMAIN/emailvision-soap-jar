
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiTrackableLinkOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiTrackableLinkOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASSIC_ANYLINK_CLICKED_NOTIME"/>
 *     &lt;enumeration value="CLASSIC_ANYLINK_UNCLICKED_NOTIME"/>
 *     &lt;enumeration value="CLASSIC_LINK_CLICKED_NOTIME"/>
 *     &lt;enumeration value="CLASSIC_LINK_UNCLICKED_NOTIME"/>
 *     &lt;enumeration value="CLASSIC_LINK_CLICKED_TIME"/>
 *     &lt;enumeration value="CLASSIC_LINK_UNCLICKED_TIME"/>
 *     &lt;enumeration value="CLASSIC_ANYLINK_CLICKED_TIME"/>
 *     &lt;enumeration value="CLASSIC_ANYLINK_UNCLICKED_TIME"/>
 *     &lt;enumeration value="REFLEX_ANYLINK_CLICKED_NOTIME"/>
 *     &lt;enumeration value="REFLEX_ANYLINK_UNCLICKED_NOTIME"/>
 *     &lt;enumeration value="REFLEX_LINK_CLICKED_NOTIME"/>
 *     &lt;enumeration value="REFLEX_LINK_UNCLICKED_NOTIME"/>
 *     &lt;enumeration value="REFLEX_LINK_CLICKED_TIME"/>
 *     &lt;enumeration value="REFLEX_LINK_UNCLICKED_TIME"/>
 *     &lt;enumeration value="REFLEX_ANYLINK_CLICKED_TIME"/>
 *     &lt;enumeration value="REFLEX_ANYLINK_UNCLICKED_TIME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiTrackableLinkOperator")
@XmlEnum
public enum ApiTrackableLinkOperator {

    CLASSIC_ANYLINK_CLICKED_NOTIME,
    CLASSIC_ANYLINK_UNCLICKED_NOTIME,
    CLASSIC_LINK_CLICKED_NOTIME,
    CLASSIC_LINK_UNCLICKED_NOTIME,
    CLASSIC_LINK_CLICKED_TIME,
    CLASSIC_LINK_UNCLICKED_TIME,
    CLASSIC_ANYLINK_CLICKED_TIME,
    CLASSIC_ANYLINK_UNCLICKED_TIME,
    REFLEX_ANYLINK_CLICKED_NOTIME,
    REFLEX_ANYLINK_UNCLICKED_NOTIME,
    REFLEX_LINK_CLICKED_NOTIME,
    REFLEX_LINK_UNCLICKED_NOTIME,
    REFLEX_LINK_CLICKED_TIME,
    REFLEX_LINK_UNCLICKED_TIME,
    REFLEX_ANYLINK_CLICKED_TIME,
    REFLEX_ANYLINK_UNCLICKED_TIME;

    public String value() {
        return name();
    }

    public static ApiTrackableLinkOperator fromValue(String v) {
        return valueOf(v);
    }

}

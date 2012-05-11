
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiActionOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiActionOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SENT_CAMP"/>
 *     &lt;enumeration value="WERENOTSENT_CAMP"/>
 *     &lt;enumeration value="RECEIVEDMESSAGE_CAMP"/>
 *     &lt;enumeration value="DIDNOTRECEIVEDMESSAGE_CAMP"/>
 *     &lt;enumeration value="CLICKED_CAMP"/>
 *     &lt;enumeration value="DIDNOTCLICKED_CAMP"/>
 *     &lt;enumeration value="OPENEDMESSAGE_CAMP"/>
 *     &lt;enumeration value="DIDNOTOPENEDMESSAGE_CAMP"/>
 *     &lt;enumeration value="SOFTBOUNCE_CAMP"/>
 *     &lt;enumeration value="SENT_SERIE"/>
 *     &lt;enumeration value="WERENOTSENT_SERIE"/>
 *     &lt;enumeration value="RECEIVEDMESSAGE_SERIE"/>
 *     &lt;enumeration value="DIDNOTRECEIVEDMESSAGE_SERIE"/>
 *     &lt;enumeration value="CLICKED_SERIE"/>
 *     &lt;enumeration value="DIDNOTCLICKED_SERIE"/>
 *     &lt;enumeration value="OPENEDMESSAGE_SERIE"/>
 *     &lt;enumeration value="DIDNOTOPENEDMESSAGE_SERIE"/>
 *     &lt;enumeration value="SOFTBOUNCE_SERIE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiActionOperator")
@XmlEnum
public enum ApiActionOperator {

    SENT_CAMP,
    WERENOTSENT_CAMP,
    RECEIVEDMESSAGE_CAMP,
    DIDNOTRECEIVEDMESSAGE_CAMP,
    CLICKED_CAMP,
    DIDNOTCLICKED_CAMP,
    OPENEDMESSAGE_CAMP,
    DIDNOTOPENEDMESSAGE_CAMP,
    SOFTBOUNCE_CAMP,
    SENT_SERIE,
    WERENOTSENT_SERIE,
    RECEIVEDMESSAGE_SERIE,
    DIDNOTRECEIVEDMESSAGE_SERIE,
    CLICKED_SERIE,
    DIDNOTCLICKED_SERIE,
    OPENEDMESSAGE_SERIE,
    DIDNOTOPENEDMESSAGE_SERIE,
    SOFTBOUNCE_SERIE;

    public String value() {
        return name();
    }

    public static ApiActionOperator fromValue(String v) {
        return valueOf(v);
    }

}

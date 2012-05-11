
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiMessageCriteriaColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiMessageCriteriaColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="messageId"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="createdDate"/>
 *     &lt;enumeration value="from"/>
 *     &lt;enumeration value="messageType"/>
 *     &lt;enumeration value="subject"/>
 *     &lt;enumeration value="to"/>
 *     &lt;enumeration value="isBounceBack"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiMessageCriteriaColumn")
@XmlEnum
public enum ApiMessageCriteriaColumn {

    @XmlEnumValue("messageId")
    MESSAGE_ID("messageId"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("createdDate")
    CREATED_DATE("createdDate"),
    @XmlEnumValue("from")
    FROM("from"),
    @XmlEnumValue("messageType")
    MESSAGE_TYPE("messageType"),
    @XmlEnumValue("subject")
    SUBJECT("subject"),
    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("isBounceBack")
    IS_BOUNCE_BACK("isBounceBack");
    private final String value;

    ApiMessageCriteriaColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiMessageCriteriaColumn fromValue(String v) {
        for (ApiMessageCriteriaColumn c: ApiMessageCriteriaColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiBannerCriteriaColumn.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiBannerCriteriaColumn">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="bannerId"/>
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="createdDate"/>
 *     &lt;enumeration value="modifiedDate"/>
 *     &lt;enumeration value="contentType"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiBannerCriteriaColumn")
@XmlEnum
public enum ApiBannerCriteriaColumn {

    @XmlEnumValue("bannerId")
    BANNER_ID("bannerId"),
    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("createdDate")
    CREATED_DATE("createdDate"),
    @XmlEnumValue("modifiedDate")
    MODIFIED_DATE("modifiedDate"),
    @XmlEnumValue("contentType")
    CONTENT_TYPE("contentType");
    private final String value;

    ApiBannerCriteriaColumn(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ApiBannerCriteriaColumn fromValue(String v) {
        for (ApiBannerCriteriaColumn c: ApiBannerCriteriaColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

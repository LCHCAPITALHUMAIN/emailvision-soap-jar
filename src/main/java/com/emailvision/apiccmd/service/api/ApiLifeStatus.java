
package com.emailvision.apiccmd.service.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for apiLifeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="apiLifeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERR_PURGE"/>
 *     &lt;enumeration value="ERR_BACKUP"/>
 *     &lt;enumeration value="HIDDEN"/>
 *     &lt;enumeration value="TRACKING"/>
 *     &lt;enumeration value="TRACKING_FINISHED"/>
 *     &lt;enumeration value="BACKUPED"/>
 *     &lt;enumeration value="PURGED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "apiLifeStatus")
@XmlEnum
public enum ApiLifeStatus {

    ERR_PURGE,
    ERR_BACKUP,
    HIDDEN,
    TRACKING,
    TRACKING_FINISHED,
    BACKUPED,
    PURGED;

    public String value() {
        return name();
    }

    public static ApiLifeStatus fromValue(String v) {
        return valueOf(v);
    }

}

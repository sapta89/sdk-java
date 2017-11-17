//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.25 at 03:55:04 PM IST 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for permissionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="permissionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="API_Merchant_BasicReporting"/>
 *     &lt;enumeration value="Submit_Charge"/>
 *     &lt;enumeration value="Submit_Refund"/>
 *     &lt;enumeration value="Submit_Update"/>
 *     &lt;enumeration value="Mobile_Admin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "permissionsEnum")
@XmlEnum
public enum PermissionsEnum {

    @XmlEnumValue("API_Merchant_BasicReporting")
    API_MERCHANT_BASIC_REPORTING("API_Merchant_BasicReporting"),
    @XmlEnumValue("Submit_Charge")
    SUBMIT_CHARGE("Submit_Charge"),
    @XmlEnumValue("Submit_Refund")
    SUBMIT_REFUND("Submit_Refund"),
    @XmlEnumValue("Submit_Update")
    SUBMIT_UPDATE("Submit_Update"),
    @XmlEnumValue("Mobile_Admin")
    MOBILE_ADMIN("Mobile_Admin");
    private final String value;

    PermissionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionsEnum fromValue(String v) {
        for (PermissionsEnum c: PermissionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

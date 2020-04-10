//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.21 at 04:15:03 PM CET 
//

package com.github.eqx.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for EqxFilterClassType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EqxFilterClassType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="AdHoc"/>
 *     &lt;enumeration value="CFC10"/>
 *     &lt;enumeration value="CFC60"/>
 *     &lt;enumeration value="CFC180"/>
 *     &lt;enumeration value="CFC600"/>
 *     &lt;enumeration value="CFC1000"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EqxFilterClassType")
@XmlEnum
public enum EqxFilterClassType {

	@XmlEnumValue("None")
	NONE("None"), @XmlEnumValue("AdHoc")
	AD_HOC("AdHoc"), @XmlEnumValue("CFC10")
	CFC_10("CFC10"), @XmlEnumValue("CFC60")
	CFC_60("CFC60"), @XmlEnumValue("CFC180")
	CFC_180("CFC180"), @XmlEnumValue("CFC600")
	CFC_600("CFC600"), @XmlEnumValue("CFC1000")
	CFC_1000("CFC1000");
	private final String value;

	EqxFilterClassType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EqxFilterClassType fromValue(String v) {
		for (EqxFilterClassType c : EqxFilterClassType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

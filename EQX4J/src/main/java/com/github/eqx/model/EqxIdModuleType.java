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
 * Java class for EqxIdModuleType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EqxIdModuleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Endevco"/>
 *     &lt;enumeration value="Dallas"/>
 *     &lt;enumeration value="KT"/>
 *     &lt;enumeration value="DiMod"/>
 *     &lt;enumeration value="Microdau"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EqxIdModuleType")
@XmlEnum
public enum EqxIdModuleType {

	@XmlEnumValue("Endevco")
	ENDEVCO("Endevco"), @XmlEnumValue("Dallas")
	DALLAS("Dallas"), KT("KT"), @XmlEnumValue("DiMod")
	DI_MOD("DiMod"), @XmlEnumValue("Microdau")
	MICRODAU("Microdau"), @XmlEnumValue("none")
	NONE("none");
	private final String value;

	EqxIdModuleType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EqxIdModuleType fromValue(String v) {
		for (EqxIdModuleType c : EqxIdModuleType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
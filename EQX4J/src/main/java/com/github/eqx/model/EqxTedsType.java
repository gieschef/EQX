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
 * Java class for EqxTedsType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EqxTedsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IEEE1451.4"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EqxTedsType")
@XmlEnum
public enum EqxTedsType {

	@XmlEnumValue("IEEE1451.4")
	IEEE_1451_4("IEEE1451.4"), @XmlEnumValue("other")
	OTHER("other");
	private final String value;

	EqxTedsType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EqxTedsType fromValue(String v) {
		for (EqxTedsType c : EqxTedsType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
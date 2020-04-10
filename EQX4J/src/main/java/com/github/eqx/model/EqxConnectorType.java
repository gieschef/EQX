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
 * Java class for EqxConnectorType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EqxConnectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Lemosa 1B"/>
 *     &lt;enumeration value="Lemosa 2B"/>
 *     &lt;enumeration value="Lemosa 4pol"/>
 *     &lt;enumeration value="Lemosa 8pol"/>
 *     &lt;enumeration value="Amphenol 9pol"/>
 *     &lt;enumeration value="Amphenol 79pol"/>
 *     &lt;enumeration value="Amphenol 128pol"/>
 *     &lt;enumeration value="Tajimi 5pol"/>
 *     &lt;enumeration value="Tajimi 7pol flat"/>
 *     &lt;enumeration value="Bendix 26pol"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EqxConnectorType")
@XmlEnum
public enum EqxConnectorType {

	@XmlEnumValue("Lemosa 1B")
	LEMOSA_1_B("Lemosa 1B"), @XmlEnumValue("Lemosa 2B")
	LEMOSA_2_B("Lemosa 2B"), @XmlEnumValue("Lemosa 4pol")
	LEMOSA_4_POL("Lemosa 4pol"), @XmlEnumValue("Lemosa 8pol")
	LEMOSA_8_POL("Lemosa 8pol"), @XmlEnumValue("Amphenol 9pol")
	AMPHENOL_9_POL("Amphenol 9pol"), @XmlEnumValue("Amphenol 79pol")
	AMPHENOL_79_POL("Amphenol 79pol"), @XmlEnumValue("Amphenol 128pol")
	AMPHENOL_128_POL("Amphenol 128pol"), @XmlEnumValue("Tajimi 5pol")
	TAJIMI_5_POL("Tajimi 5pol"), @XmlEnumValue("Tajimi 7pol flat")
	TAJIMI_7_POL_FLAT("Tajimi 7pol flat"), @XmlEnumValue("Bendix 26pol")
	BENDIX_26_POL("Bendix 26pol");
	private final String value;

	EqxConnectorType(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EqxConnectorType fromValue(String v) {
		for (EqxConnectorType c : EqxConnectorType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
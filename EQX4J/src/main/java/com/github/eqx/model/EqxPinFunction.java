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
 * Java class for EqxPinFunction.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="EqxPinFunction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Positive Excitation Voltage"/>
 *     &lt;enumeration value="Negative Excitation Voltage"/>
 *     &lt;enumeration value="Positive Signal"/>
 *     &lt;enumeration value="Negative Signal"/>
 *     &lt;enumeration value="Positive Excitation Sense"/>
 *     &lt;enumeration value="Negative Excitation Sense"/>
 *     &lt;enumeration value="Shielding"/>
 *     &lt;enumeration value="Ground"/>
 *     &lt;enumeration value="Shunt Resistor"/>
 *     &lt;enumeration value="Identification Module"/>
 *     &lt;enumeration value="Combined Shunt and Identification"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EqxPinFunction")
@XmlEnum
public enum EqxPinFunction {

	@XmlEnumValue("Positive Excitation Voltage")
	POSITIVE_EXCITATION_VOLTAGE("Positive Excitation Voltage"), @XmlEnumValue("Negative Excitation Voltage")
	NEGATIVE_EXCITATION_VOLTAGE("Negative Excitation Voltage"), @XmlEnumValue("Positive Signal")
	POSITIVE_SIGNAL("Positive Signal"), @XmlEnumValue("Negative Signal")
	NEGATIVE_SIGNAL("Negative Signal"), @XmlEnumValue("Positive Excitation Sense")
	POSITIVE_EXCITATION_SENSE("Positive Excitation Sense"), @XmlEnumValue("Negative Excitation Sense")
	NEGATIVE_EXCITATION_SENSE("Negative Excitation Sense"), @XmlEnumValue("Shielding")
	SHIELDING("Shielding"), @XmlEnumValue("Ground")
	GROUND("Ground"), @XmlEnumValue("Shunt Resistor")
	SHUNT_RESISTOR("Shunt Resistor"), @XmlEnumValue("Identification Module")
	IDENTIFICATION_MODULE("Identification Module"), @XmlEnumValue("Combined Shunt and Identification")
	COMBINED_SHUNT_AND_IDENTIFICATION("Combined Shunt and Identification");
	private final String value;

	EqxPinFunction(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EqxPinFunction fromValue(String v) {
		for (EqxPinFunction c : EqxPinFunction.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
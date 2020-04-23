
package com.github.eqx.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.github.eqx.model
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class EqxObjectFactory {

	private final static QName _Sensors_QNAME = new QName("", "Sensors");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema
	 * derived classes for package: com.trw.dalfde.evc.ardilla.jaxb.eqx
	 * 
	 */
	public EqxObjectFactory() {
		super();
	}

	/**
	 * Create an instance of {@link EqxSensors }
	 * 
	 */
	public EqxSensors createEqxSensors() {
		return new EqxSensors();
	}

	/**
	 * Create an instance of {@link EqxAddress }
	 * 
	 */
	public EqxAddress createEqxAddress() {
		return new EqxAddress();
	}

	/**
	 * Create an instance of {@link EqxPin }
	 * 
	 */
	public EqxPin createEqxPin() {
		return new EqxPin();
	}

	/**
	 * Create an instance of {@link EqxCalHistoryEntry }
	 * 
	 */
	public EqxCalHistoryEntry createEqxCalHistoryEntry() {
		return new EqxCalHistoryEntry();
	}

	/**
	 * Create an instance of {@link EqxSensorAxis }
	 * 
	 */
	public EqxSensorAxis createEqxSensorAxis() {
		return new EqxSensorAxis();
	}

	/**
	 * Create an instance of {@link EqxAttribute }
	 * 
	 */
	public EqxAttribute createEqxAttribute() {
		return new EqxAttribute();
	}

	/**
	 * Create an instance of {@link EqxPath }
	 * 
	 */
	public EqxPath createEqxPath() {
		return new EqxPath();
	}

	/**
	 * Create an instance of {@link EqxBaseSensorGroup }
	 * 
	 */
	public EqxBaseSensorGroup createEqxBaseSensorGroup() {
		return new EqxBaseSensorGroup();
	}

	/**
	 * Create an instance of {@link EqxSensorGroup }
	 * 
	 */
	public EqxSensorGroup createEqxSensorGroup() {
		return new EqxSensorGroup();
	}

	/**
	 * Create an instance of {@link EqxAttachment }
	 * 
	 */
	public EqxAttachment createEqxAttachment() {
		return new EqxAttachment();
	}

	/**
	 * Create an instance of {@link EqxFileInfo }
	 * 
	 */
	public EqxFileInfo createEqxFileInfo() {
		return new EqxFileInfo();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EqxSensors
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "Sensors")
	public JAXBElement<EqxSensors> createSensors(EqxSensors value) {
		return new JAXBElement<EqxSensors>(_Sensors_QNAME, EqxSensors.class, null, value);
	}

}

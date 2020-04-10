package com.github.eqx;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.stream.XMLStreamException;

import com.github.eqx.model.EqxObjectFactory;
import com.github.eqx.model.EqxSensors;

/**
 * EQX file factory.
 * 
 * @author pawlidim
 *
 */
public class EQXFactory extends JAXBGenerator {

	private EqxObjectFactory objectFactory;

	/** Default constructor for eqx file factory. */
	public EQXFactory() {
		super(EqxObjectFactory.class);
		this.objectFactory = new EqxObjectFactory();
	}

	/**
	 * Converts eqx sensors object to string.
	 * 
	 * @param eqxSensors, to convert
	 * @return eqx as string
	 * @throws JAXBException
	 */
	public String toXmlString(final EqxSensors eqxSensors) throws JAXBException {
		return toXmlString(eqxSensors, jaxbContext);
	}

	/**
	 * Converts eqx sensors object to string.
	 * 
	 * @param eqxSensors, to convert
	 * @param context,    as jaxb context
	 * @return eqx as string
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	public String toXmlString(final EqxSensors eqxSensors, JAXBContext context)
			throws JAXBException, PropertyException {
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		final StringWriter w = new StringWriter();
		m.marshal(objectFactory.createSensors(eqxSensors), w);
		return w.toString();
	}

	/**
	 * Converts eqx sensors object to byte array stream.
	 * 
	 * @param eqxSensors, to convert
	 * @return byte array stream
	 * @throws JAXBException
	 */
	public ByteArrayOutputStream toXmlStream(final EqxSensors eqxSensors) throws JAXBException {
		return toXmlStream(eqxSensors, jaxbContext);
	}

	/**
	 * Converts eqx sensors object to byte array stream.
	 * 
	 * @param eqxSensors, to convert
	 * @param context
	 * @return byte array stream
	 * @throws JAXBException
	 * @throws PropertyException
	 */
	public ByteArrayOutputStream toXmlStream(final EqxSensors eqxSensors, JAXBContext context)
			throws JAXBException, PropertyException {
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		Marshaller m = context.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(objectFactory.createSensors(eqxSensors), byteOutputStream);
		return byteOutputStream;
	}

	/**
	 * Converts eqx sensors to xml file.
	 * 
	 * @param filePath,   xml file path
	 * @param eqxSensors, to convert
	 * @return xmlFile
	 * @throws JAXBException
	 * @throws IOException
	 */
	public File toXmlFile(String filePath, final EqxSensors eqxSensors) throws JAXBException, IOException {
		return toXmlFile(new File(filePath), eqxSensors, jaxbContext);
	}

	/**
	 * Converts eqx sensors to xml file.
	 * 
	 * @param xmlFile,    as file
	 * @param eqxSensors, to convert
	 * @return xmlFile
	 * @throws JAXBException
	 * @throws IOException
	 */
	public File toXmlFile(File xmlFile, final EqxSensors eqxSensors) throws JAXBException, IOException {
		return toXmlFile(xmlFile, eqxSensors, jaxbContext);
	}

	/**
	 * Converts eqx sensors to xml file .
	 * 
	 * @param xmlFile,    as file
	 * @param eqxSensors, to convert
	 * @param context
	 * @return xmlFile
	 * @throws JAXBException
	 * @throws PropertyException
	 * @throws IOException
	 */
	public File toXmlFile(File xmlFile, final EqxSensors eqxSensors, JAXBContext context)
			throws JAXBException, PropertyException, IOException {
		if (xmlFile == null) {
			return null;
		}
		if (!xmlFile.exists()) {
			xmlFile.createNewFile();
		}
		FileOutputStream outputStream = new FileOutputStream(xmlFile);
		byte[] content = toXmlStream(eqxSensors).toByteArray();
		outputStream.write(content);
		outputStream.flush();
		outputStream.close();
		return xmlFile;
	}

	/**
	 * Converts xml byte array data to eqx sensors.
	 * 
	 * @param xmlData
	 * @return
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	public EqxSensors toEqxSensorsFromXML(byte[] xmlData) throws JAXBException, XMLStreamException {
		return super.toPojoFromXML(xmlData, EqxSensors.class);
	}

	/**
	 * Converts xml input stream data to eqx sensors.
	 * 
	 * @param xmlData
	 * @return
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	public EqxSensors toEqxSensorsFromXML(InputStream xmlData) throws JAXBException, XMLStreamException {
		return super.toPojoFromXML(xmlData, EqxSensors.class);
	}

}

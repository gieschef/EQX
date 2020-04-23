package com.github.eqx;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * 
 * Abstract jaxb generator.
 * 
 * @author pawlidim
 *
 */
abstract class JAXBGenerator {

	/* JAXBContext is thread-safe Marshaller and Unmarshaller not */
	protected JAXBContext jaxbContext;

	protected XMLInputFactory inputFactory;

	/**
	 * Default constructor to create factory with given context path.
	 * 
	 * @param contextPath List of colon ':' separated package names to load the jaxb
	 *                    context
	 * @throws IllegalStateException if an error was encountered while creating the
	 *                               JAXBContext
	 */
	protected JAXBGenerator(final String contextPath) {
		try {
			jaxbContext = JAXBContext.newInstance(contextPath);
			inputFactory = XMLInputFactory.newFactory();
			inputFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			inputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
		} catch (JAXBException e) {
			throw new IllegalStateException("Error during initialization", e);
		}
	}

	/**
	 * Default constructor to create factory with given context classes.
	 * 
	 * @param clazzes
	 */
	protected JAXBGenerator(final Class<?>... clazzes) {
		try {
			jaxbContext = JAXBContext.newInstance(clazzes);
			inputFactory = XMLInputFactory.newFactory();
			inputFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
			inputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false);
		} catch (JAXBException e) {
			throw new IllegalStateException("Error during initialization", e);
		}
	}

	/**
	 * Generates object for given xml string and class.
	 * 
	 * @param xml
	 * @param clazz
	 * @return pojo
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	protected <T> T toPojoFromXML(final String xml, Class<T> clazz) throws JAXBException, XMLStreamException {
		XMLStreamReader xsr = inputFactory.createXMLStreamReader(new StringReader(xml));
		return jaxbContext.createUnmarshaller().unmarshal(xsr, clazz).getValue();
	}

	/**
	 * Generate object for given xml data and class.
	 * 
	 * @param xmlData
	 * @param clazz
	 * @return pojo
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	protected <T> T toPojoFromXML(byte[] xmlData, Class<T> clazz) throws JAXBException, XMLStreamException {
		XMLStreamReader xsr = inputFactory
				.createXMLStreamReader(new BufferedInputStream(new ByteArrayInputStream(xmlData)));
		return jaxbContext.createUnmarshaller().unmarshal(xsr, clazz).getValue();
	}

	/**
	 * Generate object for given xml data and class.
	 * 
	 * @param xmlData
	 * @param clazz
	 * @return pojo
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	protected <T> T toPojoFromXML(InputStream xmlData, Class<T> clazz) throws JAXBException, XMLStreamException {
		XMLStreamReader xsr = inputFactory.createXMLStreamReader(new BufferedInputStream(xmlData));
		return jaxbContext.createUnmarshaller().unmarshal(xsr, clazz).getValue();
	}

	/**
	 * Generates xml string for given object.
	 * 
	 * @param pojo
	 * @return pojo
	 * @throws JAXBException
	 */
	protected <T> String toXmlString(T pojo) throws JAXBException {
		final StringWriter sw = new StringWriter();
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(pojo, sw);
		return sw.toString();
	}

	/**
	 * Generates byte array output stream for given object.
	 * 
	 * @param pojo
	 * @return pojo
	 * @throws JAXBException
	 */
	protected <T> ByteArrayOutputStream toXmlStream(T pojo) throws JAXBException {
		ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		Marshaller m = jaxbContext.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		m.marshal(pojo, byteOutputStream);
		return byteOutputStream;
	}
}
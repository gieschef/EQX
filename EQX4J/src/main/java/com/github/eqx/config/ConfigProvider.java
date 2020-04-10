/**
 * Base package for the configuration.
 */
package com.github.eqx.config;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 * This class provide access to properties. It is implemented as singleton, so
 * the initialization is done once.
 * 
 * @author PAWLIDIM
 *
 */
public final class ConfigProvider implements Serializable {

	protected static final String PROPERTIES_PATH = "config.properties";
	protected static final String GROUP_ID_PROPERTY = "eqx.groupId";
	protected static final String ARTIFACT_ID_PROPERTY = "eqx.artifactId";
	protected static final String VERSION_PROPERTY = "eqx.version";

	protected volatile static ConfigProvider instance = null;

	private Properties properties = null;

	/**
	 * Returns singleton config provider instance.
	 * 
	 * @return instance
	 */
	public static ConfigProvider instance() {
		if (instance == null) {
			synchronized (ConfigProvider.class) {
				if (instance == null) {
					instance = new ConfigProvider();
				}
			}
		}
		return instance;
	}

	private ConfigProvider() {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream is = classLoader.getResourceAsStream(PROPERTIES_PATH);

		properties = new Properties();
		if (is != null) {
			try {
				properties.load(is);
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				is.close();
				is = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Returns property with the specified key. The method returns null if the
	 * property is not found.
	 * 
	 * @param key the property key
	 * @return the value in this property list with the specified key value.
	 */
	public String get(String key) {
		return properties.getProperty(key);
	}

	/***
	 * Returns the group id.
	 * 
	 * @return groupId
	 */
	public String getGroupId() {
		return get(GROUP_ID_PROPERTY);
	}

	/**
	 * Returns the artifact id
	 * 
	 * @return artifact id
	 */
	public String getArtifactId() {
		return get(ARTIFACT_ID_PROPERTY);
	}

	/**
	 * Return the software version number.
	 * 
	 * @return software version
	 */
	public String getVersion() {
		return get(VERSION_PROPERTY);
	}

	/**
	 * 
	 * @return
	 */
	public String getFormatVersion() {
		return get(VERSION_PROPERTY);
	}
}

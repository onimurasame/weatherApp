/**
 * 
 */
package com.weatherApp.rest.client;

/**
 * @author rastudillo
 *
 */
public final class RestConfigurator {

	private static final String URL_OPEN_WEATHER = "http://api.openweathermap.org";
	private static final String PATH_OPEN_WEATHER = "/data/2.5/weather";
	
	public static String getConfiguratedUrl() {
		/**
		 * @todo Should read a properties value to decide which provider to use
		 */
		return URL_OPEN_WEATHER;
	}
	
	public static String getConfiguratedPath() {
		return PATH_OPEN_WEATHER;
	}
}

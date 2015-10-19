/**
 * 
 */
package com.weatherApp.rest.bean;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author onimu
 *
 */
@XmlRootElement(name = "current")
public class CurrentWeather {
	
	private City city;
	private Temperature temperature;
	private Integer pressure;
	private String pressureUnit;
	
	
}

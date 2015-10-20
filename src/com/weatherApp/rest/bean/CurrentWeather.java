/**
 * 
 */
package com.weatherApp.rest.bean;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author onimu
 *
 */
@XmlType
@XmlRootElement(name = "current")
public class CurrentWeather {

	private City city;
	private Temperature temperature;
	private Pressure pressure = new Pressure();

	public CurrentWeather() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param city
	 * @param temperature
	 * @param pressure
	 */
	public CurrentWeather(City city, Temperature temperature, Pressure pressure) {
		super();
		this.city = city;
		this.temperature = temperature;
		this.pressure = pressure;
	}


	/**
	 * @return the city
	 */
	
	public City getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}

	/**
	 * @return the temperature
	 */
	public Temperature getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature
	 *            the temperature to set
	 */
	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	/**
	 * @return the pressure
	 */
	public Pressure getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 *            the pressure to set
	 */
	public void setPressure(Pressure pressure) {
		this.pressure = pressure;
	}

}

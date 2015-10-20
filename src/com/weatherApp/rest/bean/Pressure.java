package com.weatherApp.rest.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author onimu
 *
 */
@XmlType
@XmlRootElement(name = "pressure")
public class Pressure {
	private Double pressure;
	private String pressureUnit;

	public Pressure() {
	}
	
	/**
	 * @param pressure
	 * @param pressureUnit
	 */
	public Pressure(Double pressure, String pressureUnit) {
		super();
		this.pressure = pressure;
		this.pressureUnit = pressureUnit;
	}

	/**
	 * @return
	 */
	@XmlAttribute(name = "value")
	public Double getPressure() {
		return pressure;
	}

	/**
	 * @param pressure
	 */
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	/**
	 * @return
	 */
	@XmlAttribute(name = "value")
	public String getPressureUnit() {
		return pressureUnit;
	}

	/**
	 * @param pressureUnit
	 */
	public void setPressureUnit(String pressureUnit) {
		this.pressureUnit = pressureUnit;
	}
}
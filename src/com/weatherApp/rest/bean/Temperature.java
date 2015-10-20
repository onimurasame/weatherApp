/**
 * 
 */
package com.weatherApp.rest.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author onimu
 *
 */
@XmlType
@XmlRootElement(name = "temperature")
public class Temperature {
	private Double value;
	private Double minimum;
	private Double maximum;
	private String unit;
	
	public Temperature() {
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * @param value
	 * @param minimum
	 * @param maximum
	 * @param unit
	 */
	public Temperature(Double value, Double minimum, Double maximum, String unit) {
		super();
		this.value = value;
		this.minimum = minimum;
		this.maximum = maximum;
		this.unit = unit;
	}

	/**
	 * @return the value
	 */
	@XmlAttribute(name = "value")
	public Double getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}
	/**
	 * @return the minimum
	 */
	@XmlAttribute(name = "min")
	public Double getMinimum() {
		return minimum;
	}
	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(Double minimum) {
		this.minimum = minimum;
	}
	/**
	 * @return the maximum
	 */
	@XmlAttribute(name = "max")
	public Double getMaximum() {
		return maximum;
	}
	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(Double maximum) {
		this.maximum = maximum;
	}
	/**
	 * @return the unit
	 */
	@XmlAttribute(name = "unit")
	public String getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

}

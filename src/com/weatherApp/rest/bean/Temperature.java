/**
 * 
 */
package com.weatherApp.rest.bean;

/**
 * @author onimu
 *
 */
public class Temperature {
	private Double value;
	private Double minimum;
	private Double maximum;
	private String unit;
	/**
	 * @return the value
	 */
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

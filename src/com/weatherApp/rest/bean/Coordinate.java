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
@XmlRootElement(name = "coord")
public class Coordinate {
	
	private Double longitude;
	private Double latitude;
	
	public Coordinate() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param longitude
	 * @param latitude
	 */
	public Coordinate(Double longitude, Double latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	/**
	 * @return the longitude
	 */
	@XmlAttribute(name = "lon")
	public Double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the latitude
	 */
	@XmlAttribute(name = "lat")
	public Double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	
}

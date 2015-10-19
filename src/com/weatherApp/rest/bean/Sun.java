package com.weatherApp.rest.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sun")
public class Sun {
	private Date sunrise;
	private Date sunset;

	public Sun() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param sunrise
	 * @param sunset
	 */
	public Sun(Date sunrise, Date sunset) {
		super();
		this.sunrise = sunrise;
		this.sunset = sunset;
	}



	/**
	 * @return
	 */
	@XmlAttribute(name = "rise")
	public Date getSunrise() {
		return sunrise;
	}

	/**
	 * @param sunrise
	 */
	public void setSunrise(Date sunrise) {
		this.sunrise = sunrise;
	}

	/**
	 * @return
	 */
	@XmlAttribute(name = "set")
	public Date getSunset() {
		return sunset;
	}

	/**
	 * @param sunset
	 */
	public void setSunset(Date sunset) {
		this.sunset = sunset;
	}
}
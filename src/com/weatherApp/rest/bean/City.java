package com.weatherApp.rest.bean;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "city")
public class City {
	private Coordinate coordinates;
	private Integer id;
	private String name;
	private String country;
	private Sun sun;

	public City() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param coordinates
	 * @param id
	 * @param name
	 * @param country
	 * @param sun
	 */
	public City(Coordinate coordinates, Integer id, String name, String country, Sun sun) {
		super();
		this.coordinates = coordinates;
		this.id = id;
		this.name = name;
		this.country = country;
		this.sun = sun;
	}

	/**
	 * @return the coordinates
	 */
	@XmlElement(name = "coord")
	public Coordinate getCoordinates() {
		return coordinates;
	}

	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(Coordinate coordinates) {
		this.coordinates = coordinates;
	}

	/**
	 * @return the id
	 */
	@XmlAttribute(name = "id")
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	@XmlElement
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the sun
	 */
	@XmlElement
	public Sun getSun() {
		return sun;
	}

	/**
	 * @param sun the sun to set
	 */
	public void setSun(Sun sun) {
		this.sun = sun;
	}
}

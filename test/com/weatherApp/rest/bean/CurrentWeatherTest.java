/**
 * 
 */
package com.weatherApp.rest.bean;

import java.io.File;
import java.io.StringWriter;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author onimu
 *
 */
public class CurrentWeatherTest {

	@Test
	public void testMarshalling() {
		StringWriter sw = new StringWriter();

		City city = new City(new Coordinate(10.0, 10.0), 1, "Vina del Mar", "CL", new Sun(new Date(), new Date()));
		Temperature temp = new Temperature(30.0, 12.0, 34.0, "celsius");
		Pressure pressure = new Pressure(200.0, "kPa");

		CurrentWeather currentWeather = new CurrentWeather(city, temp, pressure);

		Assert.assertNotNull("Marshaller returned Null", marshall(currentWeather, sw));
		System.out.println(sw.toString());

	}
	
	@Test
	public void testUnmarshalling() {
		unmarshall("current.xml", new CurrentWeather());
	}

	private Marshaller marshall(Object obj, StringWriter sw) {
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(obj.getClass());

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(obj, sw);

			return jaxbMarshaller;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private Object unmarshall(String filename, Object obj) {
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(obj.getClass());

			Unmarshaller unmarshaller = jc.createUnmarshaller();
			File xml = new File(filename);
			Object object = unmarshaller.unmarshal(xml);

			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.setProperty(Marshaller.JAXB_NO_NAMESPACE_SCHEMA_LOCATION,
				//	"file:///C:/Documents%20and%20Settings/mojalal/Desktop/FirstXSD.xml");
			marshaller.marshal(object, System.out);
			return object;
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}

package com.weatherApp.rest.client.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.weatherApp.rest.client.RestClient;

public class RestClientTest {

	@Test
	public void test() {
		RestClient rc = new RestClient();

		Map<String, String> argsMap = new HashMap<String, String>();

		argsMap.put("q", "Sacramento,us");
		argsMap.put("appId", "bd82977b86bf27fb59a04b61b657fb6f");
		argsMap.put("mode", "xml");
		argsMap.put("units", "metric");

		System.out.println(rc.getAllXML(argsMap));
	}

}

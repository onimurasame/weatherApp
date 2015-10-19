package com.weatherApp.rest.client;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

/**
 * @author rastudillo
 *
 */
public class RestClient {

	private static final String REST_URL = RestConfigurator.getConfiguratedUrl();
	private static final String REST_PATH = RestConfigurator.getConfiguratedPath();

	private Client client = Client.create();

	public RestClient() {
	}

	public String getAllXML(Map<String, String> args) {
		return getAll(args, MediaType.APPLICATION_XML_TYPE);
	}

	public String getAllJSON(Map<String, String> args) {
		return getAll(args, MediaType.APPLICATION_JSON_TYPE);
	}

	public String getAll(Map<String, String> args, MediaType mediaType) {
		System.out.println("Querying URL : " + REST_URL + REST_PATH);
		WebResource wr = client.resource(REST_URL);

		MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
		for (Map.Entry<String, String> arg : args.entrySet()) {
			queryParams.add(arg.getKey(), arg.getValue());
		}

		ClientResponse response = wr.path(REST_PATH).queryParams(queryParams).accept(mediaType).get(ClientResponse.class);

		if (response.getStatus() != 200) {
			System.out.println("Status: " + response.getStatus());
		}

		return response.getEntity(String.class);
	}

	public static void main(String[] args) {
		RestClient rc = new RestClient();

		Map<String, String> argsMap = new HashMap<String, String>();

		argsMap.put("q", "Sacramento,us");
		argsMap.put("appId", "bd82977b86bf27fb59a04b61b657fb6f");
		argsMap.put("mode", "json");
		argsMap.put("units", "metric");

		System.out.println(rc.getAllXML(argsMap));
		System.out.println(rc.getAllJSON(argsMap));

	}
}

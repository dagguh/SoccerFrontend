package pl.dagguh.soccerfrontend.backend;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

/**
 *
 * @author Maciej Kwidziński <maciek.kwidzinski@gmail.com>
 */
class Backend {

	public static WebResource getResource(String path) {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		return client.resource(getBackendRestUri() + path);
	}

	private static String getBackendRestUri() {
		return "https://localhost:8181/SoccerBackend/rest";
	}
}

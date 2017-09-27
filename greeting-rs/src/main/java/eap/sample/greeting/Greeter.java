package eap.sample.greeting;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A simple REST service to greet user.
 */
@Path("/")
public class Greeter {
	@Inject
	GreetingService greetingService;

	@GET
	@Path("/json")
	@Produces({ "application/json" })
	public String getHelloWorldJSON() {
		return "{\"result\":\"" + greetingService.greet("World") + "\"}";
	}

	@GET
	@Path("/xml")
	@Produces({ "application/xml" })
	public String getHelloWorldXML() {
		return "<xml><result>" + greetingService.greet("World") + "</result></xml>";
	}
}

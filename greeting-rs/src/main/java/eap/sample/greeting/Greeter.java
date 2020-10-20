package eap.sample.greeting;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A simple REST service to greet user.
 */
@Path("/")
public class Greeter {
    @Inject
    GreetingService greetingService;

    @POST
    @Path("/json/{name}")
    @Produces("application/json")
    public String getHelloWorldJSON(@PathParam("name") String name) {
        System.out.println("name: " + name);
        return "{\"result\":\"" + greetingService.greet(name) + "\"}";
    }

    @POST
    @Path("/xml/{name}")
    @Produces("application/xml")
    public String getHelloWorldXML(@PathParam("name") String name) {
        System.out.println("name: " + name);
        return "<xml><result>" + greetingService.greet(name) + "</result></xml>";
    }
}

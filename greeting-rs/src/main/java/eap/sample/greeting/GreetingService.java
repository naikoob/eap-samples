package eap.sample.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingService {

	private static final Logger LOG = LoggerFactory.getLogger(GreetingService.class);

	String greet(String name) {
		LOG.info("greetings, {}", name);
		return "Hello " + name + "!";
	}
}

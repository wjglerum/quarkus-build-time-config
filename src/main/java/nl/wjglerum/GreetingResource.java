package nl.wjglerum;

import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class GreetingResource {

    @Inject
    Logger logger;

    @Inject
    GreetingConfig config;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        logger.info("quarkus.greeting.name=" + config.name);
        return String.format("Hello RESTEasy from %s", config.name);
    }
}

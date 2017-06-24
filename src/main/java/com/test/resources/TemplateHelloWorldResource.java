package com.test.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.test.representations.TemplateHelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/template-hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class TemplateHelloWorldResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(TemplateHelloWorldResource.class);

    private String respString;
    private AtomicLong apiHitCounter;

    public TemplateHelloWorldResource(String respString) {
        this.respString = respString;
        apiHitCounter = new AtomicLong();
    }

    @GET
    @Timed
    public TemplateHelloWorld sayHello(@QueryParam("name") Optional<String> name) {
        LOGGER.info("API Counter: ", apiHitCounter.incrementAndGet());
        return new TemplateHelloWorld(name.or(respString));
    }

}

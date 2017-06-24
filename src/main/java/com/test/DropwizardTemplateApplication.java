package com.test;

import com.test.resources.TemplateHelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardTemplateApplication extends Application<DropwizardConfiguration> {

    public static void main(String[] args) throws Exception {
        new DropwizardTemplateApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard-template";
    }

    @Override
    public void initialize(Bootstrap<DropwizardConfiguration> bootstrap) {
    }

    @Override
    public void run(DropwizardConfiguration configuration, Environment environment) {
        final TemplateHelloWorldResource templateHelloWorldResource = new TemplateHelloWorldResource(
                configuration.getDefaultResponse());

        environment.jersey().register(templateHelloWorldResource);
    }
}

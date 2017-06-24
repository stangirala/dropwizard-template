package com.test;

import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class DropwizardConfiguration extends Configuration {

    @NotNull
    private String defaultResponse;

    public String getDefaultResponse() {
        return defaultResponse;
    }

    public void setDefaultResponse(String defaultResponse) {
        this.defaultResponse = defaultResponse;
    }
}

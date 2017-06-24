package com.test.representations;

public class TemplateHelloWorld {

    private String respString;

    public TemplateHelloWorld() {
    }

    public TemplateHelloWorld(String respString) {

        this.respString = respString;
    }

    public String getRespString() {
        return respString;
    }

    public void setRespString(String respString) {
        this.respString = respString;
    }
}

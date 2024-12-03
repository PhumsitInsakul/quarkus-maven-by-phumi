package io.quarkiverse.cxf.it.server;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloResponse {
    private String message;

    public HelloResponse() {}

    public HelloResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

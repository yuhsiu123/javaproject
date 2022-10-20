package org.example.server.http;

public enum ContentType {
    TEXT_PLAIN("text_plain"),
    APP_JSON("application/json")
    ;


    ContentType(String contentType) {
        this.contentType = contentType;
    }

    public String contentType;
}

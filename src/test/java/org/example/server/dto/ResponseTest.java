package org.example.server.dto;

import org.example.server.http.ContentType;
import org.example.server.http.StatusCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTest {

    @Test
    void testSetStatusCode() {
        // Arrange
        Response response = new Response();

        // Act
        response.setStatusCode(StatusCode.OK);

        // Assert
        assertEquals(StatusCode.OK.code, response.getStatus());
        assertEquals(StatusCode.OK.message, response.getMessage());
    }

    @Test
    void testSetContentType(){
        Response response = new Response();

        response.setContentType(ContentType.TEXT_PLAIN);

        assertEquals(ContentType.TEXT_PLAIN, response.getContentType());
    }
}
package org.example.application.users.controller;

import org.example.application.users.model.User;
import org.example.application.users.repository.UserRepository;
import org.example.server.dto.Request;
import org.example.server.dto.Response;
import org.example.server.http.ContentType;
import org.example.server.http.StatusCode;

import java.util.List;

public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){this.userRepository = userRepository;}

    public Response handle(Request request){
        if (request.getMethod().equals("POST")) {
            return createUser(request);
        }

        Response response = new Response();
        response.setStatusCode(StatusCode.METHODE_NOT_ALLOWED);
        response.setContentType(ContentType.APP_JSON);
        response.setContent(request.getMethod() + ": Not allowed for " + request.getPath());

        return response;
    }

    private Response createUser(Request request){

    }

}

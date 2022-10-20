package org.example.application.users;

import org.example.application.users.controller.UserController;
import org.example.application.users.repository.UserMemoryRepository;
import org.example.application.users.repository.UserRepository;
import org.example.server.Application;
import org.example.server.dto.Request;
import org.example.server.dto.Response;
import org.example.server.http.ContentType;
import org.example.server.http.StatusCode;

public class Users implements Application {

    private UserController userController;

    private UserMemoryRepository userMemoryRepository;

    public Users(){this.inject();}

    @Override
    public Response handle(Request request) {

        if (request.getPath().equals("/users")) {
            return userController.handle(request);
        }

        Response response = new Response();
        response.setStatusCode(StatusCode.NOT_FOUND);
        response.setContentType(ContentType.TEXT_PLAIN);
        response.setContent(request.getPath() + ": Not Found");

        return response;
    }

    private void inject(){
        this.userMemoryRepository = new UserMemoryRepository();
        this.userController = new UserController(this.userMemoryRepository);
    }
}

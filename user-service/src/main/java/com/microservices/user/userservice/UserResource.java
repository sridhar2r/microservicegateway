package com.microservices.user.userservice;

import com.microservices.user.userservice.dto.Users;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by sridharrajagopal on 6/2/22.
 */
@RestController
public class UserResource {
    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public Users getUsers(@PathVariable("userId") String id, HttpServletRequest request) {
        System.out.println("User service is running in port: " +request.getLocalPort());
        return new Users(id, 30, "Sri");
    }
}

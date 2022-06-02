package com.microservices.library.libraryservice;

import com.microservices.library.libraryservice.dto.Books;
import com.microservices.library.libraryservice.dto.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

/**
 * Created by sridharrajagopal on 6/2/22.
 */
@RestController
public class LibraryResource {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping(value = "/books/{userId}", method = RequestMethod.GET)
    public Books getBookDetails(@PathVariable("userId") String userId, HttpServletRequest request) {
        System.out.println("Library service is running in port: " +request.getLocalPort());
        Users users = restTemplate.getForObject("http://user-service/users/" + userId, Users.class);
        return Books.builder().bookName("Moby Dick")
                .isin("ISIN1234").dateOfReturn(LocalDate.now()).users(users).build();
    }

}

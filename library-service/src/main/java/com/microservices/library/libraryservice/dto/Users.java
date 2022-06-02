package com.microservices.library.libraryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by sridharrajagopal on 6/2/22.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    private String id;
    private String name;
    private long age;
}

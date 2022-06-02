package com.microservices.user.userservice.dto;

/**
 * Created by sridharrajagopal on 6/2/22.
 */
public class Users {
    private String id;
    private String name;
    private long age;

    public Users() {
    }

    public Users(String name, long age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}

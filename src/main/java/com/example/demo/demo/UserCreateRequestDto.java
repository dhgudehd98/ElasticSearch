package com.example.demo.demo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequestDto {
    private String id;
    private String name;
    private Long age;
    private boolean isActive;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getAge() {
        return age;
    }

    public boolean getActive() {
        return isActive;
    }
}
package com.example.demo.demo;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class UserUpdateRequestDto {
    private String name;
    private Long age;
    private boolean isActive;

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
package com.example.designpatterns.creational.builder.implement1;

import lombok.AllArgsConstructor;
import lombok.Data;

//Product class
@Data
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String age;
    private String address;
}

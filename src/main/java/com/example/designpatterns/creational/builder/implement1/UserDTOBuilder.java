package com.example.designpatterns.creational.builder.implement1;

import java.time.LocalDate;

//Builder interface
public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withBirthday(LocalDate date);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}

package com.example.designpatterns.creational.builder.implement1;

import java.time.LocalDate;
import java.time.Period;

//Builder concrete implementation
public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;

    private UserDTO dto;
    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = String.valueOf(ageInYears.getYears());
        return this;
    }
    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity();
        return this;
    }
    @Override
    public UserDTO build() {
        this.dto = new UserDTO(firstName + " " + lastName, age, address);
        return this.dto;
    }

    @Override
    public UserDTO getUserDTO() {
        return this.dto;
    }
}

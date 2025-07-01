package com.example.designpatterns.creational.builder.implement2;

import com.example.designpatterns.creational.builder.implement1.Address;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

//Product class
@Getter
public class UserDTO {
    private String name;
    private String age;
    private String address;

    //Private setters -> Immutable
    private void setName(String name) {
        this.name = name;
    }
    private void setAge(String age) {
        this.age = age;
    }
    private void setAddress(String address) {
        this.address = address;
    }

    public static UserWebDTOBuilder getBuilder(){
        return new UserWebDTOBuilder();
    }

    public static class UserWebDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;

        @Getter
        private UserDTO userDTO;

        public UserWebDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public UserWebDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserWebDTOBuilder withBirthday(LocalDate date) {
            Period ageInYears = Period.between(date, LocalDate.now());
            this.age = String.valueOf(ageInYears.getYears());
            return this;
        }
        public UserWebDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + ", " + address.getCity();
            return this;
        }

        public UserDTO build() {
            this.userDTO = new UserDTO();
            userDTO.setName(firstName + " " + lastName);
            userDTO.setAddress(address);
            userDTO.setAge(age);
            return this.userDTO;
        }
    }
}

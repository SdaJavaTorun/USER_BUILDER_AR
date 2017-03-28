package com.sda.builderconstructor;

public class User {

    private String firstName;  // req
    private String lastName;  // req
    private String telephone;  // opt
    private String address;  // opt
    private int age;  // opt

    private User(Builder builder) {
        setFirstName(builder.firstName);
        setLastName(builder.lastName);
        setTelephone(builder.telephone);
        setAddress(builder.address);
        setAge(builder.age);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String telephone;
        private String address;
        private int age;

        // jesli wszystkie pola klasy bazowej sa opcjonalne stosujemy taki konstruktor
        public Builder() {
        }

        // w taki konstruktor wstawiamy pola, które maja być wymagane
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder firstName(String val) {
            firstName = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder telephone(String val) {
            telephone = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

package com.sda.builderconstructor;

public class User {

    private String firstName;  // req
    private String lastName;  // req
    private String telephone;  // opt
    private String address;  // opt
    private int age;  // opt

    public User(UserBuilder userBuilder) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.address = address;
        this.age = age;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class UserBuilder {
        private String firstName;  // req
        private String lastName;  // req
        private String telephone;  // opt
        private String address;  // opt
        private int age;  // opt

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age (int age) {
            this.age = age;
            return this;
        }

        public UserBuilder telephone (String telephone) {
            this.telephone = telephone;
            return this;
        }

        public UserBuilder address (String address) {
            this.address = address;
            return this;
        }

        public User build () {
            return new User(this);
        }
    }
}

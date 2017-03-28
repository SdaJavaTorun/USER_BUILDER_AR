package com.sda.builderconstructor;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User student = new User.UserBuilder("Jan", "Kowalski")
                .age(20)
                .address("adres")
                .build();

        System.out.println(student.toString());
    }
}

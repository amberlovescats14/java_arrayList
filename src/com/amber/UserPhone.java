package com.amber;

public class UserPhone extends ContactNames{
    private String firstName;
    private String lastName;
    private String fullName;

    public UserPhone(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public String getFullName() {
        return fullName;
    }
}

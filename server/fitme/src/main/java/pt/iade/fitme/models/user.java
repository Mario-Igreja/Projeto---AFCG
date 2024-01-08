package pt.iade.fitme.models;

import pt.iade.fitme.enums.gender;

// User.java
public class user {
    private String name;
    private String email;
    private String password;
    private gender gender;
    private double height;
    private double weight;
    private String birthDate;

    private String verificationCode;

    private boolean isVerified;


    // getters and setters

    // constructor
    public user(String name, String email, String password, pt.iade.fitme.enums.gender gender, double height, double weight, String birthDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.birthDate = birthDate;
        this.isVerified = false;
        this.verificationCode = generateVerificationCode();
    }
}

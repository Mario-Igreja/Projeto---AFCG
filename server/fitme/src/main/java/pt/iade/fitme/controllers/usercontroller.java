package pt.iade.fitme.controllers;


import pt.iade.fitme.enums.gender;
import pt.iade.fitme.Service.UserService;

// UserController.java
public class usercontroller {
    private pt.iade.fitme.Service.UserService userservice;

    public usercontroller() {
        this.userservice = new UserService();
    }

    // Register endpoint
    public boolean registerUser(String name, String email, String password, gender gender, double height, double weight, String birthDate) {
        boolean isRegistered = userservice.registerUser(name, email, password, gender, height, weight, birthDate);

        if (isRegistered) {
            // Se o registro for bem-sucedido, envie o código de verificação por e-mail
            userservice.sendVerificationCode(email);
        }

        return isRegistered;

        // Login endpoint
        public boolean loginUser (String email, String password){
            return userservice.loginUser(email, password);
        }
    }
}
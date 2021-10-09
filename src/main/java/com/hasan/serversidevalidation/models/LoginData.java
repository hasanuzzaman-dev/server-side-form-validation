package com.hasan.serversidevalidation.models;

import javax.validation.constraints.*;


public class LoginData {
    @NotBlank(message = "Username can't be empty!")
    @Size(min = 3,max = 12, message = "Username must be between 3-12!")
    private String userName;


    @NotBlank(message = "Email can't be empty!")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid email !!")
    private String email;

    @AssertTrue(message = "Must be agree terms & condition")
    private boolean agreed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", isAgree=" + agreed +
                '}';
    }
}

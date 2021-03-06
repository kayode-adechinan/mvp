package com.kayodeadechinan.mvp;

/**
 * Created by kayodeadechinan on 12/16/17.
 */

public class User {

    private String fullName;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "FullName : " + fullName + "\nEmail : " + email;
    }
}
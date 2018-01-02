package com.kayodeadechinan.mvp;

/**
 * Created by kayodeadechinan on 12/16/17.
 */

public class MainPresenter {

    User user;
    View view;

    public MainPresenter(View view) {
        this.view = view;
        user  = new User();
    }

    public void updateFullName(String fullName) {
        user.setFullName(fullName);
        view.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email) {
        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());
    }

    public interface View {
        void updateUserInfoTextView(String info);
    }
}

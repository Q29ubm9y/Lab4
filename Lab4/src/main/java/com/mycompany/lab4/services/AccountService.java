package com.mycompany.lab4.services;

import com.mycompany.lab4.problemdomain.User;

/**
 *
 * @author Connor
 */
public class AccountService {
    public User login(String username, String password) {
        if (username.equals("abe") && password.equals("password")) {
            return new User(username, null);
        } else if (username.equals("barb") && password.equals("password")) {
            return new User(username, null);
        } else {
            return null;
        }
    }
}

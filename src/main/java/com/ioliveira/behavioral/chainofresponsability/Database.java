package com.ioliveira.behavioral.chainofresponsability;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> users;

    public Database() {
        users = new HashMap<>();
        users.put("admin_username", "admin_password");
        users.put("user_username", "user_password");
    }

    public boolean isValidUser(final String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(final String username, final String password) {
        return users.get(username).equals(password);
    }
}

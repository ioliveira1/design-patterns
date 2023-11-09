package com.ioliveira.behavioral.chainofresponsability.handlers;

import com.ioliveira.behavioral.chainofresponsability.Database;

import java.util.Objects;

public class UserExistsHandler extends Handler {

    private final Database database;

    public UserExistsHandler(final Database database) {
        this.database = Objects.requireNonNull(database);
    }

    @Override
    public boolean login(final String username, final String password) {
        if (!database.isValidUser(username)) {
            System.out.println("Invalid username!");
            return true;
        }
        return handleNext(username, password);
    }
}

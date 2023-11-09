package com.ioliveira.behavioral.chainofresponsability.handlers;

import com.ioliveira.behavioral.chainofresponsability.Database;

import java.util.Objects;

public class ValidPasswordHandler extends Handler {

    private final Database database;

    public ValidPasswordHandler(final Database database) {
        this.database = Objects.requireNonNull(database);
    }

    @Override
    public boolean login(final String username, final String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Invalid password!");
            return true;
        }
        return this.handleNext(username, password);
    }
}

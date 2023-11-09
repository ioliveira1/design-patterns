package com.ioliveira.behavioral.chainofresponsability.handlers;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean login(final String username, final String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Loading admin page...");
            return true;
        }
        System.out.println("Loading default page...");
        return handleNext(username, password);
    }
}

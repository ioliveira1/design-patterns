package com.ioliveira.behavioral.chainofresponsability;

import com.ioliveira.behavioral.chainofresponsability.handlers.Handler;
import com.ioliveira.behavioral.chainofresponsability.handlers.RoleCheckHandler;
import com.ioliveira.behavioral.chainofresponsability.handlers.UserExistsHandler;
import com.ioliveira.behavioral.chainofresponsability.handlers.ValidPasswordHandler;

public class Main {
    public static void main(String[] args) {

        final Database database = new Database();
        final Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database)).setNextHandler(new RoleCheckHandler());

        handler.login("admin_username", "admin_password");
    }
}

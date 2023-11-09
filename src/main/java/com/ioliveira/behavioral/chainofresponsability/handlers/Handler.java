package com.ioliveira.behavioral.chainofresponsability.handlers;

public abstract class Handler {
    private Handler handler;

    public Handler setNextHandler(Handler handler) {
        this.handler = handler;
        return handler;
    }

    public abstract boolean login(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (this.handler == null) {
            return true;
        }
        return handler.login(username, password);
    }

}

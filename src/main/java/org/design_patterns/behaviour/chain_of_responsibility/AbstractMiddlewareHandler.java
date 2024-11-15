package org.design_patterns.behaviour.chain_of_responsibility;

public class AbstractMiddlewareHandler implements MiddlewareHandler{

    private MiddlewareHandler nextMiddleware;

    @Override
    public MiddlewareHandler setNext(MiddlewareHandler middlewareHandler) {
        nextMiddleware = middlewareHandler;
        return middlewareHandler;
    }

    @Override
    public boolean handleRequest(Request request) {
        if (nextMiddleware != null) {
            return nextMiddleware.handleRequest(request);
        }
        return true;
    }
}

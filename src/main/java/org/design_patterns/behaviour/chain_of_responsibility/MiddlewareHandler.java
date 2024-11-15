package org.design_patterns.behaviour.chain_of_responsibility;

public interface MiddlewareHandler {

    MiddlewareHandler setNext(MiddlewareHandler middlewareHandler);
    boolean handleRequest(Request request);
}

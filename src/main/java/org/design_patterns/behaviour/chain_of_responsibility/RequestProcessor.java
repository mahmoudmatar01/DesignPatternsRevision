package org.design_patterns.behaviour.chain_of_responsibility;

public class RequestProcessor {
    private final MiddlewareHandler middlewareHandler;

    public RequestProcessor(MiddlewareHandler middlewareHandler) {
        this.middlewareHandler = middlewareHandler;
    }

    public Response processRequest(Request request) {
        if(!middlewareHandler.handleRequest(request)){
            return new Response("Request Failed",false);
        }
        return new Response("Request Successfully process",true);
    }
}

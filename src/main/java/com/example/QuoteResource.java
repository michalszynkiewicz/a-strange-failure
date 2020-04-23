package com.example;

import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RoutingExchange;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class QuoteResource {
    @Route(path = "/quote", methods = HttpMethod.GET)
    public void gello(RoutingExchange ctx) {
        ctx.response().setStatusCode(200).end("hello");
    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hello() {
//        return "helloo";
//    }

}

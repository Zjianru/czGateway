package com.cz.gateway.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * code desc
 *
 * @author Zjianru
 */
@Component
public class HelloHandler {

    public Mono<ServerResponse> handler(ServerRequest request){
        return ServerResponse.ok().body(Mono.just("hello Spring webFlux"),String.class);
    }

}

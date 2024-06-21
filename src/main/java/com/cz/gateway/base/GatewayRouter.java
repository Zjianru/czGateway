package com.cz.gateway.base;

import com.cz.gateway.handler.HelloHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;


/**
 * code desc
 *
 * @author Zjianru
 */
@Component
public class GatewayRouter {
    @Autowired
    HelloHandler helloHandler;

    @Bean
    public RouterFunction<?> helloRouter() {
        return RouterFunctions.route(RequestPredicates.GET("/hello"), helloHandler::handler);
    }

}

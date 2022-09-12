package com.sang12.blog.presantation.router;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class ContentConfig {
    @Bean
    public RouterFunction<ServerResponse> contentRouter(){
        return RouterFunctions.route()
            .GET("/hello-world", accept(MediaType.TEXT_PLAIN),
                request -> ServerResponse.ok().bodyValue("Hello World")).build();
    }
}

package com.sang12.blog.infrastructure.adapter.in.web.router;

import com.sang12.blog.infrastructure.adapter.in.web.handler.ContentHandlerJava;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Component
public class ContentConfigJava {
    private final ContentHandlerJava handler;
    public ContentConfigJava(@Autowired ContentHandlerJava contentHandlerJava){
        this.handler = contentHandlerJava;
    }
    @Bean
    public RouterFunction<ServerResponse> contentRouter(){
        return RouterFunctions.route()
            .GET("/content/java", accept(APPLICATION_JSON), handler::getJavaContents)
            .build();
    }
}

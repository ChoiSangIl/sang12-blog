package com.sang12.blog.infrastructure.adapter.in.web.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class ContentHandlerJava {
    public Mono<ServerResponse> getJavaContents(ServerRequest request) {
        System.out.println(request);
        return ServerResponse.ok().bodyValue("Hello java Contents");
    }
}

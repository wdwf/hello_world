package com.generation.helloworld.listener;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ServerPortLogger implements ApplicationListener<WebServerInitializedEvent> {

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        int port = event.getWebServer().getPort();
        System.out.println("=====================================");
        System.out.println("  Aplicação rodando na rota: " + "http://localhost:" + port);
        System.out.println("=====================================");
    }

}

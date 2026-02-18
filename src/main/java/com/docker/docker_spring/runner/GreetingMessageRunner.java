package com.docker.docker_spring.runner;

import com.docker.docker_spring.service.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GreetingMessageRunner implements CommandLineRunner {

    private final Message service;

    @Autowired
    public GreetingMessageRunner(Message service){
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        //Calling the Greeting message method by using the service Object
        service.greetingMessage();
    }
}

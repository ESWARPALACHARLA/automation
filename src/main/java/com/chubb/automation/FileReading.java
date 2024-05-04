package com.chubb.automation;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileReading extends RouteBuilder {
    @Override
    public void configure() throws Exception {

   /*     from("file://D//eswar.json")
                .log("Received${body}")
                .routeId("file-router")
                .to("direct:start");*/
        System.out.println("king");
        from("file://C:/Users/Eswar/Documents/eswar.json")
                .convertBodyTo(String.class)
             //   .unmarshal().json()
                .log("Reading JSON file: ${header.CamelFileName} with content: ${body}");
    }
}

package com.jerseygrizzly;

import java.io.IOException;
import java.net.URI;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class EntryPoint {
  public static void main(String[] args) throws IOException {
    ResourceConfig rc = new ResourceConfig().packages("com.jerseygrizzly.resources",
        "com.moxiter.crm.resources");

    GrizzlyHttpServerFactory.createHttpServer(URI.create("http://localhost:8080"), rc);
    System.out.println("Server started. Hit enter to stop it...");
    System.in.read();
  }
}

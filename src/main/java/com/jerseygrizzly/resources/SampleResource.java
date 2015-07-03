package com.jerseygrizzly.resources;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sample")
public class SampleResource {

  @GET
  @Path("ping")
  @Produces(MediaType.APPLICATION_JSON)
  public String pingMethod() {
    return "ping method called at " + new Date();
  }

}

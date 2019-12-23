package com.ekaterinadubinina.java.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class Hello {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello world!";
    }
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello world XML" + "</hello>";
    }
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello world HTML" + "</h1></body>" + "</html> ";
    }
    @GET
    @Path("/{param}")
    public Response getmsg(@PathParam("param") String msg){
        String output = "Hello world "+ msg;
        return Response.status(200).entity(output).build();
    }
}
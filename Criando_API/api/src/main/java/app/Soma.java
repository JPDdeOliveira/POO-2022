package app;

import io.jooby.annotations.*;

@Path("/soma/{op}/{op2}")
public class Soma {
    
    @GET
    public Double calculandoSoma(@PathParam double op, double op2){
        return op+op2;
    }
}

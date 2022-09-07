package app;

import io.jooby.annotations.*;

@Path("/sub/{op}/{op2}")
public class Subtracao {
    
    @GET
    public Double calculandoSoma(@PathParam double op, @PathParam double op2){
        return op - op2;    
    }
}
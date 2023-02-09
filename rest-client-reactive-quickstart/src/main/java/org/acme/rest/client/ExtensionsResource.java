package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.net.URI;
import java.util.Set;

@Path("/posts")
public class ExtensionsResource {
    //instead of @RestClient or @Inject , we coded programatically with RestCLientBuilder
   private  ExtensionsService extensionsService;
   public ExtensionsResource(){
       extensionsService = RestClientBuilder.newBuilder()
               .baseUri(URI.create("https://jsonplaceholder.typicode.com"))
               .build(ExtensionsService.class);
   }
    @GET
    public Set<Extensions> id(int id){
        return extensionsService.getById(id);
    }

}

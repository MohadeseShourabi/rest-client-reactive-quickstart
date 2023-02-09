package org.acme.rest.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.net.http.HttpClient;
import java.security.cert.CertPathBuilder;
import java.util.Set;

@Path("/posts")
@RegisterRestClient(baseUri = "https://jsonplaceholder.typicode.com")
public interface ExtensionsService {
    @GET
    Set<Extensions> getById(@QueryParam("id") int id);
}

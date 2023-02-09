package org.acme.rest.client;

import io.vertx.core.http.HttpClientOptions;

import javax.ws.rs.ext.ContextResolver;

public class CustomHttpClientOptions implements ContextResolver<HttpClientOptions> {
    @Override
    public HttpClientOptions getContext(Class<?> aClass) {
        HttpClientOptions options = new HttpClientOptions();
        //can code to set timeout
        return options;
    }
}

package com.sunshine.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * Created by zhangm on 2017/1/11.
 */
@ApplicationPath("/webapi/*")
public class AirResourceConfig extends ResourceConfig {

    public AirResourceConfig() {
        packages("com.sunshine.rest");
    }
}

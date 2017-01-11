package com.sunshine.rest;

import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by zhangm on 2017/1/11.
 */
@WebServlet(
    initParams = @WebInitParam(name = "jersey.config.server.provider.packages", value = "com.sunshine.rest"),
    urlPatterns = "/webapi/*",
    loadOnStartup = 1
)
public class AirServlet extends ServletContainer {
}

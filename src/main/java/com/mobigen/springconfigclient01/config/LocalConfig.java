package com.mobigen.springconfigclient01.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class LocalConfig {

    @Value("${app.version}")
    private String version;

    @Value("${app.dt}")
    private String dt;

    @Value("${app.message}")
    private String message;

    public String getVersion() {
        return version;
    }

    public String getDt() {
        return dt;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LocalConfig{" +
                "version='" + version + '\'' +
                ", message='" + message + '\'' +
                ", dt='" + dt + '\'' +
                '}';
    }
}

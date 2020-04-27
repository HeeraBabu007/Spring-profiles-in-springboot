package com.springProfiles.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("!dev")
@Configuration
public class DevDatasourceConfig {

    @PostConstruct
    public void LoadingTest() {
        System.out.println("Application connecting to DEV environment(DB and APPS)");
    }
}

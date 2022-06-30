package com.srjons.springprofiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringProfilesApplication {

    @Autowired
    AppTLSConfig appTLSConfig;

    public static void main(String[] args) {
        SpringApplication.run(SpringProfilesApplication.class, args);
    }

    @PostConstruct
    public void init() {
        appTLSConfig.config();
    }
}

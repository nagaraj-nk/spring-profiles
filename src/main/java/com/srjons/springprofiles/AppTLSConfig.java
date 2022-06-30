package com.srjons.springprofiles;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class AppTLSConfig {

    public void config(){
        System.out.println("prod config");
    }
}

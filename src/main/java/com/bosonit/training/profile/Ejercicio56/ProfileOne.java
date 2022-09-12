package com.bosonit.training.profile.Ejercicio56;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:INT.properties")
@RestController
@Profile("profile1")
public class ProfileOne {


    @Value("${environment}")
    private String environment;

    @Value("${bd.url}")
    private String bdUrl;

//    @PostConstruct
    @GetMapping("/profile1")
    public String view(){
       return "INT.properties contains: "+"\n"+"environment="+environment+"\n"+"bd.url="+bdUrl;
    }

}

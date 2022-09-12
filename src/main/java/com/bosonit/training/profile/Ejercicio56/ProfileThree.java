package com.bosonit.training.profile.Ejercicio56;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@PropertySource("classpath:PRO.properties")
@Profile("profile3")
@RestController
public class ProfileThree {
    @Value("${environment}")
    private String environment;

    @Value("${bd.url}")
    private String bdUrl;


    @GetMapping("/profile3")
    public String view(){
        return "PRO.properties contains: "+"\n"+"environment="+environment+"\n"+"bd.url="+bdUrl;
    }
}

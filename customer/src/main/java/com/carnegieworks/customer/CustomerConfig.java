package com.carnegieworks.customer;

import net.bytebuddy.agent.builder.ResettableClassFileTransformer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

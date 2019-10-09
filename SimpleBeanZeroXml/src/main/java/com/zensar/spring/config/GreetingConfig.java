package com.zensar.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.zensar.spring")
public class GreetingConfig {

}

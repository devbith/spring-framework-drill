package com.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource(name = "file-property", value = "file:${HOME}/hacker.properties")
@PropertySource(name = "app-property", value = "classpath:/application.properties")
public class AppConfiguration {

}

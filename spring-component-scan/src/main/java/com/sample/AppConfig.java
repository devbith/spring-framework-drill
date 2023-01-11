package com.sample;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

//@ComponentScan
@ComponentScan(
    basePackages = "com.sample",
    includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Bean"),
    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*(Controller|Service).*")
)
public class AppConfig {

}

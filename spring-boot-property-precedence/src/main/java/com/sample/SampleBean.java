package com.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record SampleBean(@Value("${app.name}") String appName) {
}

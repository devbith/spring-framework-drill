package com.sample.definitions.custom_annotation.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.context.annotation.Profile;

@Retention(value = RetentionPolicy.RUNTIME)
@Profile("file")
public @interface FileProfile {

}

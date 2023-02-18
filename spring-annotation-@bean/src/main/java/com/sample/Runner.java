package com.sample;

import com.sample.beans.SpringBean2;
import com.sample.beans.SpringBean3;
import java.security.MessageDigest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

 public static void main(String[] args) {
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.sample");
  context.registerShutdownHook();

 }

}

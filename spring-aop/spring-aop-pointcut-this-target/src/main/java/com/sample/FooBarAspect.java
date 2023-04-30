package com.sample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FooBarAspect {

  @Before("this(com.sample.Bar)")
  public void exampleThisBar(JoinPoint joinPoint) {
    System.out.println("JDK proxy: this(com.sample.Bar)");
  }

  // This method won't execute: 'this' is not the instance of BarImpl.
  // In JDK proxy, 'this' refers to BarImplJDKProxy and 'target' refers to instance of BarImpl.
  @Before("this(com.sample.BarImpl)")
  public void exampleThisBarImpl() {
    System.out.println("JDK proxy: this(com.sample.BarImpl)");
  }

  @Before("this(com.sample.Foo)")
  public void exampleThisFoo() {
    System.out.println("CGLIB proxy: this(com.sample.Foo)");
  }

  @Before("target(com.sample.Bar)")
  public void exampleTargetBar() {
    System.out.println("JDK proxy: target(com.sample.Bar)");
  }

  @Before("target(com.sample.BarImpl)")
  public void exampleTargetBarImpl() {
    System.out.println("JDK proxy: target(com.sample.BarImpl)");
  }

  @Before("target(com.sample.Foo)")
  public void exampleTargetFoo() {
    System.out.println("CGLIB proxy: target(com.sample.Foo)");
  }

}

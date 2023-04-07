package com.sample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanD {

  private SpringBeanA springBeanA;
  private SpringBeanB springBeanB;
  private SampleClassC sampleClassC;

/*
  As spring is not managing the SpringBeanC and to avoid the below exception we are using Java Optional
          beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.sample.bean.SampleClassC'
  Using Java Optional to indicate that SampleClassC parameter is optional in the below constructor
  to make a dependency injection.

  @Autowired
  public SpringBeanD(SpringBeanA springBeanA, SpringBeanB springBeanB, Optional<SampleClassC> sampleClassC) {
    this.springBeanA = springBeanA;
    this.springBeanB = springBeanB;
    sampleClassC.ifPresent(sampleClassC1 -> this.sampleClassC = sampleClassC1);
  }
*/

/*
  As spring is not managing the SpringBeanC and to avoid the below exception we are using @Nullable from org.springframework.lang.Nullable
          beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.sample.bean.SampleClassC'
  Using Spring @Nullable to indicate that SampleClassC parameter is optional in the below constructor
  to make a dependency injection.

  @Autowired
  public SpringBeanD(SpringBeanA springBeanA, SpringBeanB springBeanB, @Nullable SampleClassC sampleClassC) {
    this.springBeanA = springBeanA;
    this.springBeanB = springBeanB;
    this.sampleClassC = sampleClassC;
  }
  */


/*
 As spring is not managing the SpringBeanC and to avoid the below exception we are using @Autowired(required = false)
          beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.sample.bean.SampleClassC'
  Using Spring @Autowired(required = false) to indicate that SampleClassC parameter is optional in the below constructor
  to make a dependency injection.
  */
  @Autowired
  public SpringBeanD(SpringBeanA springBeanA, SpringBeanB springBeanB, @Autowired(required = false) SampleClassC sampleClassC) {
    this.springBeanA = springBeanA;
    this.springBeanB = springBeanB;
    this.sampleClassC = sampleClassC;
  }

  public SpringBeanD(SpringBeanA springBeanA) {
    this.springBeanA = springBeanA;
  }

  public SpringBeanD(SpringBeanB springBeanB) {
    this.springBeanB = springBeanB;
  }

  @Override
  public String toString() {
    return "SpringBeanD{" +
        "springBeanA=" + springBeanA +
        ", springBeanB=" + springBeanB +
        ", springBeanC=" + sampleClassC +
        '}';
  }
}

package com.sample;

import com.sample.beans.SpringBean1;
import com.sample.beans.SpringBean2;
import com.sample.beans.SpringBean2A;
import com.sample.beans.SpringBean2B;
import com.sample.beans.SpringBean3;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean(initMethod = "initializeSomething")
  @Autowired
  public SpringBean3 springBean3(SpringBean1 springBean1, SpringBean2 springBean2) {
    return new SpringBean3(springBean1, springBean2);
  }

  @Bean(name = {"springBeanTwoB", "springBeanIIB"}, autowireCandidate = true)
  public SpringBean2 springBean2B() {
    return new SpringBean2B();
  }

  @Bean(name = {"springBeanTwoA", "springBeanIIA"}, autowireCandidate = false)
  @Autowired
  public SpringBean2 springBean2A(MessageDigest messageDigest) {
    return new SpringBean2A(messageDigest);
  }

  @Bean(destroyMethod = "destroySomethingHere")
  public SpringBean1 springBean1() {
    return new SpringBean1();
  }

  @Bean // Spring allows to integrate other library and manages the beans of other library as well
  public MessageDigest messageDigest() {
    return DigestUtils.getMd5Digest();
  }

}

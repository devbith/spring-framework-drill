package com.sample.beans;

import java.security.MessageDigest;

public class SpringBean2A implements SpringBean2 {

  private MessageDigest messageDigest;

  public SpringBean2A(MessageDigest messageDigest) {
    this.messageDigest = messageDigest;
  }

  @Override
  public void printHash() {
    System.out.println(getClass().getSimpleName() + ": "+this.messageDigest.digest());
  }
}

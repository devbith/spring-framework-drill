package com.sample.dto;

public class EmployeeName {

  private String firstName;
  private String lastName;

  public EmployeeName(String first_name, String lastName) {
    this.firstName = first_name;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "EmployeeName{" +
        "first_name='" + firstName + '\'' +
        ", last_name='" + lastName + '\'' +
        '}';
  }
}

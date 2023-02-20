package com.sample.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {

  @Value("Steve")
  String name;

  @Value("#{'Pink Street'.toUpperCase()}")
  String streetName;

  @Value("true")
  boolean accountExists;

  @Value("100")
  int idNumber;

  @Value("#{ 500 * 0.9 }")
  float accountBalance;

  @Value("#{${department.id}}")
  int departmentId;

  @Value("#{'${department.name}'.toUpperCase()}")
  String departmentName;

  @Value("${departments.names}")
  String[] departmentNames;

  @Value("#{${departments.unique.ids}}")
  Set<Integer> departmentIds;

  @Value("${departments.nonunique.names}")
  List<String> departmentNonUniqueNames;

  @Value("#{${department.id.name.map}}")
  Map<Integer, String> departmentIdName;

  @Override
  public String toString() {
    return "SpringBean1{" +
        "name='" + name + '\'' +
        ", streetName='" + streetName + '\'' +
        ", accountExists=" + accountExists +
        ", idNumber=" + idNumber +
        ", accountBalance=" + accountBalance +
        ", departmentId=" + departmentId +
        ", departmentName='" + departmentName + '\'' +
        ", departmentNames=" + Arrays.toString(departmentNames) +
        ", departmentIds=" + departmentIds +
        ", departmentNonUniqueNames=" + departmentNonUniqueNames +
        ", departmentIdName=" + departmentIdName +
        '}';
  }

}

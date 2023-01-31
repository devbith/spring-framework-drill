package com.sample.dao;

import com.sample.dto.Department;

public class DepartmentDao {

  public Department find(int id) {
    System.out.println("Searching for department..");
    return new Department();
   }

   public void save(Department department) {
     System.out.println("Save department...");
   }

}

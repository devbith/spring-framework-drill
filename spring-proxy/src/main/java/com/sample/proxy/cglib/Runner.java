package com.sample.proxy.cglib;

import com.sample.dao.DepartmentDao;
import com.sample.dto.Department;
import org.springframework.cglib.proxy.Enhancer;

public class Runner {

  public static void main(String[] args) {
    Enhancer enhancer = new Enhancer();
    enhancer.setCallback(new DepartmentDaoMethodInterceptor());
    enhancer.setSuperclass(DepartmentDao.class);
    DepartmentDao departmentDao = (DepartmentDao) enhancer.create();

    Department department = departmentDao.find(4);
    departmentDao.save(department);
  }

}

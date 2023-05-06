package com.sample.controller;

import com.sample.dao.EmployeeDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

  @Autowired
  private EmployeeDao employeeDao;

  @RequestMapping
  @ResponseBody
  public String index() {
    List<String> employeeEmails = employeeDao.findEmployeeEmails();
    return "Test "+employeeEmails;
  }
}

package com.zerodevi1.spring.cloud.handler;

import com.zerodevi1.spring.cloud.entity.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeHandler {
    @RequestMapping("/provider/get/employee")
    public Employee getEmployee(){
        return new Employee(10, "ZeroDevi1", 5000.0);
    }
}

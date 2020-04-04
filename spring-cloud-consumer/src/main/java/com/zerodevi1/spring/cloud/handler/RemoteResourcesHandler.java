package com.zerodevi1.spring.cloud.handler;

import com.zerodevi1.spring.cloud.api.EmployeeRometeService;
import com.zerodevi1.spring.cloud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteResourcesHandler {
    // 装配调用远程微服务的接口,后面和调用本地方法一样直接使用
    @Autowired
    EmployeeRometeService employeeRometeService;

    @RequestMapping("/feign/get/employee")
    public Employee get() {
        return employeeRometeService.getEmployee();
    }
}

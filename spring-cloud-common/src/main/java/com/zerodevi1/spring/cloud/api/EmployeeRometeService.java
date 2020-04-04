package com.zerodevi1.spring.cloud.api;

import com.zerodevi1.spring.cloud.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
// FeignClient注解表示当前接口和一个Provider对应,注解中value属性指定要调用的Provider的微服务名称
@FeignClient(name = "zerodevi1-provider")
@Component
public interface EmployeeRometeService {
    /**
     * 远程调用的接口方法
     * 要求@RequestMapping注解映射的地址一致
     * 要求方法声明一致
     * 用来获取请求参数的@RequestParam,@PathVariable,@RequestBody不能省略,两边一致
     * @return
     */
    @RequestMapping("/provider/get/employee")
    public Employee getEmployee();
}

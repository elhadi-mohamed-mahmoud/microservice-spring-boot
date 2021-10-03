package com.elhadi.cloudgetway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    public  String userServiceFallBackMethod(){
        return "User service not working";
    }

    @GetMapping("/departmentServiceFallBack")
    public  String departmentServiceFallBackMethod(){
        return "Department service not working";
    }
}

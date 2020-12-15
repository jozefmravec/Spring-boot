package com.appslab.springbootapp.model;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @RequestMapping("/hello")
    public @ResponseBody String greeting(){
        return "Hello";
    }


}

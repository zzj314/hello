package org.zhou;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zhouzj.entity.Student;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public String test(){
        Student student = new Student();
        student.getAge();
        return "test";
    }
}

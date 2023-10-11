package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    // build rest API to handle query parameters
    // http://localhost:8080/student/query?firstName=Ramesh&lastName=Fadatare
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
}

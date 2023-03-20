package com.example.Student;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
// Writing API
public class Info {

    HashMap<Integer, Students> map = new HashMap<>();
    @PostMapping("/studentAdd")
    public void studentAdd(@RequestBody Students Students){
        int key = Students.getRollno();
        map.put(key, Students);
    }

    @GetMapping("/getStudents")
    public Students getStudents(@RequestParam("rollno") Integer rollno){
        Students students = map.get(rollno);
        return students;
    }
}

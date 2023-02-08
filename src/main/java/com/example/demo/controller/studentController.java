package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.repository.studentRepo;
import com.example.demo.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private studentRepo repo;
    @Autowired
    private studentService service;

    @PostMapping("/newStudent")
    public String createStudent(@RequestBody Student student){
        return this.service.createStudent(student);
    }

    @GetMapping("/findAll")
    public List<Student> findAllStudents(){
        return this.service.getStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return this.service.deleteStudent(id);
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student){
        return this.service.updateStudent(student);
    }



}

package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    private studentRepo repo;

    public String createStudent(Student student){
        if(this.repo.existsById(student.getId())){
            return "Student exists";
        }
        else{
            this.repo.save(student);
            return  "Student created successfully";
        }
    }

    public List<Student> getStudents(){
        return this.repo.findAll();
    }

    public String deleteStudent(int id){
        if(this.repo.existsById(id)){
            this.repo.deleteById(id);
            return "Student deleted successfully";
        }
        else {
            return "Student doesn't exist";
        }
    }

    public String updateStudent(Student student){
        if(this.repo.existsById(student.getId())){
            this.repo.save(student);
            return  "Updated Successfully";
        }
        else {
            return "Student doesn't exist";
        }
    }
}

package com.example.demo.repository;

import com.example.demo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentRepo extends MongoRepository<Student, Integer> {

}

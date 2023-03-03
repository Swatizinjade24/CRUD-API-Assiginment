package com.springbootproject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.entity.Student;
import com.springbootproject.repository.StudentRepository;

@RestController
public class StudentController {
	 @Autowired
     StudentRepository sr;
     
     @PostMapping("/savestudent")
     public String saveBike(@RequestBody Student s) {
    	 sr.save(s);
    	 return "Save Successfully";
     }
     
     @GetMapping("/displaystudent")
     public Student displayStudent(@RequestParam int id) {
    	 Optional<Student> s = sr.findById(id);
    	 return s.get();
     }
     
     @GetMapping("/displayallstudent")
     public List<Student> displayAllStudnet(){
    	 return sr.findAll();
     }
     
     @PutMapping("/updatestudent")
     public String updateStudent(@RequestBody Student s) {
    	 sr.save(s);
    	 return "Update Successfully";
     }
     
     @DeleteMapping("/deletestudent")
     public String deleteStudent(@RequestParam int id) {
    	 sr.deleteById(id);
    	 return "Delete Successfully";
     }
     
     @DeleteMapping("/deleteallstudent")
     public String deleteAllStudent(){
    	  sr.deleteAll();
    	  return "Delete All Successfully";
     }

}

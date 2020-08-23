package com.example.first.Controller;

import com.example.first.model.Student;
import com.example.first.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){

        repo.save(student);
        return student;
    }

    @RequestMapping("Student")
    public String addStudents(Student student){

        repo.save(student);
        return "home";
    }

    @GetMapping("/students")
    @ResponseBody
    public List<Student> getStudents(){

        return repo.findAll();

    }

    @RequestMapping("/students/{id}")
    @ResponseBody
    public Optional<Student> getStudents(@PathVariable("id") int id){

       return repo.findById(id);

    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        Student s= repo.getOne(id);
        repo.delete(s);
        return "deleted";
    }

    @PutMapping(path="/student")
    public Student saveOrUpdateStudent(@RequestBody Student student){

        repo.save(student);
        return student;
    }
}
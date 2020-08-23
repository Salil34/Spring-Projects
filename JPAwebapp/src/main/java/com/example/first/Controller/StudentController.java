package com.example.first.Controller;

import com.example.first.model.Student;
import com.example.first.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){

        repo.save(student);
        return "home";
    }

    @RequestMapping("/getStudent")
    public ModelAndView getStudent(@RequestParam int id){
        ModelAndView mv= new ModelAndView("show");
        Optional<Student> student = repo.findById(id);
        mv.addObject(student);
        //repo.save(student);
        return mv;
    }
}
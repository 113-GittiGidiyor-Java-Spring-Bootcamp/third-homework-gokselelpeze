package goksel.elpeze.h2db.controller;

import goksel.elpeze.h2db.entity.Student;
import goksel.elpeze.h2db.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository repository;



    @PostMapping("/addstudent")
    public String addStudent(@Valid Student student, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "addstudent";
        }

        repository.save(student);
        return "redirect:/addstudent";
    }

    @GetMapping("/editstudent/{id}")
    public String showUpdatePage(@PathVariable int id, Model theModel){
        Student student = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid student id: " + id));
        theModel.addAttribute("student",student);
        return "updatestudent";
    }

    @PostMapping("/updatestudent/{id}")
    public String updateStudent(@PathVariable int id, @Valid Student student,  BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "updatestudent";
        }

        repository.save(student);
        return "redirect:/addstudent";
    }

    @GetMapping("/deletestudent/{id}")
    public String deleteStudent(@PathVariable int id){
        Student student = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student : " + id));
        repository.delete(student);

        return "redirect:/addstudent";
    }

}

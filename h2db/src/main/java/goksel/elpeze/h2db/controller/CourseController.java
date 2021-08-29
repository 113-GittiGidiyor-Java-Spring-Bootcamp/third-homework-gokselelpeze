package goksel.elpeze.h2db.controller;

import goksel.elpeze.h2db.entity.Course;
import goksel.elpeze.h2db.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
public class CourseController {

    private final CourseRepository repository;


    @PostMapping("/addcourse")
    public String addUser(@Valid Course course, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "addcourse";
        }

        repository.save(course);
        return "redirect:/addcourse";
    }

    @GetMapping("/editcourse/{id}")
    public String showUpdatePage(@PathVariable int id, Model theModel){
        Course course = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid course id: " + id));
        theModel.addAttribute("course",course);
        return "updatecourse";
    }

    @PostMapping("/updatecourse/{id}")
    public String updateCourse(@PathVariable int id, @Valid Course course,  BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "updatecourse";
        }

        repository.save(course);
        return "redirect:/addcourse";
    }

    @GetMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable int id){
        Course course = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid course : " + id));
        repository.delete(course);

        return "redirect:/addcourse";
    }

}

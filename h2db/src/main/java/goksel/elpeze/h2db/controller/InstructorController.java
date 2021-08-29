package goksel.elpeze.h2db.controller;

import goksel.elpeze.h2db.entity.Instructor;
import goksel.elpeze.h2db.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequiredArgsConstructor
public class InstructorController {

    private final InstructorRepository repository;


    @PostMapping("/addinstructor")
    public String addUser(@Valid Instructor instructor, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "addinstructor";
        }

        repository.save(instructor);
        return "redirect:/addinstructor";
    }

    @GetMapping("/editinstructor/{id}")
    public String showUpdatePage(@PathVariable int id, Model theModel){
        Instructor instructor = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid instructor id: " + id));
        theModel.addAttribute("instructor",instructor);
        return "updateinstructor";
    }

    @PostMapping("/updateinstructor/{id}")
    public String updateInstructor(@PathVariable int id, @Valid Instructor instructor,  BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "updateinstructor";
        }

        repository.save(instructor);
        return "redirect:/addinstructor";
    }

    @GetMapping("/deleteinstructor/{id}")
    public String deleteInstructor(@PathVariable int id){
        Instructor instructor = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid instructor : " + id));
        repository.delete(instructor);

        return "redirect:/addinstructor";
    }

}

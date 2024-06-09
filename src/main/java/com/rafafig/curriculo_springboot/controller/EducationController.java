package com.rafafig.curriculo_springboot.controller;

import com.rafafig.curriculo_springboot.model.Education;
import com.rafafig.curriculo_springboot.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/educations")
public class EducationController {
    @Autowired
    private EducationService educationService;

    @GetMapping
    public List<Education> listEducation(){
        return this.educationService.findAll();
    }

    @PostMapping
    public Education createEducation(@RequestBody Education education){
        return this.educationService.save(education);
    }

    @PutMapping("/{id}")
    public Education updateEducation(@PathVariable Long id, @RequestBody Education education){
        return this.educationService.update(id, education);
    }

    @DeleteMapping("/{id}")
    public void removeEducation(@PathVariable Long id){
        this.educationService.delete(id);
    }
}

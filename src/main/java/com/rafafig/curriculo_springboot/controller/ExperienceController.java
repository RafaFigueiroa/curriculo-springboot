package com.rafafig.curriculo_springboot.controller;

import com.rafafig.curriculo_springboot.model.Experience;
import com.rafafig.curriculo_springboot.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")
public class ExperienceController {
    @Autowired
    private ExperienceService experienceService;

    @GetMapping
    public List<Experience> listExperiences(){
        return this.experienceService.findAll();
    }

    @PostMapping
    public Experience createExperience(@RequestBody Experience experience){
        return this.experienceService.save(experience);
    }

    @PutMapping("/{id}")
    public Experience updateExperience(@PathVariable Long id, @RequestBody Experience experience){
        return this.experienceService.update(id, experience);
    }

    @DeleteMapping("/{id}")
    public void removeExperience(@PathVariable Long id){
        this.experienceService.delete(id);
    }
}

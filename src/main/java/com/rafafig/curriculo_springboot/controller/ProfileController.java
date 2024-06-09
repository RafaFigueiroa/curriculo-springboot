package com.rafafig.curriculo_springboot.controller;

import com.rafafig.curriculo_springboot.model.Profile;
import com.rafafig.curriculo_springboot.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @GetMapping
    public List<Profile> listProfiles(){
        return this.profileService.findAll();
    }

    @PostMapping
    public Profile createProfile(@RequestBody Profile profile){
        return this.profileService.save(profile);
    }

    @PutMapping("/{id}")
    public Profile updateProfile(@PathVariable Long id, @RequestBody Profile profile){
        return this.profileService.update(id, profile);
    }

    @DeleteMapping("/{id}")
    public void removeProfile(@PathVariable Long id){
        this.profileService.delete(id);
    }
}

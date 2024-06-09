package com.rafafig.curriculo_springboot.service;

import com.rafafig.curriculo_springboot.model.Profile;
import com.rafafig.curriculo_springboot.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public List<Profile> findAll(){
        return this.profileRepository.findAll();
    }

    public Optional<Profile> findById(Long id){
        return this.profileRepository.findById(id);
    }

    public Profile save(Profile profile){
        return this.profileRepository.save(profile);
    }

    public Profile update(Long id, Profile profile){
        Optional<Profile> profileToUpdate = this.profileRepository.findById(id);

        if(profileToUpdate.isPresent()){
            Profile existingProfile = profileToUpdate.get();

            existingProfile.setName(profile.getName());
            existingProfile.setLastName(profile.getLastName());
            existingProfile.setTitle(profile.getTitle());
            existingProfile.setAbout(profile.getAbout());
            existingProfile.setNumber(profile.getNumber());
            existingProfile.setLocation(profile.getLocation());
            existingProfile.setEmail(profile.getEmail());
            existingProfile.setGithub(profile.getGithub());
            existingProfile.setLinkedin(profile.getLinkedin());

            return this.profileRepository.save(existingProfile);
        }
        else{
            throw new RuntimeException("Perfil não encontrado");
        }
    }

    public void delete(Long id){
        this.profileRepository.deleteById(id);
    }
}

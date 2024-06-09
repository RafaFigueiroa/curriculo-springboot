package com.rafafig.curriculo_springboot.service;

import com.rafafig.curriculo_springboot.model.Experience;
import com.rafafig.curriculo_springboot.repository.ExperienceRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ExperienceService {
    @Autowired
    private ExperienceRepositoy experienceRepository;

    public List<Experience> findAll(){
        return this.experienceRepository.findAll();
    }

    public Experience save(Experience experience){
        return this.experienceRepository.save(experience);
    }

    public Experience update(Long id, Experience experience){
        Optional<Experience> experienceToUpdate = this.experienceRepository.findById(id);

        if(experienceToUpdate.isPresent()){
            Experience existingExperience = experienceToUpdate.get();

            existingExperience.setPosition(experience.getPosition());
            existingExperience.setCompany(experience.getCompany());
            existingExperience.setEmploymentType(experience.getEmploymentType());
            existingExperience.setLocation(experience.getLocation());
            existingExperience.setModality(experience.getModality());
            existingExperience.setStartDate(experience.getStartDate());
            existingExperience.setEndDate(experience.getEndDate());

            return this.experienceRepository.save(existingExperience);
        }
        else{
            throw new RuntimeException("Experiência não encontrada");
        }
    }

    public void delete(Long id){
        this.experienceRepository.deleteById(id);
    }
}

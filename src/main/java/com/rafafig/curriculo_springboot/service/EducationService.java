package com.rafafig.curriculo_springboot.service;

import com.rafafig.curriculo_springboot.model.Education;
import com.rafafig.curriculo_springboot.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EducationService {
    @Autowired
    private EducationRepository educationRepository;

    public List<Education> findAll(){
        return this.educationRepository.findAll();
    }

    public Education save(Education education){
        return this.educationRepository.save(education);
    }

    public Education update(Long id, Education education){
        Optional<Education> educationToUpdate = this.educationRepository.findById(id);

        if(educationToUpdate.isPresent()){
            Education existingEducation = educationToUpdate.get();

            existingEducation.setSchool(education.getSchool());
            existingEducation.setDegree(education.getDegree());
            existingEducation.setCourse(education.getCourse());
            existingEducation.setStartDate(education.getStartDate());
            existingEducation.setEndDate(education.getEndDate());

            return this.educationRepository.save(existingEducation);
        }
        else{
            throw new RuntimeException("Formação não encontrada");
        }
    }

    public void delete(Long id){
        this.educationRepository.deleteById(id);
    }
}

package com.rafafig.curriculo_springboot.service;

import com.rafafig.curriculo_springboot.model.Certification;
import com.rafafig.curriculo_springboot.repository.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CertificationService {
    @Autowired
    private CertificationRepository certificationRepository;

    public List<Certification> findAll(){
        return this.certificationRepository.findAll();
    }

    public Certification save(Certification certification){
        return this.certificationRepository.save(certification);
    }

    public Certification update(Long id, Certification certification){
        Optional<Certification> certificationToUpdate = this.certificationRepository.findById(id);

        if(certificationToUpdate.isPresent()){
            Certification existingCertification = certificationToUpdate.get();

            existingCertification.setName(certification.getName());
            existingCertification.setIssuingOrganization(certification.getIssuingOrganization());
            existingCertification.setIssueDate(certification.getIssueDate());

            return this.certificationRepository.save(existingCertification);
        }
        else{
            throw new RuntimeException("Certificação não encontrada");
        }
    }

    public void delete(Long id){
        this.certificationRepository.deleteById(id);
    }
}

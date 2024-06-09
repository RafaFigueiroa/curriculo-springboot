package com.rafafig.curriculo_springboot.controller;

import com.rafafig.curriculo_springboot.model.Certification;
import com.rafafig.curriculo_springboot.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certifications")
public class CertificationController {
    @Autowired
    private CertificationService certificationService;

    @GetMapping
    public List<Certification> listCertification(){
        return this.certificationService.findAll();
    }

    @PostMapping
    public Certification createCertification(@RequestBody Certification certification){
        return this.certificationService.save(certification);
    }

    @PutMapping("/{id}")
    public Certification updateCertification(@PathVariable Long id, @RequestBody Certification certification){
        return this.certificationService.update(id, certification);
    }

    @DeleteMapping("/{id}")
    public void removeCertification(@PathVariable Long id){
        this.certificationService.delete(id);
    }
}

package com.rafafig.curriculo_springboot.repository;

import com.rafafig.curriculo_springboot.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificationRepository extends JpaRepository<Certification, Long> {
}

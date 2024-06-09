package com.rafafig.curriculo_springboot.repository;

import com.rafafig.curriculo_springboot.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}

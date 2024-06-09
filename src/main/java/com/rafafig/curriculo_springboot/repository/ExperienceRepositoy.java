package com.rafafig.curriculo_springboot.repository;

import com.rafafig.curriculo_springboot.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepositoy extends JpaRepository<Experience, Long> {
}

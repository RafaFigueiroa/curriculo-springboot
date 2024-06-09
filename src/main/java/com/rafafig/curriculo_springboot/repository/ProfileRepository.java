package com.rafafig.curriculo_springboot.repository;

import com.rafafig.curriculo_springboot.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}

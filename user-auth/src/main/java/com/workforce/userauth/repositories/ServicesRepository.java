package com.workforce.userauth.repositories;

import com.workforce.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicesRepository extends JpaRepository<Service, Long> {
}

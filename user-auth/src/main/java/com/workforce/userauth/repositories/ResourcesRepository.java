package com.workforce.userauth.repositories;

import com.workforce.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourcesRepository extends JpaRepository<Resource, Long> {
}

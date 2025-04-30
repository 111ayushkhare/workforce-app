package com.workforce.userauth.repositories;

import com.workforce.models.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionsRepository extends JpaRepository<Permission, Long> {
}

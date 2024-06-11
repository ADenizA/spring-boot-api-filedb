package com.etstur.spring.boot.db.repository;

import com.etstur.spring.boot.db.model.ERole;
import com.etstur.spring.boot.db.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
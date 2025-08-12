package com.greenleaf.greenleaf.repository;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenleaf.greenleaf.models.role;

public interface RoleRepository extends JpaRepository<role, Long> {
	  Optional<Role> findByName(String name);
	}

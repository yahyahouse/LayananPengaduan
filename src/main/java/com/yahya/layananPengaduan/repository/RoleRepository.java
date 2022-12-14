package com.yahya.layananPengaduan.repository;


import com.yahya.layananPengaduan.model.ERole;
import com.yahya.layananPengaduan.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Integer> {

    Optional<Roles> findByName (ERole roleName);
}


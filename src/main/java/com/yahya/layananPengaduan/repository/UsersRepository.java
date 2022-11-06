package com.yahya.layananPengaduan.repository;

import com.yahya.layananPengaduan.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByUserId(Integer userId);

    public Users findByEmail(String email);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);

    Users findUsersByEmail(String email);
    Users findByUsername(String username);
}

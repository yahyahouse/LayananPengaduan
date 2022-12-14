package com.yahya.layananPengaduan.repository;

import com.yahya.layananPengaduan.model.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UsersRepository extends JpaRepository<Users, Integer> {
    @Modifying
    @Query(value = "update users set password=:password where user_id=:user_id", nativeQuery = true)
    void updatePassword(
            @Param("password") String password,
            @Param("user_id") Integer userId
    );
    Users findByUserId(Integer userId);

    public Users findByEmail(String email);
    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);

    Users findUsersByEmail(String email);
    Users findByUsername(String username);
}

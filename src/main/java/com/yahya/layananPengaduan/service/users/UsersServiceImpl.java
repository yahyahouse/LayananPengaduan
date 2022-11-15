package com.yahya.layananPengaduan.service.users;

import com.yahya.layananPengaduan.model.users.Users;
import com.yahya.layananPengaduan.repository.UsersRepository;
import com.yahya.layananPengaduan.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Users findByUserId(Integer userId) {

        return usersRepository.findByUserId(userId);
    }

    @Override
    public Users findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    @Override
    public void updateUsersPassword(String password, Integer userId) {
        usersRepository.updatePassword(passwordEncoder.encode(password), userId);
    }
}

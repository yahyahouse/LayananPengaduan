package com.yahya.layananPengaduan.service.users;

import com.yahya.layananPengaduan.model.users.Users;
import com.yahya.layananPengaduan.repository.UsersRepository;
import com.yahya.layananPengaduan.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public Users findByUserId(Integer userId) {

        return usersRepository.findByUserId(userId);
    }
}

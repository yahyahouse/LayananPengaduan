package com.yahya.layananPengaduan.service.users;

import com.yahya.layananPengaduan.model.users.Users;
import org.springframework.stereotype.Service;

@Service
public interface  UsersService {

    Users findByUserId (Integer userId);
}

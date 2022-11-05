package com.yahya.layananPengaduan.service;

import com.yahya.layananPengaduan.model.Users;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public interface  UsersService {

    Users findByUserId (Integer userId);
}

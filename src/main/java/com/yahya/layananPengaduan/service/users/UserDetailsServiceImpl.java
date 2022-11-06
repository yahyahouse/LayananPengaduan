package com.yahya.layananPengaduan.service.users;


import com.yahya.layananPengaduan.model.users.UserDetailsImpl;
import com.yahya.layananPengaduan.model.users.Users;
import com.yahya.layananPengaduan.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersRepository.findByUsername(username);
        return UserDetailsImpl.build(user);
    }
}

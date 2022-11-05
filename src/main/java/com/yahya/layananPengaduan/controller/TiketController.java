package com.yahya.layananPengaduan.controller;

import com.yahya.layananPengaduan.dto.TiketResponse;
import com.yahya.layananPengaduan.model.Tiket;
import com.yahya.layananPengaduan.model.Users;
import com.yahya.layananPengaduan.service.TiketService;
import com.yahya.layananPengaduan.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tiket")
public class TiketController {

    @Autowired
    private TiketService tiketService;

    @Autowired
    private UsersService usersService;

    @PostMapping("/addTiket")
    public ResponseEntity<TiketResponse> addTiket(
            @PathVariable("user_id") Integer userId,
            @PathVariable("judul_permasalahan") String judulPermasalahan,
            @PathVariable("deskripsi") String deskripsi){

        Tiket tiket = new Tiket();
        Users users = usersService.findByUserId(userId);
        tiket.setUserId(users);
        tiket.setJudulPermasalahan(judulPermasalahan);
        tiket.setDeskripsi(deskripsi);
        tiketService.saveTiket(tiket);

        return null;
    }
}

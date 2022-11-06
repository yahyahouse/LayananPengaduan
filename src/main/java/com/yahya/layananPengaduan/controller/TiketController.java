package com.yahya.layananPengaduan.controller;

import com.yahya.layananPengaduan.dto.TiketResponse;
import com.yahya.layananPengaduan.model.tiket.Tiket;
import com.yahya.layananPengaduan.model.users.Users;
import com.yahya.layananPengaduan.service.tiket.TiketService;
import com.yahya.layananPengaduan.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tiket")
public class TiketController {

    @Autowired
    private TiketService tiketService;

    @Autowired
    private UsersService usersService;

    @PostMapping("/addTiket")
    public ResponseEntity<TiketResponse> addTiket(
            @RequestParam("user_id") Users userId,
            @RequestParam("judul_permasalahan") String judulPermasalahan,
            @RequestParam("deskripsi") String deskripsi){
        Tiket tiket = new Tiket();
        tiket.setUserId(userId);
        tiket.setJudulPermasalahan(judulPermasalahan);
        tiket.setDeskripsi(deskripsi);
        tiketService.saveTiket(tiket);

        return new ResponseEntity(new TiketResponse(tiket), HttpStatus.OK);
    }
}

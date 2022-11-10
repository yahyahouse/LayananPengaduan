package com.yahya.layananPengaduan.controller;

import com.yahya.layananPengaduan.dto.TiketAddResponse;
import com.yahya.layananPengaduan.dto.TiketGetResponse;
import com.yahya.layananPengaduan.model.Status;
import com.yahya.layananPengaduan.model.tiket.Tiket;
import com.yahya.layananPengaduan.model.users.Users;
import com.yahya.layananPengaduan.service.tiket.TiketService;
import com.yahya.layananPengaduan.service.users.UsersService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

import static com.yahya.layananPengaduan.model.Info.UPDATE_STATUS_TIKET;

@Tag(name = "Tiket")
@RestController
@RequestMapping("/tiket")
public class TiketController {

    EntityManager entityManager;

    @Autowired
    private TiketService tiketService;

    @Autowired
    private UsersService usersService;

    @PostMapping("/user/addTiket")
    public ResponseEntity<TiketAddResponse> addTiket(
            @RequestParam("user_id") Integer userId,
            @RequestParam("judul_permasalahan") String judulPermasalahan,
            @RequestParam("deskripsi") String deskripsi
    ){
        Tiket tiket = new Tiket();
        Users users = usersService.findByUserId(userId);
        tiket.setUserId(users);
        tiket.setJudulPermasalahan(judulPermasalahan);
        tiket.setDeskripsi(deskripsi);
        tiket.setStatus(Status.ONPROCESS);
        tiketService.saveTiket(tiket);
        tiket.getTiketId();

        return new ResponseEntity(new TiketAddResponse(tiket), HttpStatus.OK);
    }

    @GetMapping("/user/get-tiket/{userId}")
    public ResponseEntity<TiketGetResponse> getTiketByUserId(
            @PathVariable("userId") Integer userId){
        List<Tiket> tiket = tiketService.getTiketByUserId(userId);
        List<TiketGetResponse> tiketGetResponse =
                tiket.stream().map(TiketGetResponse::new).collect(Collectors.toList());

        return new ResponseEntity(tiketGetResponse,HttpStatus.OK);
    }

    @PostMapping("/admin/update-tiket-status/{tiketId}")
    public ResponseEntity<TiketGetResponse> updateStatusTiket(
            @PathVariable("tiketId") Integer tiketId
    ){
        Tiket tiket = tiketService.getTiketByTiketId(tiketId);
        tiket.setStatus(Status.DONE);
        tiketService.updateStatusTiket(tiket);
        return new ResponseEntity(new TiketGetResponse(tiket),HttpStatus.OK);
    }
}

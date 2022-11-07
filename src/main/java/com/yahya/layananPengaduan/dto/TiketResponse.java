package com.yahya.layananPengaduan.dto;

import com.yahya.layananPengaduan.model.tiket.Tiket;
import lombok.Data;

@Data
public class TiketResponse {

    private Integer tiketId;
    private Integer userId;
    private String judulPermasalahan;
    private String deskripsi;
    private String kodeTiket;

    public TiketResponse(Tiket tiket) {
        this.userId = tiket.getUserId().getUserId();
        this.judulPermasalahan = tiket.getJudulPermasalahan();
        this.deskripsi = tiket.getDeskripsi();
        this.kodeTiket = tiket.getKodeTiket();
    }
}

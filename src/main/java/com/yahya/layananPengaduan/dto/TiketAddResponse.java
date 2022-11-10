package com.yahya.layananPengaduan.dto;

import com.yahya.layananPengaduan.model.Status;
import com.yahya.layananPengaduan.model.tiket.Tiket;
import lombok.Data;

@Data
public class TiketAddResponse {

    private Integer tiketId;
    private Integer userId;
    private String judulPermasalahan;
    private String deskripsi;
    private String kodeTiket;
    private Status status;

    public TiketAddResponse(Tiket tiket) {
        this.tiketId = tiket.getTiketId();
        this.userId = tiket.getUserId().getUserId();
        this.judulPermasalahan = tiket.getJudulPermasalahan();
        this.deskripsi = tiket.getDeskripsi();
        this.kodeTiket = tiket.getKodeTiket();
        this.status = tiket.getStatus();
    }
}

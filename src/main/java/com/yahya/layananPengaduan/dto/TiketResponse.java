package com.yahya.layananPengaduan.dto;

import com.yahya.layananPengaduan.model.Tiket;
import lombok.Data;

@Data
public class TiketResponse {

    private Integer tiketId;
    private Integer userId;
    private String judulPermasalahan;
    private String deskripsi;

}

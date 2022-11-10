package com.yahya.layananPengaduan.dto;

import com.yahya.layananPengaduan.model.tiket.Tiket;
import lombok.Data;

@Data
public class TiketUpdateStatusResponse {
    private Integer tiketId;
    private String status;

    public TiketUpdateStatusResponse(Tiket tiket) {
        this.tiketId = tiket.getTiketId();
        this.status = tiket.getStatus().toString();
    }
}

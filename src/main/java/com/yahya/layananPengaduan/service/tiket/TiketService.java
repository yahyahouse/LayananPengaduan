package com.yahya.layananPengaduan.service.tiket;

import com.yahya.layananPengaduan.model.tiket.Tiket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TiketService {

    void saveTiket(Tiket tiket);
    List<Tiket> getTiketByTiketId (Integer tiketId);
}

package com.yahya.layananPengaduan.service.tiket;

import com.yahya.layananPengaduan.model.Status;
import com.yahya.layananPengaduan.model.tiket.Tiket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TiketService {

    void saveTiket(Tiket tiket);
    List<Tiket> getTiketByUserId (Integer userId);

    void updateStatusTiket (Tiket tiket);
    Tiket getTiketByTiketId (Integer tiketId);

}

package com.yahya.layananPengaduan.service.tiket;

import com.yahya.layananPengaduan.model.tiket.Tiket;
import com.yahya.layananPengaduan.repository.TiketRepository;
import com.yahya.layananPengaduan.repository.UsersRepository;
import com.yahya.layananPengaduan.service.tiket.TiketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class TiketServiceImpl implements TiketService {
    EntityManager entityManager;

    @Autowired
    private TiketRepository tiketRepository;

    @Autowired
    private UsersRepository usersRepository;


    public TiketServiceImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void saveTiket(Tiket tiket) {
        tiketRepository.save(tiket);

    }

    @Override
    public List<Tiket> getTiketByTiketId(Integer tiketId) {
        return tiketRepository.getTiketByTiketId(tiketId);
    }
}

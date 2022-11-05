package com.yahya.layananPengaduan.repository;

import com.yahya.layananPengaduan.model.Tiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TiketRepository extends JpaRepository<Tiket,Integer> {


    @Query(value = "select * from tiket where tiket_id =:tiket_id", nativeQuery = true)
    List<Tiket> getTiketByTiketId(@Param("tiket_id") Integer tiketId);
}

package com.yahya.layananPengaduan.repository;

import com.yahya.layananPengaduan.model.Status;
import com.yahya.layananPengaduan.model.tiket.Tiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TiketRepository extends JpaRepository<Tiket,Integer> {


    @Query(value = "SELECT * FROM tiket t WHERE t.user_id =:userId", nativeQuery = true)
    List<Tiket> getTiketByUserId (Integer userId);

    @Modifying
    @Query(value = "UPDATE tiket SET status=?1 WHERE tiket_id=:?2", nativeQuery = true )
    void updateStatusTiket (Status status, Integer tiketId);

    @Query(value = "SELECT * FROM tiket WHERE tiket_id=:tiketId",nativeQuery = true)
    Tiket getTiketByTiketId (Integer tiketId);
}

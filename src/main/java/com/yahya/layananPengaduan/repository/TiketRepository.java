package com.yahya.layananPengaduan.repository;

import com.yahya.layananPengaduan.model.tiket.Tiket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TiketRepository extends JpaRepository<Tiket,Integer> {


    @Query(value = "select * from tiket t where t.user_id =:userId", nativeQuery = true)
    List<Tiket> getTiketByUserId (Integer userId);
}

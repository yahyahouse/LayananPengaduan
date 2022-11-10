package com.yahya.layananPengaduan.model.tiket;

import com.yahya.layananPengaduan.model.ERole;
import com.yahya.layananPengaduan.model.Status;
import com.yahya.layananPengaduan.model.users.Users;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tiket")
public class Tiket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tiket_id",nullable = false)
    private Integer tiketId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Column(name = "judul_permasalahan")
    private String judulPermasalahan;

    @Column (name = "deskripsi")
    private String deskripsi;

    @Column(name = "kode_tiket")
    private String kodeTiket;

    @Enumerated(EnumType.STRING)
    @Column
    private Status status;
}

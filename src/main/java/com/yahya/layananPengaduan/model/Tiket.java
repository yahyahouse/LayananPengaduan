package com.yahya.layananPengaduan.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "tiket")
public class Tiket {

    @Id
    @GeneratedValue
    @Column(name = "tket_id")
    private Integer tiketId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Column(name = "judul_permasalahan")
    private String judulPermasalahan;

    @Column (name = "deskripsi")
    private String deskripsi;


}

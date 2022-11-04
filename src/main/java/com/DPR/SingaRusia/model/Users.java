package com.DPR.SingaRusia.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Entity(name = "users")
public class Users {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Integer userId;

    @Column (name = "nama_lengakap")
    private String namaLengakap;

    @Column (name = "username")
    private String username;

    @Column (name = "email")
    private String email;

    @Column (name = "password")
    private String password;

    @Column (name = "alamat")
    private String alamat;

    @Column(name = "phone")
    private String phone;
}

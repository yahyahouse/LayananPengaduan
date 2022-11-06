package com.yahya.layananPengaduan.model.users;

import com.yahya.layananPengaduan.model.Roles;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Roles> roles = new HashSet<>();

    public Users(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Users() {

    }
}

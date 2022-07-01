package com.investree.demo.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Username must not be null")
    @Column(name = "username", length = 100)
    private String username;

    @NotEmpty(message = "Password must not be null")
    @Column(name = "password", length = 100)
    private String password;

    private boolean is_active;

    // Constructor

    public User() {
    }

    public User(Long id, @NotEmpty(message = "Username must not be null") String username,
            @NotEmpty(message = "Password must not be null") String password, boolean is_active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.is_active = is_active;
    }

    // Setter Getter

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

}

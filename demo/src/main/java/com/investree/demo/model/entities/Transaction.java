package com.investree.demo.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "transaksi")
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tenor;

    private Double total_pinjaman;

    private Double bunga_persen;

    @NotEmpty(message = "Status must not be null")
    @Column(name = "status", length = 100)
    private String status;

    @ManyToOne
    private User user;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTenor() {
        return tenor;
    }

    public void setTenor(Integer tenor) {
        this.tenor = tenor;
    }

    public Double getTotal_pinjaman() {
        return total_pinjaman;
    }

    public void setTotal_pinjaman(Double total_pinjaman) {
        this.total_pinjaman = total_pinjaman;
    }

    public Double getBunga_persen() {
        return bunga_persen;
    }

    public void setBunga_persen(Double bunga_persen) {
        this.bunga_persen = bunga_persen;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

package com.investree.demo.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "payment_history")
public class PaymentHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer pembayaran_ke;

    private Double jumlah;

    private String bukti_pembayaran;

    @OneToMany
    private List<Transaction> transaction;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPembayaran_ke() {
        return pembayaran_ke;
    }

    public void setPembayaran_ke(Integer pembayaran_ke) {
        this.pembayaran_ke = pembayaran_ke;
    }

    public Double getJumlah() {
        return jumlah;
    }

    public void setJumlah(Double jumlah) {
        this.jumlah = jumlah;
    }

    public String getBukti_pembayaran() {
        return bukti_pembayaran;
    }

    public void setBukti_pembayaran(String bukti_pembayaran) {
        this.bukti_pembayaran = bukti_pembayaran;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

}

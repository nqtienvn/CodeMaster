package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "UserVouchers")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserVoucher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "voucherID", nullable = false)
    private Voucher voucher;
    @Column(name = "IsUsed")
    private Boolean isUsed;
    @Column(name = "UsedDate")
    private LocalDate usedDate;
}

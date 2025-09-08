package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "VoucherCourses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VoucherCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "voucherID")
    private Voucher voucher;
    @ManyToOne
    @JoinColumn(name = "CourseID")
    private Course course;
}

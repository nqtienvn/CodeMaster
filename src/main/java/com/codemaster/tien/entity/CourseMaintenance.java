package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "CourseMaintenance")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CourseMaintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaintenanceID")
    private Long maintenanceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CourseID")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FeeID")
    private Fee fee;

    @Column(name = "MonthYear")
    private LocalDate monthYear;
    
    @Column(name = "EnrollmentCount")
    private Long enrollmentCount;
    
    @Column(name = "Status")
    private String status;

    @Column(name = "RefCode")
    private String refCode;

    @Column(name = "Description")
    private String description;

    @Column(name = "DueDate")
    private LocalDate dueDate;
    
    @Column(name = "SentAt")
    private LocalDateTime sentAt;
}

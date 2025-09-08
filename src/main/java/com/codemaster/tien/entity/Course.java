package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Courses")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseID")
    private Long courseId;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description", columnDefinition = "nvarchar(max)")
    private String description;

    @Column(name = "Price")
    private Double price;

    @Column(name = "Discount")
    private Double discount;

    @Column(name = "CourseImg")
    private String courseImg;

    @Column(name = "CourseLevel")
    private String courseLevel; // beginner, intermediate, advanced

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "Status")
    private String status; // =draft

    @Column(name = "CanResubmit")
    private Boolean canResubmit;

    @Column(name = "VideoUrlPreview", columnDefinition = "nvarchar(max)")
    private String videoUrlPreview;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "InstructorID")
    private User instructor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CategoryID")
    private Category category;

    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Chapter> listOfChapters;

    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Enrollment> enrollments;

    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<CourseReview> courseReviews;

    @OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
    private List<VoucherCourse> voucherCourses;

    @Column(name = "PreviousStatus")
    private String previousStatus;

    @OneToMany(mappedBy = "course", cascade = CascadeType.REMOVE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Certificate> certificates;

}

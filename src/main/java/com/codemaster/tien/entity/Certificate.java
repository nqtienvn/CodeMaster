package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Certificate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Certificate {
    /*
     * [Id] BIGINT IDENTITY(1,1) NOT NULL,
     * [UserID] BIGINT NOT NULL,
     * [CourseID] BIGINT NOT NULL,
     * [IssueDate] DATE NULL,
     * [CertificateCode] NVARCHAR(255) NULL,
     * [FileUrl] NVARCHAR(500) NULL,
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UserID")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    // Không cho phép null
    @JoinColumn(name = "CourseID", nullable = false)
    private Course course;

    @Column(name = "IssueDate", columnDefinition = "date", nullable = false)
    private Date issueDate;

    @Column(name = "CertificateCode", columnDefinition = "nvarchar(255)", nullable = false)
    private String certificateCode;

    @Column(name = "FileUrl", columnDefinition = "nvarchar(500)", nullable = false)
    private String fileUrl;

}

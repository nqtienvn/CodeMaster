package com.codemaster.tien.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Notifications")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NotificationID")
    private Long notificationId;

    @Column(name = "Message", columnDefinition = "nvarchar(max)")
    private String message;

    @Column(name = "SentAt")
    private LocalDateTime sentAt;

    @Column(name = "Type")
    private String type;

    @Column(name = "Status")
    private String status;

    @Column(name = "CommentID")
    private Long commentId;

    @Column(name = "EvidenceLink", nullable = true)
    private String evidenceLink;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UserID", nullable = false)
    private User user;;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CourseID")
    private Course course;

}

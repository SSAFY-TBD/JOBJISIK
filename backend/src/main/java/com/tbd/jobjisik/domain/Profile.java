package com.tbd.jobjisik.domain;

import com.tbd.jobjisik.domain.enums.Interest;
import com.tbd.jobjisik.domain.enums.Position;
import com.tbd.jobjisik.domain.enums.TechStack;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Profile {
    @Id @Column(name = "profile_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String githubUrl;
    private String university;
    private String major;
    private String company;
    private Integer careerYear;

    @Enumerated(EnumType.STRING)
    private Interest interest;
    @Enumerated(EnumType.STRING)
    private TechStack techStack;
    @Enumerated(EnumType.STRING)
    private Position position;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
}

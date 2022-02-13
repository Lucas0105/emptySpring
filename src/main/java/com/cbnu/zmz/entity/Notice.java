package com.cbnu.zmz.entity;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "notice")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long notice_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @Column(length = 1, nullable = false)
    Boolean notice_status;
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<Notice_Kinds> notice_kinds_id;

    public void addNoticeKinds(Notice_Kinds notice_kinds){
        notice_kinds_id.add(notice_kinds);
    }
}

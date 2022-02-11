package com.cbnu.zmz.entity;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;

@Entity
@Table(name="notice")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long notice_id;

    //    @Column(length = 100, nullable = false)
//    String user_id;
    @Column(length = 100, nullable = false)
    long notice_kinds_id;
    @Column(length = 1, nullable = false)
    Boolean notice_status;
}

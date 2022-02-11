package com.cbnu.zmz.entity;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="scrap")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Scrap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String user_id;

//    @Column(length = 100, nullable = true)
//    Long post_id;
}

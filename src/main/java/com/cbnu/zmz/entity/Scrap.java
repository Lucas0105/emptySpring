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
    Long scrap_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    Board board;
}

package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="post_id")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long post_id;

    @Column(length = 2000, nullable = false)
    String post_content;
}

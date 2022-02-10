package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="anonymous")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Anonymous {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long anonymous_id;

    @Column(length = 20)
    String noun;

    @Column(length = 20)
    String adjective;

    @ManyToOne
    @JoinColumn(name="user_id")
    User user;
}

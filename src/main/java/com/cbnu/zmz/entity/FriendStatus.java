package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="friend_status")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer friend_num;

    @Column(name="friend_status", columnDefinition = "VARCHAR(20)", nullable = false)
    String friend_status;
}

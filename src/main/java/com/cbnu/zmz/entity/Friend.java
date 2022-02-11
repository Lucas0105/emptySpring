package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="friend")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(FriendId.class)
public class Friend {

    // 복합키
    @Id
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="user_id", columnDefinition = "VARCHAR(50)", nullable = false)
    User user_id;

    // 복합키
    @Id
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="friend_id", columnDefinition = "VARCHAR(50)", nullable = false)
    User friend_id;

    @ManyToOne
    @JoinColumn(name="friend_status")
    FriendStatus friend_num;
}

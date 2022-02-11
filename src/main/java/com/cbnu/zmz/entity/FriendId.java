package com.cbnu.zmz.entity;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class FriendId implements Serializable {
    private String user_id;
    private  String friend_id;
}

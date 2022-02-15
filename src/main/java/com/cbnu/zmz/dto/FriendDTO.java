package com.cbnu.zmz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FriendDTO {

    private String user_id;

    private String friend_id;

    private int friend_num;
}

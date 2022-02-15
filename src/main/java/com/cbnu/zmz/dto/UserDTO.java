package com.cbnu.zmz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String user_id;

    private String user_addr;

    private Date user_birth;

    private String user_mail;

    private String user_name;

    private String user_pw;

    private String user_text;

    private int authority_id;

    private String picture_id;

    private String picture_name;

    private String picture_path;

    private String friend_id;

    private int board_like_count;

    private int board_comment_count;
}

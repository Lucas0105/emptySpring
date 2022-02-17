package com.cbnu.zmz.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatListDTO {
    private String user_id;
    private Long chat_id;
    private boolean chat_read;
    //private LocalDateTime chat_send;
}

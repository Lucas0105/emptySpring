package com.cbnu.zmz.service;

import com.cbnu.zmz.dto.ChatListDTO;
import com.cbnu.zmz.entity.Chat;
import org.springframework.stereotype.Service;

@Service
public class ChatListService {

    public ChatListDTO getChatList(String user_id){

        ChatListDTO chatListDTO = new ChatListDTO();
        chatListDTO.setUser_id(user_id);
        chatListDTO.setChat_id(300L);
        chatListDTO.setChat_read(false);

        return chatListDTO;
    }

}

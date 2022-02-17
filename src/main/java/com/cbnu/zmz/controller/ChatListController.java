package com.cbnu.zmz.controller;

import com.cbnu.zmz.dto.ChatListDTO;
import com.cbnu.zmz.entity.Chat;
import com.cbnu.zmz.service.ChatListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/chat")
public class ChatListController {
    private ChatListService chatListService;

    @Autowired
    public ChatListController(ChatListService chatListService){
        this.chatListService = chatListService;
    }

    @GetMapping("list/{user_id}")
    public  Object chatlist(@PathVariable String user_id){
        System.out.println("user_id : " + user_id);
        ChatListDTO chatListDTO = chatListService.getChatList(user_id);
        return chatListDTO;
    }


}

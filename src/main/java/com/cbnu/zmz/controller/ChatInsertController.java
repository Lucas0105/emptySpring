package com.cbnu.zmz.controller;

import com.cbnu.zmz.dto.ChatInsertDTO;
import com.cbnu.zmz.response.DefaultRes;
import com.cbnu.zmz.response.ResponseMessage;
import com.cbnu.zmz.response.StatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatInsertController {

    @PostMapping("insert")
    public ResponseEntity chatInsert(@RequestBody ChatInsertDTO chatInsertDTO){
        return new ResponseEntity(DefaultRes.res(StatusCode.OK, ResponseMessage.SEND_SUCCESS, chatInsertDTO), HttpStatus.OK);    }
}

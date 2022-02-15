package com.cbnu.zmz.controller;

import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@Log4j2
@RequestMapping("/user/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;  //@RequiredArgsConstructor

    @PostMapping("/join")
    public ResponseEntity<StatusDTO> register(@RequestBody UserDTO userDTO){

        log.info("----------------join-------------------------------");


        return new ResponseEntity<>(userService.register(userDTO), HttpStatus.OK);
    }


}

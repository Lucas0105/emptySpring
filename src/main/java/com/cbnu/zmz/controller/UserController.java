package com.cbnu.zmz.controller;

import com.cbnu.zmz.dto.FriendDTO;
import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.security.TokenProvider;
import com.cbnu.zmz.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    public TokenProvider tokenProvider;

    private final UserService userService;  //@RequiredArgsConstructor

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDTO userDTO){
        User user = userService.getByCredential(
                userDTO.getUser_id(),
                userDTO.getUser_pw());

        log.info("==========login========");
        if(user != null){
            final String token = tokenProvider.create(user);

            final UserDTO responseUserDTO = UserDTO.builder().user_id(user.getUser_id())
                    .token(token)
                    .user_name(user.getUser_name())
                    .token(token)
                    .build();
            return ResponseEntity.ok().body(responseUserDTO);
        }
        else{
            StatusDTO statusDTO = StatusDTO.builder()
                    .message("Login failed.")
                    .success(true)
                    .status(200)
                    .build();
            return ResponseEntity
                    .badRequest()
                    .body(statusDTO);
        }
    }

    @PostMapping("/join")
    public ResponseEntity<StatusDTO> register(@RequestBody UserDTO userDTO){

        log.info("----------------join-------------------------------");


        return new ResponseEntity<>(userService.register(userDTO), HttpStatus.OK);
    }

    @GetMapping("/follower/{user_id}")
    public ResponseEntity<List<UserDTO>> follower(@PathVariable String user_id){
        log.info("============follower==============");
        log.info(user_id);

        return new ResponseEntity<>(userService.follower(user_id), HttpStatus.OK);
    }

    @GetMapping("/following/{user_id}")
    public ResponseEntity<List<UserDTO>> following(@PathVariable String user_id){
        log.info("============following==============");
        log.info(user_id);

        return new ResponseEntity<>(userService.following(user_id), HttpStatus.OK);
    }

    @PostMapping("/followAccept")
    public ResponseEntity<StatusDTO> followAccept(@RequestBody FriendDTO friendDTO) throws Exception {
        log.info("============followAccept==============");
        log.info(friendDTO);
        return new ResponseEntity<>(userService.followAccept(friendDTO), HttpStatus.OK);

    }

    @PostMapping("/followProposal")
    public ResponseEntity<StatusDTO> followProposal(@RequestBody UserDTO userDTO) {
        log.info("============followProposal==============");
        log.info(userDTO);
        return new ResponseEntity<>(userService.followProposal(userDTO), HttpStatus.OK);

    }

    @GetMapping("/info/{user_id}")
    public ResponseEntity<UserDTO> info(@PathVariable String user_id){
        log.info("============userInfo==============");
        log.info(user_id);
        return new ResponseEntity<>(userService.info(user_id), HttpStatus.OK);
    }


    @PostMapping("/modify/profile")
    public ResponseEntity<StatusDTO> modifyProfile(@RequestBody UserDTO userDTO){
        log.info("============modify profile==============");
        log.info(userDTO);
        return new ResponseEntity<>(userService.modifyProfile(userDTO), HttpStatus.OK);
    }

    @PostMapping("/modify/pw")
    public ResponseEntity<StatusDTO> modifyPw(@RequestBody UserDTO userDTO){
        log.info("============modify password==============");
        log.info(userDTO);

        return new ResponseEntity<>(userService.modifyPw(userDTO), HttpStatus.OK);
    }


}

package com.cbnu.zmz.controller;

import com.cbnu.zmz.config.security.dto.ClubAuthMemberDTO;
import com.cbnu.zmz.dto.FriendDTO;
import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/follower")
    public ResponseEntity<List<UserDTO>> follower(String user_id){
        log.info("============follower==============");
        log.info(user_id);

        return new ResponseEntity<>(userService.follower(user_id), HttpStatus.OK);
    }

    @GetMapping("/following")
    public ResponseEntity<List<UserDTO>> following(String user_id){
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
//    @PreAuthorize("permitAll()")
//    @GetMapping("/all")
//    public void exAll(){
//        log.info("exAll..........");
//    }

//    @GetMapping("/member")
//    public void exMember(){
//        log.info("exMember..........");
//    }

//    @PreAuthorize("hasRole('ROLL_ADMIN')")
//    @GetMapping("/admin")
//    public void exAdmin(){
//        log.info("exAdmin..........");
//    }
//
//    @PreAuthorize("isAuthenticated()")
//    @GetMapping("/member")
//    public String exMember(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember){
//
//        log.info("exMember..........");
//
//        log.info("-------------------------------");
//        log.info(clubAuthMember.getName());
//
//        return clubAuthMember.getName();
//    }
//
//    @PreAuthorize("#clubAuthMember != null && #clubAuthMember.username eq \"test...95\"")
//    @GetMapping("/exOnly")
//    public String exMemberOnly(@AuthenticationPrincipal ClubAuthMemberDTO clubAuthMember){
//
//        log.info("exMemberOnly.............");
//        log.info(clubAuthMember);
//
//        return "/sample/admin";
//    }

}

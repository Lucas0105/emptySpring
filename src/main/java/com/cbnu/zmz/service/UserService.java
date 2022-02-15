package com.cbnu.zmz.service;

import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.entity.UserAuthority;
import com.cbnu.zmz.repository.UserAuthorityRepository;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

public interface UserService {
    StatusDTO register(UserDTO userDTO);

//    Page<User> login(String user_id, String user_pw);
//
//    Page<User> follower(String user_id);
//
//    List<UserDTO> following(String user_id);
//
//    StatusDTO followRequest(String user_id, String friend_id, int friend_num);
//
//    StatusDTO followProposal(String user_id, String friend_id);
//
//    UserDTO userInfo(String user_id);
//
//    UserDTO userConfig(String user_id);
//
//    StatusDTO modifyProfile(UserDTO userDTO);
//
//    StatusDTO modifyPw(String user_id, String user_pw, String user_new_pw);


    default User dtoToEntity(UserDTO userDTO){
        UserAuthority userAuthority = new UserAuthority();

        userAuthority.setAuthority_id(userDTO.getAuthority_id());


        User user = User.builder()
                .user_id(userDTO.getUser_id())
                .user_name(userDTO.getUser_name())
                .user_pw(userDTO.getUser_pw())
                .user_birth(userDTO.getUser_birth())
                .user_addr(userDTO.getUser_addr())
                .user_mail(userDTO.getUser_mail())
                .user_text(userDTO.getUser_text())
                .userAuthority(userAuthority)
                .build();

        return user;
    }

    default UserDTO entityToDTO(User user){

        UserDTO userDTO = UserDTO.builder()
                .user_id(user.getUser_id())
                .user_name(user.getUser_name())
                .user_addr(user.getUser_addr())
                .user_pw(user.getUser_pw())
                .user_birth(user.getUser_birth())
                .user_mail(user.getUser_mail())
                .user_text(user.getUser_text())
                .authority_id(user.getUserAuthority().getAuthority_id())
                .build();

        return userDTO;

    }

}

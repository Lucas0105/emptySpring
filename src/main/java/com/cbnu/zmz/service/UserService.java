package com.cbnu.zmz.service;

import com.cbnu.zmz.dto.FriendDTO;
import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.entity.UserAuthority;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {
    StatusDTO register(UserDTO userDTO);

    User getByCredential(final String user_id, final String password);

    List<UserDTO> follower(String user_id);

    List<UserDTO> following(String user_id);

    StatusDTO followAccept(FriendDTO friendDTO) throws Exception;

    StatusDTO followProposal(UserDTO  userDTO);

    UserDTO info(String user_id);

    StatusDTO modifyProfile(UserDTO userDTO);

    StatusDTO modifyPw(UserDTO userDTO);


    default User dtoToEntity(UserDTO userDTO){

        User user = User.builder()
                .user_id(userDTO.getUser_id())
                .user_name(userDTO.getUser_name())
                .user_pw(userDTO.getUser_pw())
                .user_birth(userDTO.getUser_birth())
                .user_addr(userDTO.getUser_addr())
                .user_text(userDTO.getUser_text())
                .roleSet(userDTO.getRoleSet())
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
                .user_text(user.getUser_text())
                .build();
        userDTO.setRoleSet(user.getRoleSet());
        return userDTO;

    }

}

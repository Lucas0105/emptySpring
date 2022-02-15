package com.cbnu.zmz.service;

import com.cbnu.zmz.dto.StatusDTO;
import com.cbnu.zmz.dto.UserDTO;
import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public StatusDTO register(UserDTO userDTO){
        StatusDTO statusDTO = new StatusDTO();
        log.info(userDTO);

        User user = dtoToEntity(userDTO);
        log.info("=========join=========");
        log.info(user);

        Optional<User> result = userRepository.findById(user.getUser_id());

        if(result.isPresent()){
            statusDTO.setMessage("이미 해당하는 아이디가 있습니다.");
            statusDTO.setStatus(400);
        }
        else{
            statusDTO.setSuccess(true);
            statusDTO.setMessage("로그인 성공");
            statusDTO.setStatus(200);
            userRepository.save(user);
        }

        return statusDTO;
    }
//    @Override
//    public Page<User> login(String user_id, String user_pw){
//        Pageable pageable
//        Page<User> result = userRepository.findAll(pageable);
//    }
//
//    @Override
//    public Optional<UserDTO> follower(String user_id){
//        Optional<User> result = userRepository.findById("user");
//
//    }
//
//    @Override
//    public List<UserDTO> following(String user_id){
//
//    }
//
//    @Override
//    public StatusDTO followRequest(String user_id, String friend_id, int friend_num){
//        StatusDTO statusDTO = new StatusDTO();
//
//
//        return statusDTO;
//    }
//
//    @Override
//    public StatusDTO followProposal(String user_id, String friend_id){
//        StatusDTO statusDTO = new StatusDTO();
//
//
//        return statusDTO;
//    }
//
//    @Override
//    public UserDTO userInfo(String user_id){
//
//    }
//
//    @Override
//    public UserDTO userConfig(String user_id){
//
//    }
//
//    @Override
//    public StatusDTO modifyProfile(UserDTO userDTO){
//        StatusDTO statusDTO = new StatusDTO();
//
//
//        return statusDTO;
//    }
//
//    @Override
//    public StatusDTO modifyPw(String user_id, String user_pw, String user_new_pw){
//        StatusDTO statusDTO = new StatusDTO();
//
//
//        return statusDTO;
//    }
}

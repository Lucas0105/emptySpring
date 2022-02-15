package com.cbnu.zmz.config.security.service;

import com.cbnu.zmz.config.security.dto.ClubAuthMemberDTO;
import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import net.bytebuddy.build.Plugin;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Log4j2
@Service
@RequiredArgsConstructor
public class ClubUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String user_id) throws UsernameNotFoundException{
        log.info("==============loadUserByUsername===============" + user_id);

        Optional<User> result = userRepository.findByEmail(user_id);

        log.info("===============result "+result);
        if(result.isEmpty()){
            throw new UsernameNotFoundException("Check User Email");
        }

        User user = result.get();

        log.info("=============user===========");
        log.info(user);


        log.info( user.getRoleSet().stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_"+role.name())));

        ClubAuthMemberDTO clubAuthMember = new ClubAuthMemberDTO(
                user.getUser_id(),
                user.getUser_pw(),
                user.getRoleSet().stream()
                        .map(role -> new SimpleGrantedAuthority("ROLE_"+role.name()))
                        .collect(Collectors.toSet())
        );

        clubAuthMember.setName(user.getUser_name());


        return clubAuthMember;
    }
}

package com.cbnu.zmz.config.security.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.Map;

@Log4j2
@Getter
@Setter
@ToString
public class ClubAuthMemberDTO extends User implements OAuth2User {

    private String email;

    private String password;

    private String name;

    private Map<String, Object> attr;

    public ClubAuthMemberDTO(String username, String password,
                             Collection<? extends GrantedAuthority> authorities, Map<String, Object> attr) {
        this(username,password,  authorities);
        this.attr = attr;
    }

    public ClubAuthMemberDTO(String user_id, String user_pw,
                             Collection<? extends GrantedAuthority> authorities) {
        super(user_id, user_pw, authorities);
        this.email = user_id;
        this.password = user_pw;
    }

    @Override
    public Map<String, Object> getAttributes() {return this.attr;}
}

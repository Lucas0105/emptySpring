package com.cbnu.zmz.security;

import com.cbnu.zmz.entity.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Log4j2
@Service
public class TokenProvider {
    private static final String SECRET_KEY = "z1za2m3dz4";

    public String create(User user){

        Date expiryDate = Date.from(
                Instant.now()
                .plus(1, ChronoUnit.DAYS)
        );

        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .setSubject(user.getUser_id())
                .setIssuer("zmz app")
                .setIssuedAt(new Date())
                .setExpiration(expiryDate)
                .compact();

    }

    public String validateAndGetUserId(String token){
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}

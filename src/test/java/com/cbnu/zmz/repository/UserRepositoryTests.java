package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.User;
import com.cbnu.zmz.entity.UserAuthority;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class UserRepositoryTests {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserAuthorityRepository userAuthorityRepository;


    @Test
    public void testClass(){
        System.out.println(userRepository.getClass().getName());
//        결과 $Proxy108  왜냐면 해당 객체에 클래스 이름이 없기 때문에 $가 붙어서 나옴
    }

    @Test
    public void testInsertDummy(){

        Optional<UserAuthority> result = userAuthorityRepository.findById(2);

        UserAuthority userAuthority = result.get();


        IntStream.rangeClosed(101, 110).forEach(i ->{
            User user = User.builder()
                    .user_id("test..." + i)
                    .user_name("name"+i)
                    .user_pw("1234")
                    .user_mail("dj@gmail.com")
                    .authority_id(userAuthority)
                    .build();

            userRepository.save(user);
        });
    }
}

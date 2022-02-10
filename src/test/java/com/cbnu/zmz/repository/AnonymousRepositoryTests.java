package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Anonymous;
import com.cbnu.zmz.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class AnonymousRepositoryTests {

    @Autowired
    AnonymousRepository anonymousRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    public void testClass(){
        System.out.println(anonymousRepository.getClass().getName());
//        결과 $Proxy108  왜냐면 해당 객체에 클래스 이름이 없기 때문에 $가 붙어서 나옴
    }

    @Test
    public void testInsertDummy(){

        Optional<User> result = userRepository.findById("test...1");

        User user = result.get();
        IntStream.rangeClosed(1, 10).forEach(i ->{
            Anonymous anonymous = Anonymous.builder()
                    .user(user)
                    .noun("noun"+i)
                    .adjective("adjective"+i)
                    .build();
            anonymousRepository.save(anonymous);
        });
    }
}

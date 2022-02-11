package com.cbnu.zmz.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FriendStatusRepositoryTests {
    @Autowired
    FriendStatusRepository friendStatusRepository;

    @Test
    public void testClass(){
        System.out.println(friendStatusRepository.getClass().getName());
//        결과 $Proxy108  왜냐면 해당 객체에 클래스 이름이 없기 때문에 $가 붙어서 나옴
    }
}

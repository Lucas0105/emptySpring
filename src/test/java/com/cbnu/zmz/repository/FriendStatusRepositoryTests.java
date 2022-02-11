package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Anonymous;
import com.cbnu.zmz.entity.FriendStatus;
import com.cbnu.zmz.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class FriendStatusRepositoryTests {
    @Autowired
    FriendStatusRepository friendStatusRepository;

    @Test
    public void testClass(){
        System.out.println(friendStatusRepository.getClass().getName());
//        결과 $Proxy108  왜냐면 해당 객체에 클래스 이름이 없기 때문에 $가 붙어서 나옴
    }

    @Test
    public void testInsertDummy(){
        FriendStatus friendStatus = FriendStatus.builder()
                    .friend_num(1)
                    .friend_status("ACCEPT")
                    .build();
        friendStatusRepository.save(friendStatus);
    }
}

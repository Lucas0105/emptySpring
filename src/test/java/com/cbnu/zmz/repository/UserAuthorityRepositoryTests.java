package com.cbnu.zmz.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserAuthorityRepositoryTests {

    @Autowired
    UserAuthorityRepository userAuthorityRepository;

    @Test
    public void testClass() {
        System.out.println(userAuthorityRepository.getClass().getName());
    }
}
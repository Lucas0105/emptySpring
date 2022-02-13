package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalTime.*;

import static java.time.LocalDateTime.*;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void testClass(){
        System.out.println(boardRepository.getClass().getName());
//        결과 $Proxy108  왜냐면 해당 객체에 클래스 이름이 없기 때문에 $가 붙어서 나옴
    }

    @Test
    public void testInsertDummy(){
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Board board = Board.builder()
                    .post_id((long)i)
                    .is_secret(Boolean.TRUE)
                    .post_content("Content..." + i)
                    .post_time(now())
                    .build();
            boardRepository.save(board);
        });
    }
}

package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Notice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class NoticeRepositoryTests {
    @Autowired
    NoticeRepository noticeRepository;

    @Test
    public void testClass(){
        System.out.println(noticeRepository.getClass().getName());
    }

    @Test
    public void testInsertDummy(){
        IntStream.rangeClosed(1,100).forEach((i ->{
            Notice notice = Notice.builder().notice_id((long)i).notice_kinds_id(i%3).notice_status(Boolean.TRUE).build();
            noticeRepository.save(notice);
        }));
    }
}

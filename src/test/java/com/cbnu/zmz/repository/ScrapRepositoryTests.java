package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Report;
import com.cbnu.zmz.entity.Scrap;
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

public class ScrapRepositoryTests {
    @Autowired
    ScrapRepository scrapRepository;

   /* 둘 다 외부키라서 테스트는 형식만 구현했음
    @Test
    public void testClass(){
        System.out.println(scrapRepository.getClass().getName());
    }

    @Test
    public void testInsertDummy(){
        IntStream.rangeClosed(1,100).forEach((i -> {
            Scrap scrap = Scrap.builder().user_id("user..."+i).build();
            scrapRepository.save(scrap);
        }));
    }*/
}

package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Report;
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
public class ReportRepositoryTests {

    @Autowired
    ReportRepository reportRepository;

    @Test
    public void testClass(){
        System.out.println(reportRepository.getClass().getName());
    }

    @Test
    public void testInsertDummy(){
        IntStream.rangeClosed(1,100).forEach((i -> {
            Report report = Report.builder().report_user_list("user..." + i).report_period((long)i).build();
            reportRepository.save(report);
        }));
    }
}

package com.cbnu.zmz.entity;

import lombok.*;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="report")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long report_id;

//    @Column(length = 100, nullable = false)
//    String user_id;
//    @Column(length = 100, nullable = false)
//    long report_reason;
    @Column(length = 100, nullable = true)
    String report_user_list;
    @Column(length = 100, nullable = true)
    Date report_start_period;
    @Column(length = 100, nullable = true)
    Long report_period;
}

package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "report")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Report extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long report_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @Column(length = 100, nullable = true)
    String report_user_list;
    @Column(length = 100, nullable = true)
    Long report_period;
    @ElementCollection(fetch = FetchType.LAZY)
    private Set<Report_Kinds> report_reason;
    public void addReportReason(Report_Kinds report_kinds){
        report_reason.add(report_kinds);
    }
}

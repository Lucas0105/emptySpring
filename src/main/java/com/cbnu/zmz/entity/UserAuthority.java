package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="anonymous")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long authority_id;

    @Column(length = 50)
    String authority_name;
    
}

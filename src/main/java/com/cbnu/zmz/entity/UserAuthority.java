package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="userAuthority")
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="authority_id")
    int authority_id;

    @Column(length = 50)
    String authority_name;

}

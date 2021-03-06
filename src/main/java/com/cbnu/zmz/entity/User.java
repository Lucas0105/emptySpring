package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(length = 50)
    String user_id;

    @Column(length = 30, nullable = false)
    String user_name;

    @Column(length = 255, nullable = false)
    String user_pw;

    @Column(nullable = true)
    Date user_birth;

    @Column(length = 50, nullable = true)
    String user_addr;

    @Column(length = 500, nullable = true)
    String user_text;

    @ElementCollection(fetch = FetchType.LAZY)
    @Builder.Default
    private Set<UserAuthority> roleSet = new HashSet<>();

    public void addMemberRole(UserAuthority userAuthority){
        roleSet.add(userAuthority);
    }



    //    @ManyToOne
//    @JoinTable(name = "UserAuthority",
//            joinColumns = @JoinColumn(name = "authority_id"),
//            inverseJoinColumns = @JoinColumn(name = "authority_id"))
//

//    @JoinColumns(value = {@JoinColumn(name="authority_id")},
//            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//    UserAuthority userAuthority;


}

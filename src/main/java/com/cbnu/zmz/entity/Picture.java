package com.cbnu.zmz.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="picture")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Picture {

    @Id
    @Column(length = 100)
    String picture_id;

    @Column(length = 100, nullable = false)
    String picture_name;

    @Column(length = 200, nullable = false)
    String picture_path;

    @ManyToOne
    @JoinColumn(name="post_id", referencedColumnName = "post_id")
    Board board;

    @ManyToOne
    @JoinColumn(name="user_id", referencedColumnName = "user_id")
    User user;


    //    @ManyToOne
//    @JoinTable(name = "UserAuthority",
//            joinColumns = @JoinColumn(name = "authority_id"),
//            inverseJoinColumns = @JoinColumn(name = "authority_id"))
//

//    @JoinColumns(value = {@JoinColumn(name="authority_id")},
//            foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
//    UserAuthority userAuthority;


}

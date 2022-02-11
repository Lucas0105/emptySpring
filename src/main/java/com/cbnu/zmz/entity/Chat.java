package com.cbnu.zmz.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="chat")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Chat  extends ChatEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long chat_id;

    @Column(length = 500, nullable = false)
    String chat_content;

    @Column(nullable = false)
    Boolean chat_read;

//    @Column(length = 50, nullable = false)
//    String user_id;
//
//    @Column(length = 50, nullable = false)
//    String friend_id;
}

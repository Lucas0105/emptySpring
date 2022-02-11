package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}

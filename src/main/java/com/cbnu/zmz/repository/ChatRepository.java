package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Anonymous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Anonymous, Long> {
}

package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, String> {
}
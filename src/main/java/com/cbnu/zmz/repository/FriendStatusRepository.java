package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.FriendStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EnumType;

public interface FriendStatusRepository  extends JpaRepository<FriendStatus, Integer> {
}

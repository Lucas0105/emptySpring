package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}

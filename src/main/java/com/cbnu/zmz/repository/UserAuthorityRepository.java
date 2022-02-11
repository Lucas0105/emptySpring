package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Scrap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthorityRepository extends JpaRepository<Scrap, String>{
}

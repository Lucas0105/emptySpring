package com.cbnu.zmz.repository;

import com.cbnu.zmz.entity.Picture;
import com.cbnu.zmz.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureRepository extends JpaRepository<Picture, String> {
}
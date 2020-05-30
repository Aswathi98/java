package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.Wing;

@Repository
public interface WingRepository extends JpaRepository<Wing,Long>{
 
}

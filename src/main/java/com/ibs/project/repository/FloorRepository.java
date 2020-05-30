package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.Floor;

@Repository
public interface FloorRepository extends JpaRepository<Floor,Long> {

}

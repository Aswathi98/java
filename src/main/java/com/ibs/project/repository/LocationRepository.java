package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location,Long> {

}

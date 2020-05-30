package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ibs.project.entity.SpaceMap;

@Repository
public interface SpaceMapRepository extends JpaRepository<SpaceMap,Long> {

}

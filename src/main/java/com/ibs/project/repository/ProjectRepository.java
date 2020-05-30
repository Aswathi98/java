package com.ibs.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibs.project.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

}

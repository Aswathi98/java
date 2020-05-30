package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Project;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.ProjectRepository;

@Component
public class ProjectDao {

	@Autowired
	ProjectRepository projectRepo;
	
	@Transactional
	public Project save(UploadModel uploadModel) throws ParseException{
		
		Project project=new Project();
		project.setProject(uploadModel.getProject());
		project.setProjectId(uploadModel.getProj_id());
		project.setCreatedTime(uploadModel.currentDate());
		return project;
	}
	
}

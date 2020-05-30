package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Location;
import com.ibs.project.entity.Project;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.LocationRepository;

@Component
public class LocationDao {
	
	@Autowired
	LocationRepository locationRepo;
	
	@Autowired
	ProjectDao projectDao;
	
	@Transactional
	public Location save(UploadModel uploadModel) throws ParseException{
		
		Location location=new Location();
		Project project=new Project();
		
		location.setLocation(uploadModel.getLocation());
		location.setCreatedTime(uploadModel.currentDate());
		location.setLocationId(uploadModel.getLoc_id());
		project=projectDao.save(uploadModel);
		location.setProject(project);
		locationRepo.save(location);
		return location;
	}

}

package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.project.entity.SpaceMap;
import com.ibs.project.entity.Wing;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.SpaceMapRepository;

@Component
public class SpaceMapDao {

	@Autowired
	SpaceMapRepository spaceMapRepo;
	
	@Autowired
	WingDao wingDao;
	
	@Transactional
	public SpaceMap save(UploadModel uploadModel) throws ParseException{
	
	SpaceMap spaceMap=new SpaceMap();
	Wing wing=new Wing();
	spaceMap.setCreatedTime(uploadModel.currentDate());
	wing=wingDao.save(uploadModel);
	spaceMap.setWing(wing);
	spaceMapRepo.save(spaceMap);
	return spaceMap;
}
	}

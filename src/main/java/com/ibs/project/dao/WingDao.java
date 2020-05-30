package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Floor;
import com.ibs.project.entity.Wing;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.WingRepository;

@Component
public class WingDao {

	@Autowired
	WingRepository wingRepo;
	
	@Autowired
	FloorDao floorDao;
	
	@Transactional
	public Wing save(UploadModel uploadModel) throws ParseException{
		Wing wing=new Wing();
		Floor floor=new Floor();
		
		wing.setWingName(uploadModel.getWing());
		wing.setCreatedTime(uploadModel.currentDate());
		wing.setWingId(uploadModel.getWing_id());
		floor=floorDao.save(uploadModel);
		wing.setFloor(floor);
		wingRepo.save(wing);
		return wing;
				
				
		
		
	}
}

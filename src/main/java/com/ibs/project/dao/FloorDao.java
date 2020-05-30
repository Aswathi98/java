package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Facility;
import com.ibs.project.entity.Floor;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.FloorRepository;

@Component
public class FloorDao {
  
  @Autowired 
  FloorRepository floorRepo;
  
  @Autowired
  FacilityDao facilityDao;
  
  @Transactional
  public Floor save(UploadModel uploadModel) throws ParseException {
	  
	  Floor floor=new Floor();
	  Facility facility=new Facility();
	  floor.setFloorName(uploadModel.getFloor());
	  floor.setCreatedTime(uploadModel.currentDate());
	  floor.setFloorId(uploadModel.getFloor_id());
	  facility=facilityDao.save(uploadModel);
	  floor.setFacility(facility);
	  floorRepo.save(floor);
	  
	  return floor;
  }
}

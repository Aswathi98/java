package com.ibs.project.dao;

import java.text.ParseException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ibs.project.entity.Facility;
import com.ibs.project.entity.Location;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.FacilityRepository;

@Component
public class FacilityDao {

	@Autowired
	FacilityRepository facilityRepo;
	
	@Autowired
	LocationDao locationDao;
	
	@Transactional
	public Facility save(UploadModel uploadModel) throws ParseException{
		
		Facility facility=new Facility();
		Location location=new Location();
		
		facility.setFacilityName(uploadModel.getFacility());
		facility.setCreatedTime(uploadModel.currentDate());
		facility.setFacilityId(uploadModel.getFac_id());
		location=locationDao.save(uploadModel);
		facility.setLocation(location);
		facilityRepo.save(facility);
		return facility;
	}
}

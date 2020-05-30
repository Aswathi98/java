package com.ibs.project.service;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibs.project.dao.UploadDao;
import com.ibs.project.model.UploadModel;

@Service
public class UploadService {
	
Logger logger = LoggerFactory.getLogger(UploadService.class);
	
	@Autowired
	UploadDao uploadDAO;
	
	public boolean saveData( List<UploadModel> listUploadModel) throws ParseException{
		logger.info(" UploadService saveData is invoked");
		return uploadDAO.save( listUploadModel);
	}

}

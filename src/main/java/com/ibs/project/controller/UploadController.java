package com.ibs.project.controller;

import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.project.exception.ArgumentNullException;
import com.ibs.project.model.UploadModel;
import com.ibs.project.service.UploadService;

@RestController
@CrossOrigin("http://localhost:4200") 
public class UploadController {

	private static final Logger logger=LoggerFactory.getLogger(UploadController.class);
	@Autowired
	UploadService uploadService;
	
	@PostMapping("/upload")
	public boolean saveUploadData(@RequestBody List<UploadModel> listUploadModel) throws  ArgumentNullException, ParseException{
		try{
				if(listUploadModel.size()==0){
					throw new ArgumentNullException("Wrong Excel Uploaded");
				}
				else return uploadService.saveData( listUploadModel);
			}catch(ArgumentNullException e){
				logger.error("Wrong Excel Uploaded");
				throw new ArgumentNullException("Wrong Excel Uploaded");
			}
	}
}

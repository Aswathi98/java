package com.ibs.project.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.model.UploadModel;

@Component
public class UploadDao {

	@Autowired
	EmployeeDao employeeDao;
	
	@Transactional
	public boolean save(List<UploadModel>listUploadModel){
		listUploadModel.stream().forEach(uploadModel->{
			try{
				employeeDao.save(uploadModel);
			}catch(Exception e){
				e.printStackTrace();
			}
		});
		return true;
	}
	
}

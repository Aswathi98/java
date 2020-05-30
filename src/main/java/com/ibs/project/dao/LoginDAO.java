package com.ibs.project.dao;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.LoginEntity;
import com.ibs.project.exception.ResourceNotFoundException;
import com.ibs.project.model.LoginCredential;
import com.ibs.project.repository.LoginRepository;







@Component
public class LoginDAO {

private static final Logger logger= LogManager.getLogger(LoginDAO.class);
		
	
	@Autowired
	LoginRepository loginRepository;
	
	public LoginEntity getUser(LoginCredential loginCredential) throws ResourceNotFoundException{
		LoginEntity employee= (loginRepository.findById(loginCredential.getEmpId())).get();
		try{
			if(Objects.isNull(employee))
				throw new ResourceNotFoundException("no such employee");
			else
				loginRepository.save(employee);
				return employee;
			
		}catch(ResourceNotFoundException e){
			logger.error("no such employee");
			throw new ResourceNotFoundException("no such employee");
			
		}
	}

}

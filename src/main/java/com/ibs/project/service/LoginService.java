package com.ibs.project.service;



import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.project.dao.LoginDAO;
import com.ibs.project.entity.LoginEntity;
import com.ibs.project.exception.ResourceNotFoundException;
import com.ibs.project.model.LoginCredential;
import com.ibs.project.model.LoginModel;

@Service
public class LoginService {

		 private static final Logger logger =  LogManager.getLogger(LoginService.class);
		@Autowired
		LoginDAO loginDao;
		LoginModel loginModel = null;

		public LoginModel validateUser(LoginCredential loginCredential) throws ResourceNotFoundException{
			logger.info(" LoginService validateUser is invoked");
			loginModel = new LoginModel();
			loginModel.setStatus("Failure");
			LoginEntity employee = loginDao.getUser(loginCredential);
			if (Objects.nonNull(employee)) {
				if (Objects.equals(loginCredential.getPassword(),employee.getPassword())) {
					

					loginModel.setStatus("Success");
					loginModel.setEmployeeName(employee.getEmployeeName());
					

				}

			}
			return loginModel;

		}
	}


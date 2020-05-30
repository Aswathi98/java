package com.ibs.project.dao;

import java.text.ParseException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ibs.project.entity.Employee;
import com.ibs.project.entity.SpaceMap;
import com.ibs.project.model.UploadModel;
import com.ibs.project.repository.EmployeeRepository;

@Component
public class EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	SpaceMapDao spaceMapDao;
	
	@Transactional
	public Employee save(UploadModel uploadModel) throws ParseException {
		Employee employee=new Employee();
		SpaceMap spaceMap=new SpaceMap();
		
		employee.setEmpId(uploadModel.getEmpId());
		employee.setSlNo(uploadModel.getSlNo());
		employee.setAllocatedTo(uploadModel.getAllocatedTo());
		employee.setShortName(uploadModel.getShortName());
		employee.setProject(uploadModel.getProject());
		employee.setSeatNo(uploadModel.getSeatNo());
		employee.setCreatedTime(uploadModel.currentDate());
		
		spaceMap=spaceMapDao.save(uploadModel);
		employee.setSpaceMap(spaceMap);
		employeeRepo.save(employee);
		return employee;
}
}
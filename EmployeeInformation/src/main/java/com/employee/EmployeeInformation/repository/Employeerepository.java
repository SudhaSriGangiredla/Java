package com.employee.EmployeeInformation.repository;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.EmployeeInformation.models.Employee;

public interface Employeerepository extends MongoRepository<Employee, String>{
    
	Employee findBy_id(ObjectId _id);
	
	
//	@Query("{id:'?'0}")
//	Employee findById(String id);
		
}

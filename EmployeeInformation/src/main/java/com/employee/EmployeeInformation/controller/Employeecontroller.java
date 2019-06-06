package com.employee.EmployeeInformation.controller;

import java.util.List;
import javax.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.employee.EmployeeInformation.models.Employee;
import com.employee.EmployeeInformation.repository.Employeerepository;

@RestController
@RequestMapping("/emp")
public class Employeecontroller {
	
	@Autowired
   private Employeerepository repository;
   
	@RequestMapping(value = "/", method = RequestMethod.GET)
   public List<Employee> getAllEmployees(){
	return repository.findAll();
	   }
   @RequestMapping(value = "/{id}", method = RequestMethod.GET)
   public Employee getEmployeeById(@PathVariable("id") ObjectId id) {
	return repository.findBy_id(id);
	   }
   
	
	 @RequestMapping(value = "/{id}", method = RequestMethod.PUT) 
	 public void modifyEmployeeById(@PathVariable("id") ObjectId id, @Valid @RequestBody
	                                         Employee employee) { 
		 employee.set_id(id); 
		 repository.save(employee); 
		 }
	 
   /*@RequestMapping(value = "/", method = RequestMethod.POST)
   public Employee save(@PathVariable("id") ObjectId id, @Valid @RequestBody Employee employee) {
	   employee.set_id(ObjectId.get());
	//return employee.get_id();
	   repository.save(employee);
	   return employee;
	   
   }*/
     @RequestMapping(value = "/", method = RequestMethod.POST)
	 public Employee createEmployee(@Valid @RequestBody Employee employee) {
	  employee.set_id(ObjectId.get()); 
	  return repository.save(employee);
	  }
	
	
   @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
   public void deleteEmployee(@PathVariable ObjectId id) {
   repository.delete(repository.findBy_id(id));
	  
   }

}   
   
   


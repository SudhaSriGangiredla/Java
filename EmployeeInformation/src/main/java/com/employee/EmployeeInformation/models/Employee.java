package com.employee.EmployeeInformation.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {
	
	@Id
	public ObjectId _id;
	 
	 /* public ObjectId get_id() { return _id; }
	 * 
	 * public void set_id(ObjectId objectId) { this._id = objectId; }
	 */
	
	public int empid;
	public String empname;
	public String empaddress;
	
	
	public Employee() {}
	
	public Employee(ObjectId _id, int empid, String empname, String empaddress) {
		
		//super();
		this._id = _id;
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
	}
	
	
	 public String get_id() {
		 return _id.toHexString(); 
		 }
	 public void set_id(ObjectId _id) { 
		 this._id = _id; 
	 }
	
	 public int getEmpid() { 
		 return empid; 
		 } 
	 public void setEmpid(int empid) {
	 this.empid = empid;
	 }
	
   public String getEmpname() {
		return empname;
	}
   public void setEmpname(String empname) {
		this.empname = empname;
	}
   public String getEmpaddress() {
		return empaddress;
	}
   public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
   }



}

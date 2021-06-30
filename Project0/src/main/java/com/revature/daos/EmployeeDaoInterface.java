package com.revature.daos;

import java.util.List;

import com.revature.models.Employee;


public interface EmployeeDaoInterface {

	public List<Employee> getEmployees(); // return a List of all employees
	
	public void addEmployee(Employee emp); // take a new Employee object, add it to the database
	
	public void changeRole(int empId, int roleId); // change an employee's roleId given their employee_id
	
	public void removeEmployee(int empId, int roleId);
	
}

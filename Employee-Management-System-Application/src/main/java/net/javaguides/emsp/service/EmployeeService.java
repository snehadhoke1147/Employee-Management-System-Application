package net.javaguides.emsp.service;

import java.util.List;

import net.javaguides.emsp.model.Employee;

public interface EmployeeService 
{
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
	
}
package com.cogent.empspringboot.service;

import java.util.List;
import java.util.Optional;

import com.cogent.empspringboot.dto.Employee;

public interface EmployeeService {

	public Optional<Employee> addEmployee(Employee employee );
	public String deleteEmployeeById(String id) ;
	public void deleteAllEmployees();
	public Optional<List<Employee>> getEmployeeById(String id) ;
	public Optional<List<Employee>> getEmployees();
	public String updateEmployee(Employee employee);
	public boolean isEmployeeExists(String id);
}

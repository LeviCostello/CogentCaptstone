package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.ArrayList;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryALImpl implements EmployeeRepository {

	private ArrayList<Employee> employees = new ArrayList<>();
	//10 employees
	//when we will add 11th one then it will increase the sieze automattically 
	//set growable
	
	//<Employee> ==> we are informing that we will hold only Employees type objects
	
	private static EmployeeRepository employeeRepository;
	
	private EmployeeRepositoryALImpl() {
		
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryALImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		boolean status = employees.add(employee);
		if(status)
			return "success";
		else
			return "fail";
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		//1. we need to traverse the arraylist
		for(Employee employee : employees) {
			if(id.equals(employee.getEmployeeId())) {
				return employee;
			}
		}
		//2. we need to use java 8 features
		return null;
	}

	@Override
	public Employee[] getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee[] getEmployeeByName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.elitech.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elitech.dao.repository.EmployeeRepository;
import com.elitech.model.entities.Employee;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class EmployeeServiceImplement implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll(); //select *
	}

	@Override
	public Employee addOneEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteOneEmployee(long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
		
	}

	@Override
	public List<Employee> findEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(name);
	}

	@Override
	public List<Employee> findEmployeeByNameOrFirstName(String name, String firstname) {
		// TODO Auto-generated method stub
		return employeeRepository.findByNameAndFirstName(name, firstname);
	}

	@Override
	public List<Employee> findEmployeeByNameAndFirstName(String name, String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findEmployeeByResponsabiliteContains(String responsabilite) {
		// TODO Auto-generated method stub
		return employeeRepository.findByResponsabiliteContains(responsabilite);
	}

	@Override
	public List<Employee> findEmployeeByAgeGreaterThanEqual(int age) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAgeGreaterThanEqual(age);
	}

	@Override
	public List<Employee> findEmployeeByAgeLessThanEqual(int age) {
		// TODO Auto-generated method stub
		return employeeRepository.findByAgeLessThanEqual(age);
	}

}

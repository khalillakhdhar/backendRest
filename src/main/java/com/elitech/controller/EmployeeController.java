package com.elitech.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.model.entities.Employee;
import com.elitech.services.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {
	private final EmployeeService employeeService;
	
	@GetMapping
	public List<Employee> getEmployees()
	{
		return employeeService.findAllEmployees();
	}
	@PostMapping
	public Employee addOne(@RequestBody Employee employee)
	{
		return employeeService.addOneEmployee(employee);
	}
	@DeleteMapping("/{id}")
	public void deleteOneEmployee(@PathVariable long id )
	{
		employeeService.deleteOneEmployee(id);
	}
	/*
	 * ;
List<Employee> findEmployeeByNameOrFirstName(String name,String firstname);
List<Employee> findEmployeeByNameAndFirstName(String name,String firstname);
List<Employee> findEmployeeByResponsabiliteContains(String responsabilite);
List<Employee> findEmployeeByAgeGreaterThanEqual(int age);
List<Employee> findEmployeeByAgeLessThanEqual(int age);
}
	*/
	@GetMapping("/byname")
public List<Employee> findEmployeeByName(@RequestParam String name)
{
	return employeeService.findEmployeeByName(name);
	}
	@GetMapping("/bynameorfirst")
public List<Employee> findEmployeeOrFirstName(@RequestParam String name,@RequestParam String firstname)
{
	return employeeService.findEmployeeByNameOrFirstName(name,firstname);
	}
	@GetMapping("/bynameandfirst")
public List<Employee> findEmployeeAndFirstName(@RequestParam String name,@RequestParam String firstname)
{
	return employeeService.findEmployeeByNameAndFirstName(name,firstname);
	}
}

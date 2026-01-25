package com.elitech.services;

import java.util.List;

import com.elitech.model.entities.Employee;

public interface EmployeeService {
public List<Employee> findAllEmployees();
public Employee addOneEmployee(Employee employee);
public void deleteOneEmployee(long id);
List<Employee> findEmployeeByName(String name);
List<Employee> findEmployeeByNameOrFirstName(String name,String firstname);
List<Employee> findEmployeeByNameAndFirstName(String name,String firstname);
List<Employee> findEmployeeByResponsabiliteContains(String responsabilite);
List<Employee> findEmployeeByAgeGreaterThanEqual(int age);
List<Employee> findEmployeeByAgeLessThanEqual(int age);
}

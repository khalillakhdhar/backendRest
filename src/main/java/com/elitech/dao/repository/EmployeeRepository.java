package com.elitech.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
List<Employee> findByName(String name);
List<Employee> findByNameOrFirstName(String name,String firstname);
List<Employee> findByNameAndFirstName(String name,String firstname);
List<Employee> findByResponsabiliteContains(String responsabilite);
List<Employee> findByAgeGreaterThanEqual(int age);
List<Employee> findByAgeLessThanEqual(int age);


}

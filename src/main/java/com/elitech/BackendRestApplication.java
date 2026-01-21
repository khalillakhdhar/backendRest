package com.elitech;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.elitech.dao.repository.EmployeeRepository;
import com.elitech.model.entities.Employee;
import com.elitech.model.enumerated.Grades;


@SpringBootApplication
public class BackendRestApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(BackendRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee em=new Employee("usertest2", "testUser2", 50, Grades.Employée, "responsable d'archive et documentation");
		
		
		System.out.println("éxecution en cours sur le port 8081");
		//employeeRepository.save(em);
		System.out.println("liste des employées");
		List<Employee> emp=employeeRepository.findAll();
		affiche(emp);
		System.out.println("liste des employées d'age >40");
		List<Employee> emp2=employeeRepository.findByAgeGreaterThanEqual(40);
		affiche(emp2);


		
	}
	void affiche(List<Employee> emp)
	{
		emp.forEach(em->
		{
			System.out.println(em.toString());
		}
				);
		
	}

}

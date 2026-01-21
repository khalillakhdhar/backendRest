package com.elitech.model.entities;

import com.elitech.model.BaseEntity;
import com.elitech.model.enumerated.Grades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity{
	
	@Column(name = "name",nullable = false)
	private String name;
	@Column(name = "firstname",nullable = false)
	private String firstName;
	@Column(name = "age",nullable = false)
	private int age;
	@Enumerated(EnumType.STRING)
	private Grades grade;
	private String responsabilite;

}

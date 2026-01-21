package com.elitech.model;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class BaseEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

LocalDateTime createdAt,updatedAt;
@PrePersist
void preCreate()
{
createdAt=updatedAt=LocalDateTime.now();	
}
@PreUpdate
void preUpdate()
{
updatedAt=LocalDateTime.now();	
}

}

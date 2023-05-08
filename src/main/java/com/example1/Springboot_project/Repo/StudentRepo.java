package com.example1.Springboot_project.Repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example1.Springboot_project.DBdetails.Student1;


public interface StudentRepo extends JpaRepository<Student1, Integer>

{
	
	
}

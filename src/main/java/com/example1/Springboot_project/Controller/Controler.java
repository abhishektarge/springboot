package com.example1.Springboot_project.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example1.Springboot_project.DBdetails.Student1;
import com.example1.Springboot_project.Repo.StudentRepo;

@RestController
public class Controler 
{
	
	@Autowired 
	StudentRepo studentRepo;
	

	@PostMapping("/savestudent")
	public String save(@RequestBody Student1 s) 
	{
		studentRepo.save(s);
		return "data saved succesfully";
		
	}
	@GetMapping("/fetchstudent")
	public Student1 fetchStudentById(@RequestParam int id)
	{
		Optional<Student1> op= studentRepo.findById(id);
		Student1 s=op.get();
		return s;
	}

	@DeleteMapping("/deletestudent")
	public String deleteStudent(@RequestParam int id)
	{
		studentRepo.deleteById(id);
		return "data deleted succesfully";
	}
	
	@PutMapping ("/updatestudent")
	public String updateStudent(@RequestBody Student1 s)
	{
		studentRepo.save(s);
		return "data updated succesfully";
	}

	

}

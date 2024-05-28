package com.bca.controller;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bca.entity.Studententity;
import com.bca.repository.Studentrepository;
import com.bca.service.Studentservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Studentcontroller {
	@Autowired
	Studentservice ss;
	@Autowired
	Studentrepository sr;
	@GetMapping("/view")
	public java.util.List<Studententity> view_stud(){
		return ss.view_stud();
		}
	
	
	@PostMapping("/save")
	public String postMethodName(@RequestBody Studententity s) {
		return ss.save(s);
	}
		@GetMapping("/view/{id}")
		public Optional <Studententity> view_one (@PathVariable Long id){
			return ss.view_one_stud(id);
		}
	
		@DeleteMapping("/del/{id}")
		
			public String del_stu(@PathVariable Long id) {
				return ss.del_stu(id);
			}
		
		@PutMapping("/edit/{id}")
		public Studententity updateUser(@PathVariable Long id ) {
			Studententity student=sr.findById(id).get();
			student.setName("neha");
			sr.save(student);
			return student;
			
			
			
			
		}
		}
	
	
	


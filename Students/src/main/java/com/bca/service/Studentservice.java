package com.bca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bca.entity.Studententity;
import com.bca.repository.Studentrepository;

@Service
public class Studentservice {
	@Autowired
	Studentrepository sr;
	
    public List <Studententity> view_stud(){
    	return sr.findAll();
    }
    public  String save(Studententity s) {
		sr.save(s);
		return "data saved successfully";
	}
    public Optional <Studententity> view_one_stud(Long id){
    	return sr.findById(id);
    	 }
    public String del_stu(Long id) {
    	sr.deleteById(id);
    	return id + " data deleted successfully";
    }
    
    	
   
   public Optional updateUser(Long id) {
   	return sr.findById(id);
    }
  
	
	
	
	
	}
	
	
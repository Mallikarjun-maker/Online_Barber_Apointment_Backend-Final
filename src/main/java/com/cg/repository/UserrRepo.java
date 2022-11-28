package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Userr;


public interface UserrRepo extends JpaRepository<Userr, Integer>{

	//spring boots created an Querry to fetch user by email id
	
	
	public Userr findByEmailId(String email);
	public Userr findByEmailIdAndPassword(String email, String password);
	
}

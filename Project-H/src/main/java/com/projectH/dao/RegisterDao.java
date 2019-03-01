package com.projectH.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.projectH.model.Users;
import com.projectH.repository.RepositoryClass;

public class RegisterDao {

	@Autowired
	DataSource datasource;
	
	@Autowired
	RepositoryClass repo;
	
	public String saveNewUser(Users user)
	{
		repo.save(user);
		
		return "register successfully!!";
	}
	
	
}

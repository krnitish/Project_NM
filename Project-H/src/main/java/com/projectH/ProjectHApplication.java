package com.projectH;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projectH.model.Address;
import com.projectH.model.Users;
import com.projectH.repository.RepositoryClass;

@SpringBootApplication
public class ProjectHApplication implements CommandLineRunner {

	@Autowired
	RepositoryClass repo;
	@Autowired
	DataSource datasource;

	public static void main(String[] args) {
		SpringApplication.run(ProjectHApplication.class, args);
		System.out.println("App is Running");
	}

	@Override
	public void run(String... args) throws Exception {
		Users users = new Users("Nitish", "Kumar", new Date(2018, 02, 12), "abc@xyz.com", "4673258764", "7047291189",
				"Single", "Male", new Address("India", "UP", "Noida", "Sector 53"),
				new Address("India", "UP", "Noida", "Sector 61"));
		
	
		Users users1 = new Users("Mohit", "Kumar", new Date(2018, 02, 12), "abc@xyz.com", "4673258764", "7047291189",
				"Single", "Male", new Address("India", "UP", "Noida", "Sector 53"),
				new Address("India", "UP", "Noida", "Sector 61"));
//		List<Address> alist=new ArrayList<Address>();
//		alist.add(new Address("India", "UP", "Noida", "Sector 61"));
//		alist.add(new Address("US", "New Jersy", "California", "abc"));
//		Users users = new Users("Nitish", "Kumar", new Date(2018, 02, 12), "abc@xyz.com", "4673258764", "7047291189",
//				"Single", "Male", alist);
//		Users users1 = new Users("Mohit", "Kumar", new Date(2018, 02, 12), "abc@xyz.com", "4673258764", "7047291189",
//				"Single", "Male", alist);
		repo.save(users);
		repo.save(users1);
	//	Address address=new Address("India", "UP", "Noida", "Sector 60");
		//repo.save(address)
		
		
	}

}

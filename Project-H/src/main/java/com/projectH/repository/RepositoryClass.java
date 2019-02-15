package com.projectH.repository;

import org.springframework.data.repository.CrudRepository;

import com.projectH.model.Address;
import com.projectH.model.Users;

public interface RepositoryClass extends CrudRepository<Users, Long>{

}

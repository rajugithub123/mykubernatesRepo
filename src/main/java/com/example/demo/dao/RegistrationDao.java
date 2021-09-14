package com.example.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Registration;
@Repository
public interface RegistrationDao extends CrudRepository<Registration, Integer> {
	@Query(value="select * from Registration where Name=?1 ",nativeQuery=true)
	public  Registration findByName( String registrationName);
}

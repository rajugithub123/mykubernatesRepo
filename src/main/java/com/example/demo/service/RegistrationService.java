package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.RegistrationDao;
import com.example.demo.entities.Registration;

@Service
public class RegistrationService {
	@Autowired
	public RegistrationDao registrationDao;

	public Registration createRegistration(Registration registration) {
		return registrationDao.save(registration);
	}

	public Optional<Registration> getRegistrationById(Integer registrationId) {
		return registrationDao.findById(registrationId);

	}
	public Registration getRegistrationByName(String registrationName) {
		return registrationDao.findByName(registrationName);

	}

	

	public Registration updateRegistrationById(Integer registrationId, String newAddress) {
		Optional<Registration> updatedregistration = registrationDao.findById(registrationId);
		Registration registration = updatedregistration.get();
		registration.setAddress(newAddress);
		return registrationDao.save(registration);

	}

	public void deleteRegistrationBYId(Integer registrationId) {
		registrationDao.deleteById(registrationId);

	}

	public Iterable<Registration> getAllRegistrations() {
		return registrationDao.findAll();
		
		
	}

}

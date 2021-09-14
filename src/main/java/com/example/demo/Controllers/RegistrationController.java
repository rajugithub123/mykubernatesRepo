package com.example.demo.Controllers;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Registration;
import com.example.demo.service.RegistrationService;

@RestController
public class RegistrationController {

@Autowired	
public RegistrationService registrationService;

@PostMapping(value="/createRegistration")
	public Registration createRegistration(@RequestBody Registration registration) {
	return  registrationService.createRegistration(registration);

}
@GetMapping(value="/getRegistration/{registrationId}")
public Optional<Registration> getRegistrationById(@PathVariable("registrationId") Integer registrationId) {
	return registrationService.getRegistrationById(registrationId);
}

@GetMapping(value="/getRegistrationByName/{registrationName}")
public Registration getRegistrationById(@PathVariable("registrationName") String registrationName) {
	return registrationService.getRegistrationByName(registrationName);
}




@DeleteMapping(value="/registration/{registrationId}")
public void deleteRegistration(@PathVariable("registrationId") Integer registrationId){
	registrationService.deleteRegistrationBYId(registrationId);
	
	
}
@GetMapping(value="/getAllRegistrations")
public Iterable<Registration> getAllRegistrations(){
	return registrationService.getAllRegistrations();
}




@PutMapping(value="/updateRegistration/{registrationId}/{Address}")
public Registration updateRegistrationById(@PathVariable("registrationId") Integer registrationId,@PathVariable("Address") String Address) {
	return registrationService.updateRegistrationById(registrationId,Address);


	
}

}

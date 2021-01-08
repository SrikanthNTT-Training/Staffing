package com.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

	@Autowired
	EmployeeRepository repo;

	@GetMapping("/employee")
	public List<Employee> getEmployee() {

		List<Employee> emp = repo.findAll();
		return emp;

	}

	@PostMapping("/employee")
	public Employee createEmployee(@Valid @RequestBody Employee e) {
		repo.save(e);
		return e;
	}

	@PutMapping("/employee/{id}")
	public void updateEmployee(@PathVariable(value = "id") Integer id, @Valid @RequestBody Employee emp) {

		Employee e = repo.findById(id).orElseThrow();
		e.setId(emp.getId());
		e.setName(emp.getName());
		e.setAge(emp.getAge());
		e.setAddress(emp.getAddress());
		e.setExperience(emp.getExperience());
		e.setSkillset(emp.getSkillset());
		e.setLocaltion(emp.getLocaltion());
		e.setEmailid(emp.getEmailid());
		e.setDepartment(emp.getDepartment());
		e.setDesignation(emp.getDesignation());
		e.setPhonenumber(emp.getPhonenumber());
		e.setBloodgroup(emp.getBloodgroup());
		e.setReportingto(emp.getReportingto());
		e.setReferredby(emp.getReferredby());
		e.setDoj(emp.getDoj());
		e.setCurrentstatus(emp.getCurrentstatus());
		e.setDol(emp.getDol());
		e.setDob(emp.getDob());
		repo.save(e);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable(value = "id") Integer id) {
		Employee e = repo.findById(id).orElseThrow();
		repo.delete(e);
	}

}

package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController 
{
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping(value = "/getEmployeeJson/{eid}",consumes = {"application/json","application/xml"},produces = "application/json")
	public Employee getEmployeeInJson(@PathVariable("eid") Integer eid)
	{
		return employeeService.getEmployee(eid);
	}
	
	@GetMapping(value = "/getEmployeeXml/{eid}",consumes = {"application/json","application/xml"},produces = "application/xml")
	public Employee getEmployeeInXml(@PathVariable("eid") Integer eid)
	{
		return employeeService.getEmployee(eid);
	}

}

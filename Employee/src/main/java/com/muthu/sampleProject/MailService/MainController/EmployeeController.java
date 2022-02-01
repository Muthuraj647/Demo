package com.muthu.sampleProject.MailService.MainController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.muthu.sampleProject.MailService.Entity.Employee;
import com.muthu.sampleProject.MailService.Service.EmployeeServiceImpl;



@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	EmployeeServiceImpl employeeService;

	public EmployeeController(EmployeeServiceImpl employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
	{
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping
	
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("{id}")
	

	public Employee getEmployeeById(@PathVariable("id") int id)
	{
		return employeeService.getEmployeeByid(id);
	}
	
	//update
	
	@PutMapping("{id}")
	
	public Employee updateEmp(@PathVariable("id") int id, @RequestBody Employee employee)
	{
		return employeeService.updatEmployee(employee, id);
		
	}
	
	@DeleteMapping("{id}")
	

	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.out.println("id founded!");
		employeeService.deleteEmployee(id);
		System.out.println("id deleted!");
		return "Deleted";
	}
	

}

package com.muthu.sampleProject.MailService.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.muthu.sampleProject.MailService.Entity.Employee;
import com.muthu.sampleProject.MailService.Repo.EmployeeRepo;



@Service
public class EmployeeServiceImpl{

	private EmployeeRepo employeeRepository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepo employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}



	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}



	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}



	
	public Employee getEmployeeByid(int id) {
		
		return employeeRepository.findById(id).orElseThrow();
		
		
	}



	
	public Employee updatEmployee(Employee emp, int id) {
		
		Employee exist=employeeRepository.findById(id).orElseThrow();
		
		exist.setName(emp.getName());
		
		exist.setEmpId(emp.getEmpId());
		
		employeeRepository.save(exist);
		
		return exist;
	}



	
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		Employee exists=employeeRepository.findById(id).orElseThrow();
				
		employeeRepository.delete(exists);
		
	}

}

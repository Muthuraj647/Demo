package com.muthu.sampleProject.MailService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muthu.sampleProject.MailService.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}

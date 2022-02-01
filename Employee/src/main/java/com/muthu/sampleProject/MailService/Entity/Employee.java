package com.muthu.sampleProject.MailService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {
	
	@Id
	@Column(name = "EMPID")
	private int empId;
	
	@Column(name = "EMPNAME")
	private String name;
	
	@Column(name = "EMPEMAIL")
	private String mailId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Employee(int empId, String name, String mailId) {
		super();
		this.empId = empId;
		this.name = name;
		this.mailId = mailId;
	}

	public Employee() {
		super();
	}
	
	
	

}

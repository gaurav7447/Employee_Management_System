package com.company.model;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="dept_table")
public class Department {
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "Dept_Name")
	private String name;
	@Column(name = "Dept_Head")
	private String hod;
	@OneToMany(mappedBy = "department")
	
	private List<Employee> employee=new ArrayList<Employee>();
	public Department() {
		super();
		
	}
	public Department(String name, String hod, List<Employee> employee) {
		super();
		this.name = name;
		this.hod = hod;
		this.employee = employee;
	}
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hod
	 */
	public String getHod() {
		return hod;
	}
	/**
	 * @param hod the hod to set
	 */
	public void setHod(String hod) {
		this.hod = hod;
	}
	/**
	 * @return the employee
	 */
	public List<Employee> getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	
	

}

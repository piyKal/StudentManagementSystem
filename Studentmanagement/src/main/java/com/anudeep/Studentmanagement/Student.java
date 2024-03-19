package com.anudeep.Studentmanagement;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

import com.anudeep.MasterEmpAPP.Employee;

@Entity
//@NamedNativeQuery(name="findALL", query = "select * from Student" , resultClass=Employee.class)

public class Student {
	@Id
	private int id ;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public Student(int id, String name, String  address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String  city) {
		this.address = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public static String list() {
		// TODO Auto-generated method stub
		return "select * from student";
	}

}

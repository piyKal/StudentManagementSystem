package com.anudeep.Studentmanagement.diffrent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Myprodoct {
	@Id
	private int id ;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Myprodoct(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Myprodoct() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Myprodoct [id=" + id + ", name=" + name + "]";
	}
	
	

}

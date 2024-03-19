package com.anudeep.Studentmanagement.diffrent;

import javax.persistence.Entity;

@Entity
public class Pen extends Myprodoct{
	private String color;
	public Pen()
	{}
	public Pen(int id, String name, String color) {
		super(id, name);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Pen [color=" + color + "]";
	}
	

}

package com.anudeep.Studentmanagement.diffrent;

import javax.persistence.Entity;

@Entity
public class Book extends Myprodoct{
	@Override
	public String toString() {
		return "Book [author=" + author + "]";
	}

	public Book(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String author) {
		super(id, name);
		this.author = author;
	}

	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}


}

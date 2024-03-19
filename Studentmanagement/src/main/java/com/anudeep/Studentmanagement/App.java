package com.anudeep.Studentmanagement;

import java.util.*;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.anudeep.MasterEmpAPP.Employee;

public class App 
{
	static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    
    {
    	
    	LoginDetails ld= new LoginDetails();
    	//ld.setName("Rajiv");
    //	ld.setPass("1");
    	String name=ld.getName();
    	String pass=ld.getPass();
    	//System.out.println(name + pass);
    //	String name="Rajiv";
    //	String pass="123";
    	System.out.println("Enter the username");
    	String userName=sc.next();
    	System.out.println("Enter the password");
    	String password=sc.next();
    	
		if(name.equals(userName) && pass.equals(password))
			
		{
	     boolean flg=true;
	     while(flg)
	     {
	    	System.out.println("");
	    	System.out.println("1 for insert data ");
	    	System.out.println("2 for delete data ");
	    	System.out.println("3 show the all data is name");
	    	System.out.println("4 find the single student data ");
	    	System.out.println("5 for update the data ");
	    	System.out.println("6 for show all student details");
	    	System.out.println("0 for close program ");
	    	int num=sc.nextInt();
	    	
	     	EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("SachinPamar");
			
		  	EntityManager em  = emf.createEntityManager() ;
		  
	    	switch(num)
	    	{
	    	case 1:
	    		System.out.println("Enter the id ");
	    		 int id=sc.nextInt();
	    		 System.out.println("Enter the name ");
	    		 String name1 =sc.next();
	    		 System.out.println("Enter the your city");
	    		 String city=sc.next();
			     Student s= new Student(id,name1,city);
			     System.out.println(s);
			  	em.getTransaction().begin();
			  	
			  	em.persist(s);
			  	
			  	em.getTransaction().commit();
				em.close();
			  	break;
			  	
	    	case 2:
			  
			  	System.out.println("Enter roll to delete ");
			  	int roll=sc.nextInt();
			  	Student student= em.find(Student.class, roll);
			  	if(student != null){
			  	em.getTransaction().begin();
			  	em.remove(student);
			  	em.getTransaction().commit();
			  	System.out.println("Student removed....");
			  	}else
			  	System.out.println("Student not found...");
			  	System.out.println("done");
			  	em.close();
			  	break;
	    	case 3:
	    		
	    		System.out.println("show all student name");
	    		javax.persistence.Query query = em.createQuery("select name from Student");
	    		List<String> list=query.getResultList();
	    		for(String ss: list)
	    		{
	    			System.out.println(ss);
	    		}
	    		em.getTransaction().begin();
	    		em.getTransaction().commit();
	    	  	em.close();
	    		break;
	    	
	    		
	    	case 4:
	    	  	System.out.println("Enter roll to find student Details ");
			  	int roll1=sc.nextInt();
			  	Student studentSingleData= em.find(Student.class, roll1);
				if(studentSingleData != null){
				  	em.getTransaction().begin();
				  	System.out.println(studentSingleData);
				  	em.getTransaction().commit();
				}
				else 
				{
					System.out.println("Roll nomber is not inserted pls re enter ");
				}
				break;
			  	
	    	case 5:
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter roll to change student name and city");
	    		int roll11=sc.nextInt();
	    		Student student1=em.find(Student.class, roll11); //if it returns the obj then the obj will be in p.state
	    		if(student1 == null){
	    		System.out.println("Student does not exist..");
	    		}
	    		else
	    		{
	    		
	    		System.out.println("Enter the name ");
	    		String name11=sc.next();
	    		System.out.println("Enter the city ");
	    		String address=sc.next();
	    		em.getTransaction().begin();
	    		student1.setName(name11);
	    		student1.setAddress(address);
	    		em.getTransaction().commit();
	    		System.out.println("change  name and city");
	    		}
	    		em.close();
	    		System.out.println("done");
	    		break;
	    
	    	case 6:
	    		System.out.println("show  all table student details");
	    		javax.persistence.Query query1 = em.createQuery("select s from Student s");
	    		List<Student> list1=query1.getResultList();
	    		for(Student ss: list1)
	    		{
	    			System.out.println(ss);
	    		}
	    		em.getTransaction().begin();
	    		em.getTransaction().commit();
	    	  	em.close();
	    		break;
	    		
	    	case 0:
	    		flg=false;
	    		System.out.println("Program closed ");
	    		break;
	    		}
	         }
	  
       	}
		else
		{
			System.out.println("Wrong password");
		}
    }
}

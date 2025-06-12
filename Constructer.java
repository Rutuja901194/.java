package com.project;

public class Constructer {
		
			// TODO Auto-generated method stub
	      String name;
	      int age;

	     public Constructer(String name,int age){
			// TODO Auto-generated constructor stub
		
	    	  this.name=name;
	    	  this.age=age;
	      }
		
	 public static void main(String[]args) {
		 Constructer obj=new Constructer("pooja",23);
		 System.out.println("name is:"+obj.name);
		 System.out.println("age is:"+obj.age);
	}
}

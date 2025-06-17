package com.project;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}
public class customException {
   static void validate(int age)throws InvalidAgeException{
	   if(age<18)
		   throw new InvalidAgeException("Not eligible to vote");
	   else
		   System.out.println("eligibal for vote......");
   }
   public static void main(String[] args) {
	   try {
		   validate(15);
	   }catch (InvalidAgeException e) {
		// TODO: handle exception
		   System.out.println("Exeption:"+e.getMessage());
	}
   }
}

package com.project;

import java.io.File;
import java.io.IOException;
public class Createfile {
public static void main(String[] args)
{
  try {
	  File rs=new File("rutuja.txt");
	  if(rs.createNewFile()) {
		  System.out.println("File Created"+rs.getName());
	  }else
	  {System.out.println("File alredy exists");}
  }	
 catch (IOException e) {
	// TODO: handle exception
	 System.out.println("An error occured");
	 e.printStackTrace();
}
}
}

package com.project;
import java.io.File;
public class deletfile {
   public static void main(String[] args)
   {
	   File file=new File("rutuja.txt");
	   if(file.delete()) {
		   System.out.println("Deleted the file: "+file.getName());
	   }else {
		   System.out.println("failed to delete----");
	   }
   }
}

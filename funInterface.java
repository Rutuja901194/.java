package com.project;

interface FuncInterface{
void abstractFun(int x,int y);
default void normalFun(){
	System.out.println("hello");
}
}
 public class funInterface {

	public static void main(String[] args) {
		FuncInterface fobj=(int x ,int y)->System.out.println(x+y);	
		fobj.abstractFun(5,6);
	}

}
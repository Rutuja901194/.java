package com.project;
class Employee1 {
    private int id;
    private String name; 
    public void setId(int id) { this.id = id;   }
    public void setName(String name) {   this.name = name;  }
    public int getId() {    return id;   }
    public String getName() {   return name;  }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setId(101);
        emp.setName("Greek");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}

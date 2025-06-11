package com.project;

abstract class vehicle {
    // Abstract methods (what it can do)
    abstract void accelerate();
    abstract void brake();
    
    // Concrete method (common to all vehicles)
    void startEngine() {
        System.out.println("Engine started!");
    }
}
//Concrete implementation (hidden details)
 class Car extends vehicle {
 @Override
 void accelerate() {
     System.out.println("Car: Pressing gas pedal...");
     // Hidden complex logic: fuel injection, gear shifting, etc.
 }
 
 @Override
 void brake() {
     System.out.println("Car: Applying brakes...");
     // Hidden logic: hydraulic pressure, brake pads, etc.
 }
}

public class Vehical{
 public static void main(String[] args) {
     vehicle myCar = new Car();
     myCar.startEngine();  
     myCar.accelerate();   
     myCar.brake();        
 }
}
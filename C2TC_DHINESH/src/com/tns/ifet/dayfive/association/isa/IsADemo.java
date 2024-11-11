// Usage of the "IS-A" relationship 
package com.tns.ifet.dayfive.association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("dhinesh", 101, "IT");
		Manager manager = new Manager("gokul", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}
}

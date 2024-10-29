package com.tns.ifet.dayone;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		int x = 100;
		System.out.println("a and b value before the operations: " + a + "\n " + b);
		++a;
		int c = ++a + b + a--;
		System.out.println("c value after the operations: " + c);
		int d = c++ + a + b--;
		System.out.println("d value after the operations: " +d);
		System.out.println("a , b,c,d values afterthe operations: " + a + " " + b + " " + c + " " + d);
		
		 x = (100 == x) ? 1 : 0;
		 System.out.println(x);


	}

}

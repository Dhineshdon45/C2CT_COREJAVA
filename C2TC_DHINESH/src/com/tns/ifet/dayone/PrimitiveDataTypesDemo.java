package com.tns.ifet.dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		byte byteMax = 112;
		byte byteMin = -120;
		System.out.println("Min range of byte is" +
		byteMin+"\n"+"Max range of byte is"+byteMax);
		
		short shortMax = 32463;
		short shortMin = -32448;
		System.out.println("Minshort range of byteis" +shortMin+"\n"+"Maxshort range of byte is"+shortMax);
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Minint range of byte is"+minInt+"\n"+"Maxint range of byte is"+maxInt);
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("Minlong range of byte is"
		+
		minLong+"\n"+"Maxlong range of byte is"+maxLong);
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+"\n"+"double value is "+d);
		boolean flag=true;
		System.out.println("boolean value is "+flag);

	}

}

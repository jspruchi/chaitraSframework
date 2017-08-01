package com.test;

public class DecimalToOctal {
	public static void main(String[] args) {
		int num=12;
		String bin="";
		while(num>0)
		{
			int rem=num%8;
			bin=bin+rem;
			num=num/10;
		}
		System.out.println(bin);
	}

}

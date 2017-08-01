package com.test;

public class ConvertDecimaltoBinary {
	public static void main(String[] args) {
		int num=12;
		String bin="";
		while(num>0)
		{
			int rem=num%2;
			bin=bin+rem;
			num=num/2;
		}
		System.out.println(bin);
		
		
	}

}

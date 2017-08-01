package com.test;

public class DecimaltoHexaDecimal {
	public static void main(String[] args) {
		int n=30;
		String bin="";
		char[]ch={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0)
		{
			int rem=n%16;
			bin=ch[rem]+ bin;
			n=n/16;
		}
		System.out.println(bin);
		
	}

}

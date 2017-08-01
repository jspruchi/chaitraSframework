package com.test;

public class Perfactnumber {
	public static void main(String[] args) {
		int num=6;
		int temp=num;
		int sum=0;
		int val=1;
		while(val<=num/2)
		{
			if(num%val==0)
			{
				sum=sum+val;
				val++;
			}
			
			
			
		}
		
	String msg= sum==temp? temp + " Perfact number":temp+ "  not perfact number";
	System.out.println(msg);
	}

}

package com.test;

public class PrimeNumber {
	public static void main(String[] args) {
		String msg="prime number";
		int num=3;
		if(num>1)
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					msg="not prime";
					break;
				}
			}
		}
		else{
			msg="not prime";
		}
		System.out.println(msg);
	}

}

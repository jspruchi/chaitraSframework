package com.test;

public class FactorialNumber {
	
	public static int fact(int n)
	{
		if(n<=0)
		{
			return 1;
		}
		else
		{
			int res=n*fact(n-1);
			return res;
		}
		
		
		
		
	}
	public static void main(String[] args) {
		int v=fact(3);
		System.out.println(v);
		
	}

}

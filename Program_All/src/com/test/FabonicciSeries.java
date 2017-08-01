package com.test;

public class FabonicciSeries {
	public static void main(String[] args) {
		int n1=0,n2=1,num;
		int howmany=10;
		System.out.print(n1 + " " + n2 + " ");
		for(int i=1;i<=howmany-2;i++)
		{
			num=n1+n2;
			System.out.print(num + " ");
			 
		   n1=n2;
		   n2=num;
		 
		}
	}

}

package com.test;

import java.util.Scanner;

public class AmStrongNumber {
	//this is my first comment.
	/////////////////////////////////////////////////////
	public static void main(String[] args) {
		int sum=0,mod,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			mod=n%10;
			sum=sum+mod*mod*mod;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("number is amstrong");
		}
		else
		{
			System.out.println("number is not amstrong");
		}
		
		
	}

}

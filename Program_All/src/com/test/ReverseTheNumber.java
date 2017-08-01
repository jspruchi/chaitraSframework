package com.test;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int sum=0,mod,n,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			mod=n%10;
			sum=sum*10+mod;
			n=n/10;
			
		}
		System.out.println(sum);
		/*String msg= temp==sum?"Pallindrome": "not in pallindrome";
		System.out.println(msg);*/
	}

}

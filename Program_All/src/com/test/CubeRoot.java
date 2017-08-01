package com.test;

public class CubeRoot {
	public static void main(String[] args) {
		int base=2;
		int power=3;
		int res=1;
		while(power>0)
		{
			res=res*base;
			power--;
			
		}
		System.out.println(res);
	}

}

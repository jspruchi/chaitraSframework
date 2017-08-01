package com.test;

public class Swap_TwoNumber_Without_ThirdVariable {
	public static void main(String[] args) {
		int a=12;
		int b=20;
		System.out.println("................Before Swapping...............");
		System.out.println(a);
		System.out.println(b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("................AfterSwapping..............");
		System.out.println(a);
		System.out.println(b);
	}

}

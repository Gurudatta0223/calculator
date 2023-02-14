package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner As=new Scanner(System.in);
		Calculator cal=new CalculatorImpl();
		while(true) {
		System.out.println("1.Addition\n2.substraction\n3.multiplication\n4.division\n5.exit");
		int choice=As.nextInt();
		int a=0;
		int b=0;
		if(choice>=0 && choice<=4) {
			System.out.println("enter 2 number");
			a=As.nextInt();
			b=As.nextInt();}
		switch(choice) {
		case 1:{
			System.out.println("sum of "+a+" & "+b+" is "+cal.add(a, b));
			break;
		}
		case 2:{
			System.out.println("difference of "+a+" & "+b+" is "+cal.sub(a,b));
			break;}
		case 3:{
			System.out.println("product of "+a+" & "+b+" is "+cal.mul(a,b));
			break;}
		case 4:{
			int result =cal.div(a, b);
			if(result!=0) {
			System.out.println("division of "+a+" & "+b+" is "+result);
			}
			else {
				System.out.println("con't perform division");
			}
			break;}
		case 5:{
			System.out.println("thank you");
			System.exit(0);//system.exit is a static method 
		}

		default :
			System.out.println(cal.displayErrorMessage());
		}
		System.out.println("============");
	}
	}
}

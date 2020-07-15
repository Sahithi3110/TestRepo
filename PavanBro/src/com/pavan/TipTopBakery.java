package com.pavan;

import java.util.Scanner;

public class TipTopBakery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bread Type: ");
		String type=sc.next();
		System.out.println("Enter no of calories: ");
		int calories=sc.nextInt();
		Bread b=new Bread(type,calories);
		System.out.println("Enter the filling: ");
		String filling =sc.next();
		System.out.println("Enter the calories per serving: ");
		int serving= sc.nextInt();
		Filling f=new Filling(filling,serving);
		Sandwich s=new Sandwich(b,f);
		int totcalories=s.getBread().getCaloriesPerSlice()+s.getFilling().getCaloriesPerServing();
		System.out.println("This sandwich has two slices of "+s.getBread().getBreadType()+" bread ("+s.getBread().getCaloriesPerSlice()
				+" calories per slice) with "+s.getFilling().getFillingType()+" filling ("+s.getFilling().getCaloriesPerServing()+
				" calories per serving). The total number of calories for the sandwich is "+totcalories);
		sc.close();
		
	}

}

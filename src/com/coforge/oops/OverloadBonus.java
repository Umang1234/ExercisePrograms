package com.coforge.oops;
import java.util.Scanner;

public class OverloadBonus {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Designation: ");
		String designation = sc.nextLine();

		EmployeeBonus eb = new EmployeeBonus("Amar","Programmer");
		EmployeeBonus eb2 = new EmployeeBonus("Akbar","Manager");
		EmployeeBonus eb3 = new EmployeeBonus("Anthony","Director");

		if(designation.equalsIgnoreCase("Programmer"))
		{
			System.out.println("Name: "+eb.name);
			System.out.println("BasicAllowance: "+eb.calcBonus(500));
		}
		else if(designation.equalsIgnoreCase("Manager"))
		{
			System.out.println("Name: "+eb2.name);
			System.out.println("BasicAllowance: "+eb2.calcBonus(500,1000));
		}
		else if(designation.equalsIgnoreCase("Director"))
		{
			System.out.println("Name: "+eb3.name);
			System.out.println("BasicAllowance: "+eb3.calcBonus(500,1000,500));
		}
		else
		{
			System.out.println("Wrong Entry");
		}
	}

}

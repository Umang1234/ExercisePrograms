package com.coforge.exce;
import java.util.*;

public class Regsiter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		try {
			String name = sc.next();
		Validation val = new Validation();	
		if(val.checkUser(name)) 
		System.out.println("Enter pass");
		String pass = sc.next();
		val.checkPass(pass);
		System.out.println("you are registered");

		}catch(NameExistException | TooShortException | TooLongException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}

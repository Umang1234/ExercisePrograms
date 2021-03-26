//1
/*
package com.coforge.oops;
import java.util.*;
public class Register {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Validation val = new Validation();
		
		if(val.checkName(name)) { 
			System.out.println("pls enter a new name");
		}
	else {
			System.out.println("u r registered succesfully");
		}
		sc.close();
	}
}
*/
//2
/*
package com.coforge.oops;
import java.util.*;
public class Register {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		try {
		Validation val = new Validation();	
		if(val.checkName(name)) 
			System.out.println("you are registered");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
*/
//3
/*
package com.coforge.oops;
import java.util.*;
public class Register {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		try {
		Validation val = new Validation();	
		if(val.checkName(name)) 
			System.out.println("you are registered");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
*/
//4

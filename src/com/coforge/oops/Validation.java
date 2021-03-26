//1
/*
package com.coforge.oops;

public class Validation {

	boolean checkName(String name) {
		String[] names= {"amar","akbar","anthony"};
		for(String val :names) {
			if(val.equals(name))
			{
				return true;
			}
		}
		return false;
	}

}
*/
//2
/*
package com.coforge.oops;

public class Validation {

	boolean checkName(String name) throws Exception {
		String[] names= {"amar","akbar","anthony"};
		for(String val :names) {
			if(val.equals(name))
			{
				throw new Exception("name already exists");
			}
		}
		return true;
	}

}
*/
//3
/*
package com.coforge.oops;

public class Validation {

	public boolean checkName(String name) throws Exception {
		String[] names= {"amar","akbar","anthony"};
		try{
		for(String val :names) {
			if(val.equals(name))
			{
				throw new Exception("name already exists");
			}
		}
		} catch (Exception e) {
			System.out.println("Error...");
			throw e;
		}
		return true;
	}
}
*/
//4

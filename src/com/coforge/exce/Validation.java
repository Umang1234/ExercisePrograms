package com.coforge.exce;

public class Validation {
	public boolean checkUser(String name) throws NameExistException {
		String[] names = { "amar", "akbar", "anthony" };
		try {
			for (String val : names) {
				if (val.equals(name)) {
					throw new NameExistException("name already exists");
				}
			}
		} catch (NameExistException e) {
			System.out.println("Error...");
			throw e;
		}
		return true;
	}

	public void checkPass(String pass)throws TooShortException,TooLongException{
		if(pass.length()<5)
		{
			throw new TooShortException("enter atleast 8 digits");
		}
		else if (pass.length()>15) 
		{
			throw new TooLongException("enter upto 15 digits");
		}
		else
			System.out.println("Great password");
		}
}


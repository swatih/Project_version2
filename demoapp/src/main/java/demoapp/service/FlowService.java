package demoapp.service;

import demoapp.model.Person;

public class FlowService {

	
		 
		public String performLogin(Person loginCredentials) 
		{
		 try
		 {
		if(loginCredentials.getEmail() != null && loginCredentials.getEmail().trim().equalsIgnoreCase("alba")
		&& loginCredentials.getPassword() != null && loginCredentials.getPassword().trim().equalsIgnoreCase("pass"))
		{
		//user successfully logged in
		return "success";
		} 
		else {
		System.out.println("ok error");
		return "error";
		}
		 }
		 catch(Exception e)
		 {System.out.println(e);
		 return e.toString();
		 }
		 }
		}

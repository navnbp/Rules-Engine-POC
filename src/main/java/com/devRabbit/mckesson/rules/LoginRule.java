package com.devRabbit.mckesson.rules;

import org.easyrules.annotation.Action;

import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

import com.devRabbit.mckesson.model.User;

@Rule(name="login rule") 
public class LoginRule {
	
	private User user;
	private boolean status=false;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LoginRule() {}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LoginRule(User user) {
		super();
		this.user = user;
	}

	@Condition 
	public boolean validateUser() 
	{
		if(user.getUsername().equalsIgnoreCase("user") && user.getPassword().equals("password"))
			status=true;
		return status;
	}
	
	@Action
	public boolean afterLogin() 
	{
		
		//System.out.println("Logged in Sucessfully");
		return status;
		
	}

}

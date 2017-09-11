package com.devRabbit.mckesson.service.implementation;

import org.easyrules.api.RulesEngine;
import org.easyrules.core.RulesEngineBuilder;
import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.model.User;
import com.devRabbit.mckesson.rules.LoginRule;
import com.devRabbit.mckesson.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		
		LoginRule loginRule= new LoginRule(); 
		loginRule.setUser(user); 
		RulesEngine rulesEngine = RulesEngineBuilder.aNewRulesEngine().build();
		rulesEngine.registerRule(loginRule);
		System.out.println("User Service Impl1");
		rulesEngine.fireRules();
		System.out.println("User Service Impl2");
		return true;
		
	}

}

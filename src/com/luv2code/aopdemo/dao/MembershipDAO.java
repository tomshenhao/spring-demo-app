package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public void addMember() {
		
		System.out.println(getClass()+": doing stuff: adding a memebership account");
		
	}

}

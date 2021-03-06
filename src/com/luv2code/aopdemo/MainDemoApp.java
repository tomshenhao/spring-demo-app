package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
		
		//call the business method
		Account theAccount=new Account();
		theAccountDAO.addAccount(theAccount, true);
		theAccountDAO.doWork();
		
		System.out.println("==========================================");
		
		theMembershipDAO.addMember();
		theMembershipDAO.goToSleep();
		
		//close the context
		context.close();
		
	}

}

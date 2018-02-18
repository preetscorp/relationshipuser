package com.example.user.relationshipuser.repository;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.user.relationshipuser.entity.User;
import com.example.user.relationshipuser.entity.UserContact;
import com.example.user.relationshipuser.entity.UserLogs;

@Component
public class UserContactCommandLine implements CommandLineRunner{
	@Autowired
	UserContactRepository repos;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inside command line!");
		User user  = new User();
		UserLogs userLog = new UserLogs();
		userLog.setLogs("Settung value1");
		
		UserLogs userlogs = new UserLogs();
		userlogs.setLogs("Reading the value1");
		user.setName("Preethi").setSalary(new BigDecimal(1000)).setTeamName("RBS").setUserLogs(Arrays.asList(userLog,userlogs));
		UserContact userContact = new UserContact();
		userContact.setPhoneNo(new Long(9884177))
				   .setUser(user);
	
		////Second user value..
		User user1  = new User();
		
		UserLogs userLogs1 = new UserLogs();
		userLogs1.setLogs("Setting the second value!!");
		user1.setName("Maha").setSalary(new BigDecimal(1000)).setTeamName("CSG").setUserLogs(Arrays.asList(userLogs1));
		UserContact userContact1 = new UserContact();
		userContact1.setPhoneNo(new Long(98841778))
				   .setUser(user1);
		
		repos.save(Arrays.asList(userContact,userContact1));
		
		System.out.println(repos.findAll());
	}

}

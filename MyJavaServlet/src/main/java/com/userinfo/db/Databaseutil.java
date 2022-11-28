package com.userinfo.db;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.userform.dto.User;

public class Databaseutil {
	private static ArrayList<User> userobj=new ArrayList<User>();
	public static void save(User user) {
		userobj.add(user);
	}
	
	public static List<User> getAllUsers(){
		return userobj;
	}
	
	public static User getUser(UUID id) {
		
		User userObj = null;
		
		for (User user : userobj) {
			
			if(user.getId().equals(id)) {
				userObj = user;
				break;
			}
		}
		
		return userObj;
		
	}
}




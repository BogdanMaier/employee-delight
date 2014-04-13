package com.up.employeedelight.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.up.employeedelight.repository.UserGroupRepository;

@Service
public class UserGroupManager {
	@Autowired
	UserGroupRepository userGroupRepo;
	
	public int getGroupId(String name){
		int i = 0;
		i =	userGroupRepo.findByName(name).getId();
		System.out.println("===================" + i);
		return i;
	}
}

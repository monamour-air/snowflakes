package com.sun.stone.freelancer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.stone.freelancer.bean.UsersEntity;
import com.sun.stone.freelancer.mapper.UsersMapper;

@Service
public class UsersService {
	@Autowired
	private UsersMapper usersMapper;
	
	/**
	 * 查找所有用户
	 * @return
	 */
	public List<UsersEntity> findAllUsers(){
		return usersMapper.findAllUsers();
	}
	
	/**
	 * 根据id查找用户
	 * @param id
	 * @return
	 */
	public UsersEntity queryUserById(int id) {
		return usersMapper.queryUserById(id);
	}
}

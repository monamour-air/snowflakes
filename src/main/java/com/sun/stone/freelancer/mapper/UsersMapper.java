package com.sun.stone.freelancer.mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sun.stone.freelancer.bean.UsersEntity;

//@Mapper 每个Mapper都需要加注解，这种方式比较麻烦
public interface UsersMapper {
	@Select("SELECT * FROM users;")
	List<UsersEntity> findAllUsers();

	UsersEntity queryUserById(int id);
}

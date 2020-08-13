package com.mapper;

import org.apache.ibatis.annotations.Select;

import com.pojo.Users;

public interface UsersMapper {

	@Select("select * from users where username=#{username} and password=#{password}")
	Users selByUsersPwd(Users users);
}

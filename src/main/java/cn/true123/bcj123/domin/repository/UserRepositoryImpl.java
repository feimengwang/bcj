package cn.true123.bcj123.domin.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.true123.bcj123.domin.User;
import cn.true123.bcj123.mapper.UserMapper;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	UserMapper userMapper;

	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectUserById(id);
	}

	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userMapper.selectUserByName(name);
	}

	public List findAllUser() {
		// TODO Auto-generated method stub
		return userMapper.findAllUser();
	}

}

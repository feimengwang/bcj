package cn.true123.bcj123.dao;

import java.util.List;

import cn.true123.bcj123.domin.User;

public interface UserServiceDAO {
	public User findUserById(Integer id);

	public User findUserByName(String name);

	public List findAllUser();
}

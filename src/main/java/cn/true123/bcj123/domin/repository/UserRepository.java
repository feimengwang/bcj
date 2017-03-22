package cn.true123.bcj123.domin.repository;

import java.util.List;

import cn.true123.bcj123.domin.User;

public interface UserRepository {
	public User findUserById(Integer id);

	public User findUserByName(String name);

	public List findAllUser();
	public void insert(User user);
}

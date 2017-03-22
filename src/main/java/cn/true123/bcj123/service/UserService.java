package cn.true123.bcj123.service;


import java.util.List;

import cn.true123.bcj123.domin.User;

public interface UserService {
	public boolean login(User u);

	public boolean logout(Integer id);

	public User findUserById(Integer id);
	public User findUserByName(String name);
	public List findAllUser();
	public void insert(User user);
}

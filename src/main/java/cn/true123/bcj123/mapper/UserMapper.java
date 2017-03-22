package cn.true123.bcj123.mapper;

import java.util.List;

import cn.true123.bcj123.domin.User;

public interface UserMapper {
	public User selectUserById(Integer id);
	public User selectUserByName(String name);
	public List findAllUser();
	public void insert(User user);
}

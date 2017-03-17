package cn.true123.bcj123.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.true123.bcj123.dao.UserServiceDAO;
import cn.true123.bcj123.domin.User;

@Service(value="UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserServiceDAO userServiceDAO;

	public boolean login(User u) {
		User dbUser = findUserByName(u.getName());
		if (dbUser != null) {
			if (dbUser.getPassword().equals(u.getPassword()))
				return true;
		}

		return false;
	}

	public boolean logout(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userServiceDAO.findUserById(id);
	}

	public List findAllUser() {
		// TODO Auto-generated method stub
		return userServiceDAO.findAllUser();
	}

	public User findUserByName(String name) {
		// TODO Auto-generated method stub
		return userServiceDAO.findUserByName(name);
	}

}

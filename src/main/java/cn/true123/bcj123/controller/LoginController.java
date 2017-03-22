package cn.true123.bcj123.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.true123.bcj123.domin.User;
import cn.true123.bcj123.service.UserService;

@Controller
public class LoginController extends BaseController {
	@Autowired
	public UserService UserService;
	@RequestMapping(method = RequestMethod.GET,value="/login")
	public String login() {
		
			return "login";
		
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@Valid User user,Errors errors) {
		System.out.println(user);
		if(errors.hasFieldErrors()){
			java.util.List<ObjectError> list  = errors.getAllErrors();
			for(ObjectError e:list){
				System.out.println(e.getObjectName());
				System.out.println(e.getDefaultMessage());
			}
			return "login";
		}
		UserService.insert(user);
		System.out.println(user);
		return "redirect:/";
	}
}

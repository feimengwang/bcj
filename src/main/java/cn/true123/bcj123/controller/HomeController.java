package cn.true123.bcj123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "index";
	}
}

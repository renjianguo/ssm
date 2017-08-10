package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xhhy.domain.UserBean;
import com.xhhy.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("list.do")
	public String list(Model model){
		System.out.println("----------------------");
		List<UserBean> users = userService.queryAll();
		/*for(UserBean u :users){
			System.out.println(u);
		}*/
		
		model.addAttribute("users",users);
		return "/index.jsp";
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}

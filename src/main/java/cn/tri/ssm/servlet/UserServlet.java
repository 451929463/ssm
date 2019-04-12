package cn.tri.ssm.servlet;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tri.ssm.pojo.User;
import cn.tri.ssm.service.UserService;

@Controller
public class UserServlet {
	@Autowired
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping("userFindAll.action")
	public String findAll(Model model) {
		model.addAttribute("list", userService.findAll());
		return "result";
	}
}

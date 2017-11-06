package cn.helloan.controller;

import cn.helloan.entity.User;
import cn.helloan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/test") 
public class LoginController {
	@Autowired
	private UserService userService;

@RequestMapping("/dologin.do") //url
public String dologin(User user, Model model){
	if(userService.doUserLogin(user)){
		model.addAttribute("successMsg", "登陆成功！");//���ص�ҳ��˵�д�Ĳ���
		model.addAttribute("name", user.getUsername());
		return "/success";//���ص�ҳ��
	}else{
		model.addAttribute("failMsg", "登录失败");
		return "/fail";
	}	
}
}

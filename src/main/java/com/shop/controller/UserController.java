package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.domain.ItemCustom;
import com.shop.domain.UserCustom;
import com.shop.service.ItemsService;
import com.shop.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/index")
	public String index(Model model) throws Exception{
		List<ItemCustom> listItems = itemsService.findNewComing();	
		model.addAttribute("listItems", listItems);
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping("registerUser")
	public String registerUser(Model model,
			String repassword, @Validated UserCustom userCustom, 
			BindingResult bindingResult)throws Exception{
		
		if(bindingResult.hasErrors()){
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("user", userCustom);
			return "register";
		}
		System.out.println(userCustom.getPassword() + " " + repassword);
		if(!userCustom.getPassword().equals(repassword)){
			String error = "Password is different";
			model.addAttribute("error", error);
			model.addAttribute("user", userCustom);
			return "register";
		}
		
		userService.insert(userCustom);
		
		return "redirect:/login";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(Model model, HttpSession session, String username, String password) throws Exception{
		UserCustom user = new UserCustom();
		user.setUsername(username);
		user.setPassword(password);
	
		UserCustom _user = userService.findUser(user);
		if(_user == null){
			String error = "Username or Password wrong";
			model.addAttribute("error", error);
			return "login";
		}
		session.setAttribute("username", username);
		return "redirect:/index";		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/index";
	}
	
	
	
	@RequestMapping("/findUserByName")
	public void findUserByName(String username, HttpServletResponse response)throws Exception{
		UserCustom _user = new UserCustom();
		_user.setUsername(username);
		UserCustom existUser = userService.findUser(_user);
		
		if(existUser == null){
			response.getWriter().println("<font color='green'><b>correct</b></font>");
		}else{
			
			response.getWriter().println("<font color='red'><b>username has been used</b></font>");
		}
		//return "";
	}
	
}

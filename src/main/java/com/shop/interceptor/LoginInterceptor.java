package com.shop.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp,
			Object arg2) throws Exception {
		
		String url = req.getRequestURI();
		if(url.indexOf("login")>=0 || url.indexOf("index")>=0){
			return true;
		}
		
		HttpSession session = req.getSession();
		String username = (String)session.getAttribute("username");
		if(username != null){
			return true;
		}
		
		//req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
		resp.sendRedirect("/ssm_shop/login");
		return false;
	}
	
}

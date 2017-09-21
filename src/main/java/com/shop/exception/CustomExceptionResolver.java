package com.shop.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest req,
			HttpServletResponse resp, Object arg2, Exception exception) {
		
		CustomException ce = null;
		if(exception instanceof CustomException){
			ce = (CustomException)exception;
		}else {
			ce = new CustomException("Unknown Error");
		}
		
		String message = ce.getMessage();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", message);
		mv.setViewName("error");
		return mv;
	}
	
}

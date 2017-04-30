package com.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyCustomInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
		
		System.out.println(arg0.getQueryString());
		arg1.setHeader("Avinash_After_Completion", "Tiwari_After_Completion");
		System.out.println("Avi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		arg1.setHeader("Avinash_postHandle", "Tiwari_postHandle");
		System.out.println("Avi1");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Auery Sring" + arg0.getQueryString());
		arg1.setHeader("Avinash_preHandle", "Tiwari_preHandle");
		arg1.setHeader("Access-Control-Expose-Headers" ,"Authorization, X-Custom-header,Avinash_preHandle");
		System.out.println("Avi");
		return true;
	}

}

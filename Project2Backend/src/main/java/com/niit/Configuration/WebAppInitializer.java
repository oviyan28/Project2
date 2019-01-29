package com.niit.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("In getRootConfigClasses method");
		return new Class[]{WebAppConfig.class};
	
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("In getServletConfigClasses method");
		return null;
	
		
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("in getServletMappings method");
		return new String[]{"/"};//any requests forwarded to DispatcherServlet
	
	}

}

package com.ashu.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
	public class HomeSpring extends AbstractController{

		@Override
		protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
				HttpServletResponse arg1) throws Exception {
			ModelAndView model = new ModelAndView("home");
		      model.addObject("welcome");
			return null;
		}

	
	

}

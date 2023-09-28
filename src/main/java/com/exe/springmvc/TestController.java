package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test.controller")
public class TestController {
	
	/*
	 * @RequestMapping(value = "/test/param.action", method = RequestMethod.GET)
	 * public String processGetRequest() {
	 * 
	 * System.out.println("GET��� Request");
	 * 
	 * return "paramResult"; }
	 * 
	 * @RequestMapping(value = "/test/param.action", method = RequestMethod.POST)
	 * public String processPostRequest() {
	 * 
	 * System.out.println("Post��� Request");
	 * 
	 * return "paramResult"; }
	 */
	
	@RequestMapping(value = "/test/param.action",
			method = {RequestMethod.POST,RequestMethod.GET})
	 public String ��ġ���(PersonDTO dto, String name,
			 HttpServletRequest request) {
		
		System.out.println("GET/POST ��� Requst");
		System.out.println(name);
		System.out.println(request.getParameter("phone"));
		
		System.out.println(dto);
		System.out.println(dto.getName());
		System.out.println(dto.getPhone());
		System.out.println(dto.getEmail());
		
		return "paramResult";
	}
	
	@RequestMapping(value = "/test/mav.action",
			method = {RequestMethod.POST,RequestMethod.GET})
	 public ModelAndView �������(PersonDTO dto) {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("dto",dto);//model
		mav.setViewName("paramResult");//view
		String ��ġ = "����";
		mav.addObject(��ġ);
		
		return mav;
	}
	
	@RequestMapping(value = "/test/redirect.action",
			method = {RequestMethod.POST,RequestMethod.GET})
	 public String ���κ��() {
		
		//return "redirect:/";
		//return "redirect:/hello.action";
		return "hello";
	}
	
}

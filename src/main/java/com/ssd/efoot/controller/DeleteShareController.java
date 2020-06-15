package com.ssd.efoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteShareController {
	@RequestMapping("/share/shDel.do")
    public ModelAndView handleRequest
    	(@ModelAttribute("userSession") UserSession userSession,
         @RequestParam("shId") String shId) {
		//구현해야함
		ModelAndView mv = null ;
		return mv;
	}
}

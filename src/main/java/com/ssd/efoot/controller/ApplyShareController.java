package com.ssd.efoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("sessionApplyer")
public class ApplyShareController {
	@RequestMapping("/share/apply.do") 
          public ModelAndView handleRequest( @RequestParam("shId") String shId,    
                                                                       @ModelAttribute("sessionApplyer") String userId ) 
}

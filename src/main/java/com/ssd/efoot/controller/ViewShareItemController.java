package com.ssd.efoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewShareItemController {
@RequestMapping("/share/viewShareItem.do")
	public String handleRequest(@RequestParam("itemId") String itemId, ModelMap model)
	
	}

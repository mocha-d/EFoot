package com.ssd.efoot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("ShareList")
public class ViewShareListController {
@RequestMapping("/share/shareList.do")
public String handleRequest(@RequestParam("itemId") ModelMap model)
}

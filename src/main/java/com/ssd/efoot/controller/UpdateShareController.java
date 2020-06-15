package com.ssd.efoot.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssd.efoot.domain.Share;

@Controller
@RequestMapping({"/shop/updateShare.do"})
public class UpdateShareController {

   @RequestMapping(method = RequestMethod.GET)
   public String showItem() {
      return formViewName;
   }

   @RequestMapping(method = RequestMethod.POST)
   public String onSubmit(HttpServletRequest request, HttpSession session,
   @ModelAttribute("share") Share share,
   BindingResult result) throws Exception {
   }
}


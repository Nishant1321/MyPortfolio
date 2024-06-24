package com.example.MyWebsite.demo.MyWebSite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.MyWebsite.demo.MyWebSite.entity.HirePage;

import com.example.MyWebsite.demo.MyWebSite.services.HirePageServices;

import jakarta.validation.Valid;

@Controller
public class HirePageController {
	@Autowired
private HirePageServices hirePageServices;

	@GetMapping("/hireme")
	public String hireMe(Model model) {
	    model.addAttribute("hirepage", new HirePage());
	    return "hirepage";
	}	
	@PostMapping("/hirepagestatus")
	public String getHirePageStatus(@Valid @ModelAttribute("hirepage") HirePage hirepage, BindingResult bindingResult) {
		System.out.println(bindingResult.getAllErrors());
	  if (bindingResult.hasErrors()) {
	       return "hirepage";
	   }
	  hirePageServices.saveRegistered(hirepage);
	  return "redirect:/hireme";
	}
	
	
	
	
	@GetMapping("/hirepagelist")
	public String getHirePageList(Model model) {
	    List<HirePage> hirepagelist = hirePageServices.HirePageList();
	    model.addAttribute("hirepagelist", hirepagelist);
	    return "hirepageform";
	}
	@PostMapping("/hirepage/delete")
	public String gethireDelete(@RequestParam("id") int id, Model model) {
		hirePageServices.deleteById(id);
	    String deleteMessage = "hire page service successfully deleted with ID: " + id;
	    model.addAttribute("message", deleteMessage);
	    return "redirect:/hirepagelist";
	}
}

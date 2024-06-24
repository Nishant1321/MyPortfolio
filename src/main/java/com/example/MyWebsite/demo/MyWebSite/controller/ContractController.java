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

import com.example.MyWebsite.demo.MyWebSite.entity.Contact;
import com.example.MyWebsite.demo.MyWebSite.services.ContactServices;


import jakarta.validation.Valid;

@Controller
public class ContractController {
	@Autowired
	private ContactServices contactServices;
	

		
	@GetMapping("/admindashboard")
	public String getadminDashBoard() {
		return "adminDashboard";
		
	}
	
    @GetMapping("/index")
    public String showPortfolioPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "index";
    }
	
	
	 @PostMapping("/contactstatus")
	    public String getContactStatus(@Valid @ModelAttribute("contact") Contact contact, BindingResult bindingResult) {
	    	System.out.println(bindingResult.getAllErrors());
	      if (bindingResult.hasErrors()) {
	           return "contact";
	       }
	      contactServices.saveRegistered(contact) ;
	      return "redirect:/index";
	 }
	    @GetMapping("/contactuslist")
	    public String getContactUsList(Model model) {
	        List<Contact> contactlist = contactServices.contactList();
	        model.addAttribute("contactlist", contactlist);
	        return "userform";
	    }
	    @PostMapping("/contact/delete")
	    public String getContactDelete(@RequestParam("id") int id, Model model) {
	    	contactServices.deleteById(id);
	        String deleteMessage = "Contact Us service successfully deleted with ID: " + id;
	        model.addAttribute("message", deleteMessage);
	        return "redirect:/contactuslist";
	    }
}

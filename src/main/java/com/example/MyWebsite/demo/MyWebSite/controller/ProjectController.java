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


import com.example.MyWebsite.demo.MyWebSite.entity.Project;
import com.example.MyWebsite.demo.MyWebSite.services.ProjectService;


import jakarta.validation.Valid;

@Controller
public class ProjectController {
@Autowired
	private ProjectService projectService;

@GetMapping("/project")
public String Project(Model model) {
 List<Project> projectlist = projectService.projectList();
    model.addAttribute("projectlist", projectlist);
    return "projects";
}


@GetMapping("/Allproject")
public String allProject(Model model) {
    model.addAttribute("project", new Project());
    return "projectadmin";
}
@PostMapping("/projectstatus")
public String getContactStatus(@Valid @ModelAttribute("project") Project project, BindingResult bindingResult) {
	System.out.println(bindingResult.getAllErrors());
  if (bindingResult.hasErrors()) {
       return "projectadmin";
   }
  projectService.saveRegistered(project);
  return "redirect:/projectlist";
}
	

@GetMapping("/projectlist")
public String getProjectList(Model model) {
    List<Project> projectlist = projectService.projectList();
    model.addAttribute("projectlist", projectlist);
    return "projectcategory";
}
@PostMapping("/project/delete")
public String getContactDelete(@RequestParam("id") int id, Model model) {
	projectService.deleteById(id);
    String deleteMessage = "project service successfully deleted with ID: " + id;
    model.addAttribute("message", deleteMessage);
    return "redirect:/projectlist";
}
@GetMapping("/project/edit")
public String getEditForm(@RequestParam("id") int id ,Model model) {
Project project=	projectService.findById(id);

	model.addAttribute("project",project);
	
return "update-project";

}
@PostMapping("/saveprojectstatus")
public String getUpdate(@Valid @ModelAttribute("project") Project project,BindingResult bindingResult) {
	
	if(bindingResult.hasErrors()) {
	return "update-project";
	}
	projectService.updateProject(project);
	
	return "redirect:/projectlist";
	
}

}

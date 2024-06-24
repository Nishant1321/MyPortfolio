package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;


import com.example.MyWebsite.demo.MyWebSite.entity.Project;

public interface ProjectService {

	
	
	public Project saveRegistered(Project project );
	public List<Project>projectList();
	public void deleteById(int id);
	public Project findById(int id);
	
	public Project updateProject(Project project);
}

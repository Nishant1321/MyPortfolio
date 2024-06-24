package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.MyWebsite.demo.MyWebSite.entity.Project;
import com.example.MyWebsite.demo.MyWebSite.entity.Repository.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepo projectrepo;
	@Override
	public Project saveRegistered(Project project) {
		// TODO Auto-generated method stub
		return projectrepo.save(project);
	}

	@Override
	public List<Project> projectList() {
		// TODO Auto-generated method stub
		List<Project>findAll=projectrepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		projectrepo.deleteById(id);
	}

	@Override
	public Project findById(int id) {
		// TODO Auto-generated method stub
		Optional<Project>findById=projectrepo.findById(id);
		Project project=findById.get();
		return project;
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		return projectrepo.save(project);
	}

}

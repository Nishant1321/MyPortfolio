package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.MyWebsite.demo.MyWebSite.entity.HirePage;
import com.example.MyWebsite.demo.MyWebSite.entity.Repository.HirePageRepo;
@Service
public class HirePageServicesImpl implements HirePageServices {

	@Autowired
	private HirePageRepo hirePageRepo;
	public HirePage saveRegistered(HirePage hirePage) {
		// TODO Auto-generated method stub
		return hirePageRepo.save(hirePage);
	}

	
	public List<HirePage> HirePageList() {
		// TODO Auto-generated method stub
		List<HirePage>findAll=hirePageRepo.findAll();
		return findAll;
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		hirePageRepo.deleteById(id);
	}

	@Override
	public HirePage findById(int id) {
		// TODO Auto-generated method stub
		Optional<HirePage>findById=hirePageRepo.findById(id);
		HirePage hirePage=findById.get();
		return hirePage;
	}

	@Override
	public HirePage updateHirePage(HirePage hirePage) {
		// TODO Auto-generated method stub
		return hirePageRepo.save(hirePage);
	}

}

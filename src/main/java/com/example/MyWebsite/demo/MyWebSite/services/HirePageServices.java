package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;


import com.example.MyWebsite.demo.MyWebSite.entity.HirePage;

public interface HirePageServices {

	
	
	public HirePage saveRegistered(HirePage hirePage );
	public List<HirePage>HirePageList();
	public void deleteById(int id);
	public HirePage findById(int id);
	
	public HirePage updateHirePage(HirePage hirePage);
}

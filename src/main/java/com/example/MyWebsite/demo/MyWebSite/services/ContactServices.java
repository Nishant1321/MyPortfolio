package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;

import com.example.MyWebsite.demo.MyWebSite.entity.Contact;


public interface ContactServices {


	public Contact saveRegistered(Contact contact );
	public List<Contact>contactList();
	public void deleteById(int id);
	public Contact findById(int id);
	
	public Contact updateContactUs(Contact contact);
}

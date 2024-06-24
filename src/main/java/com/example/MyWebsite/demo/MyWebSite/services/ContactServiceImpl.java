package com.example.MyWebsite.demo.MyWebSite.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MyWebsite.demo.MyWebSite.entity.Contact;
import com.example.MyWebsite.demo.MyWebSite.entity.Repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactServices{
	@Autowired
	private ContactRepo contactrepo;

	@Override
	public Contact saveRegistered(Contact contact) {
		// TODO Auto-generated method stub
		return contactrepo.save(contact);
	}

	@Override
	public List<Contact> contactList() {
		// TODO Auto-generated method stub
		List<Contact>findAll=contactrepo.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		contactrepo.deleteById(id);
	}

	@Override
	public Contact findById(int id) {
		// TODO Auto-generated method stub
		Optional<Contact>findById=contactrepo.findById(id);
		Contact contact=findById.get();
		return contact;
	}

	@Override
	public Contact updateContactUs(Contact contact) {
		// TODO Auto-generated method stub
		return contactrepo.save(contact) ;
	}

}

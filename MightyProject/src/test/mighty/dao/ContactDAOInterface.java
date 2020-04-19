package test.mighty.dao;

import java.util.List;

import test.mighty.entity.Contact;

public interface ContactDAOInterface {

	public Contact getContact(int id);
	
	public List<Contact> getContactList();
	
	public void saveContact(Contact contact);
	
	public void deleteContact(int id);
	
}

package test.mighty.dao;

import java.util.List;

import test.mighty.entity.Newsletter;

public interface NewsletterDAOInterface {
	
	public Newsletter getNewsletter(int id);
	
	public void saveNewsletter(Newsletter newsletter);
	
	public void deleteNewsletter(int id);
	
	public List<Newsletter> getNewsletterList();

}

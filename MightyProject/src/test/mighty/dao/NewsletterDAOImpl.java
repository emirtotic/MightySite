package test.mighty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.mighty.entity.Newsletter;

@Repository
public class NewsletterDAOImpl implements NewsletterDAOInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public Newsletter getNewsletter(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Newsletter newsletter = session.get(Newsletter.class, id);
		
		return newsletter;
	}

	@Transactional
	@Override
	public void saveNewsletter(Newsletter newsletter) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(newsletter);

	}

	@Transactional
	@Override
	public void deleteNewsletter(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Newsletter where id=:id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();
		
	}

	@Transactional
	@Override
	public List<Newsletter> getNewsletterList() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Newsletter> query = session.createQuery("from Newsletter", Newsletter.class);
		
		List<Newsletter> newsletterList = query.getResultList();
		
		return newsletterList;
	}

}

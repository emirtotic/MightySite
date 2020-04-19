package test.mighty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.mighty.entity.Projects;
import test.mighty.entity.Workers;

@Repository
public class WorkersDAOImpl implements WorkersDAOInterface {
	
	@Autowired
	private SessionFactory sessionFacrory;

	@Transactional
	@Override
	public Workers getWorkers(int id) {
		
		Session session = sessionFacrory.getCurrentSession();
		
		Workers worker = session.get(Workers.class, id);
		
		return worker;
	}

	@Transactional
	@Override
	public List<Workers> getWorkersList() {
		
		Session session = sessionFacrory.getCurrentSession();
		
		Query<Workers> query = session.createQuery("from Workers", Workers.class);
		
		List<Workers> workersList = query.getResultList();
		
		return workersList;
	}

	@Transactional
	@Override
	public void saveWorkers(Workers worker) {
		
		Session session = sessionFacrory.getCurrentSession();
		
		session.saveOrUpdate(worker);

	}

	@Transactional
	@Override
	public void deleteWorkers(int id) {
		
		Session session = sessionFacrory.getCurrentSession();
		
		Query query = session.createQuery("delete from Workers where id=:id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();

	}
	
	@Transactional
	@Override
	public List<Workers> getWorkersOnPage() {
		
		Session session = sessionFacrory.getCurrentSession();
		
		Query<Workers> query = session.createQuery("select w from Workers w where w.isOnPage = 1");
		
		List<Workers> workersList = query.getResultList();
		
		return workersList;
	}

}

package test.mighty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.mighty.entity.Projects;

@Repository
public class ProjectsDAOImpl implements ProjectsDAOInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public Projects getProject(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Projects project = session.get(Projects.class, id);
		
		return project;
	}

	@Transactional
	@Override
	public List<Projects> getProjectList() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Projects> query = session.createQuery("from Projects", Projects.class);
		
		List<Projects> projectsList = query.getResultList();
		
		return projectsList;
	}

	@Transactional
	@Override
	public void saveProject(Projects project) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(project);

	}

	@Transactional
	@Override
	public void deleteProject(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Projects where id=:id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();
		
	}

	@Transactional
	@Override
	public List<Projects> getProjectsOnPage() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Projects> query = session.createQuery("select p from Projects p where p.isOnPage = 1");
		
		List<Projects> projectsList = query.getResultList();
		
		return projectsList;
	}

}

package test.mighty.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.mighty.entity.Blogs;

@Repository
public class BlogsDAOImpl implements BlogsDAOInterface {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public Blogs getBlog(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Blogs blog = session.get(Blogs.class, id);
		
		return blog;
	}

	@Transactional
	@Override
	public List<Blogs> getBlogsList() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Blogs> query = session.createQuery("from Blogs", Blogs.class);
		
		List<Blogs> blogsList = query.getResultList();
		
		return blogsList;
	}

	@Transactional
	@Override
	public void saveBlog(Blogs blog) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(blog);

	}

	@Transactional
	@Override
	public void deleteBlog(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Blogs where id=:id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();

	}

	@Transactional
	@Override
	public List<Blogs> getBlogsOnPage() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Blogs> queryBlog = session.createQuery("select b from Blogs b where b.isOnPage = 1");
		
		List<Blogs> blogsList = queryBlog.getResultList();
		
		return blogsList;
	}

}

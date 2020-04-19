package test.mighty.dao;

import java.util.List;

import test.mighty.entity.Blogs;

public interface BlogsDAOInterface {

	public Blogs getBlog(int id);
	
	public List<Blogs> getBlogsList();
	
	public void saveBlog(Blogs blog);
	
	public void deleteBlog(int id);
	
	public List<Blogs> getBlogsOnPage();
	
}

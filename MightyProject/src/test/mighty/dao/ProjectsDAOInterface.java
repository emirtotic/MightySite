package test.mighty.dao;

import java.util.List;

import test.mighty.entity.Projects;

public interface ProjectsDAOInterface {
	
	public Projects getProject(int id);
	
	public List<Projects> getProjectList();
	
	public void saveProject(Projects project);
	
	public void deleteProject(int id);
	
	public List<Projects> getProjectsOnPage();

}

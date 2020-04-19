package test.mighty.dao;

import java.util.List;

import test.mighty.entity.Workers;

public interface WorkersDAOInterface {

	public Workers getWorkers(int id);
	
	public List<Workers> getWorkersList();
	
	public void saveWorkers(Workers worker);
	
	public void deleteWorkers(int id);
	
	public List<Workers> getWorkersOnPage();
	
	
	
}

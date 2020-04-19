package test.mighty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Projects {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String image;
	@Column
	private boolean isOnPage;
	
	
	public Projects() {
		
	}

	public Projects(String image) {
		super();
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean getIsOnPage() {
		return isOnPage;
	}

	public void setIsOnPage(boolean isOnPage) {
		this.isOnPage = isOnPage;
	}
	

	@Override
	public String toString() {
		return "[" + id + "] " + image;
	}
	
	
}

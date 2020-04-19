package test.mighty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Workers {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String position;
	@Column
	private String message;
	@Column
	private String image;
	@Column
	private boolean isOnPage;

	public Workers() {
		
	}

	public Workers(String name, String position, String message, String image) {
		super();
		this.name = name;
		this.position = position;
		this.message = message;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
		return "Worker: " + name + " - " + position;
	}
	
	
	
	
}

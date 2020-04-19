package test.mighty.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blogs {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@Column
	private String text;
	@Column
	private String date;
	@Column
	private String author;
	@Column
	private String image;
	@Column
	private String externalLink;
	@Column
	private boolean isOnPage;
	
	
	public Blogs() {
		
	}

	public Blogs(String title, String text, String date, String author, String image, boolean isOnPage) {
		super();
		this.title = title;
		this.text = text;
		this.date = date;
		this.author = author;
		this.image = image;
		this.isOnPage = isOnPage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
	
	public String getExternalLink() {
		return externalLink;
	}

	public void setExternalLink(String externalLink) {
		this.externalLink = externalLink;
	}

	@Override
	public String toString() {
		return author + " - " + title;
	}
	
	
}

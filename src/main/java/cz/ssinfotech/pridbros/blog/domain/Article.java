package cz.ssinfotech.pridbros.blog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Article {
	@Id
	@GeneratedValue
	private Integer id;
	private String caption;
	private String body;
	@ManyToOne
	private Author autor;
	
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Author getAutor() {
		return autor;
	}
	public void setAutor(Author autor) {
		this.autor = autor;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", caption=" + caption + ", body=" + body + ", autor=" + autor + "]";
	}
}

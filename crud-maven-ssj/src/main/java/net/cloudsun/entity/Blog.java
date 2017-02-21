package net.cloudsun.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="blog")
@Entity
public class Blog {
	
	Integer id;
	String url;
	String title;	
	String describ;
	String keyWords;
	
	BlogUser createdUser;	
	Date createdTime;
	
	BlogUser modifiedUser;
	Date modifiedTime;
		
	public Blog() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length=100,nullable=false)
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Column(length=60,nullable=false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(length=1000,nullable=false)
	public String getDescrib() {
		return describ;
	}
	public void setDescrib(String describ) {
		this.describ = describ;
	}
	
	@Column(name="key_words",length=100,nullable=false)
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	
	@JoinColumn(name="created_user_id")
	@ManyToOne(targetEntity=BlogUser.class)
	public BlogUser getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(BlogUser createdUser) {
		this.createdUser = createdUser;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_time")
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	@JoinColumn(name="modified_user_id")
	@ManyToOne(targetEntity=BlogUser.class)
	public BlogUser getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(BlogUser modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="modified_time")
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", url=" + url + ", title=" + title
				+ ", describ=" + describ + ", keyWords=" + keyWords
				+ ", createdUser=" + createdUser + ", createdTime="
				+ createdTime + ", modifiedUser=" + modifiedUser
				+ ", modifiedTime=" + modifiedTime + "]";
	}
	
	

}

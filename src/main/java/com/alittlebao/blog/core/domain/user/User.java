package com.alittlebao.blog.core.domain.user;

import java.util.Date;

public class User {

	private int id;
	private String name;
	private String password;
	private String email;
	private String nicky;
	private String lifeQuote;
	private Date birthday;
	private String urlPhoto;
	private int status;
	private Date createTime;
	
	public User(){
		
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNicky() {
		return nicky;
	}

	public void setNicky(String nicky) {
		this.nicky = nicky;
	}

	public String getLifeQuote() {
		return lifeQuote;
	}

	public void setLifeQuote(String lifeQuote) {
		this.lifeQuote = lifeQuote;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getUrlPhoto() {
		return urlPhoto;
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

}
package com.codingmonk.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String name;
	private String source;
	private Float emmission;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Float getEmmission() {
		return emmission;
	}
	public void setEmmission(Float emmission) {
		this.emmission = emmission;
	}
	
	
	

}

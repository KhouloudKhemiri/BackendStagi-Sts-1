package com.example.demo.aplication;
import java.io.Serializable;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String FristName;
	private String LastName;
	private String mail;
	private String passeWord;
	private Date starteDate;
	private Boolean active;
	private int age;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFristName() {
		return FristName;
	}
	public void setFristName(String fristName) {
		FristName = fristName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPasseWord() {
		return passeWord;
	}
	public void setPasseWord(String passeWord) {
		this.passeWord = passeWord;
	}
	public Date getStarteDate() {
		return starteDate;
	}
	public void setStarteDate(Date starteDate) {
		this.starteDate = starteDate;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

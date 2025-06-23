package com.example.users.data1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="user_info")
public class Data {

     @Column(name="firstname") 
	 private String firstname;
     @Column(name="email")
	 private String email;
     @Column(name="phone")
	 private String phon;
     @Column(name="username")
     private String username;
	 public String getFirstname() {
		return firstname;
	}
	 public void setFirstname(String firstname) {
		 this.firstname = firstname;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 public String getPhon() {
		 return phon;
	 }
	 public void setPhon(String phon) {
		 this.phon = phon;
	 }
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
	 }
	 
	 
}

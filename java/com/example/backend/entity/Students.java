package com.example.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
@Id

private int rollno;
private String name;
private String email;
private int PhoneNO;
private String branch;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneNO() {
	return PhoneNO;
}
public void setPhoneNO(int phoneNO) {
	PhoneNO = phoneNO;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}

public Students() {
	super();
}
public Students(int rollno,String name,String email,int PhoneNO,String branch) {
	super();
	this.rollno=rollno;
	this.name=name;
	this.email=email;
	this.PhoneNO=PhoneNO;
	this.branch=branch;
}
}

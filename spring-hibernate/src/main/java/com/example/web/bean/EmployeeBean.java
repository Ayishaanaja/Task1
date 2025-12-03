package com.example.web.bean;

import jakarta.persistence.*;


@Entity
@Table(name="emp555")
public class EmployeeBean {
@Id
@GeneratedValue
@Column(name="id")
private int eid;
@Column(name="name",length=20)
private String ename;
@Column(name="salary")
private int esal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}

}

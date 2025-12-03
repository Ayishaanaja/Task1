package com.example.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="eb")//the program cannot understand its a bean if we dont give the annotation as component,similarily for dao we have to give @Repository and in services @Services and all for the understanding
@Scope(value="prototype")//if the value of scope is not given then by default it will be singleton means it will create one object and create refereces for this so if we set it to prototype then it will be 
public class EmployeeBean {
private int eid;
private String ename;
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

@Override
public String toString() {
	return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
}
}

package com.example.demo;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;



import com.example.demo.bean.EmployeeBean;

import com.example.demo.bean.ManagerBean;



public class Main

{

public static void main(String[] args) {

Configuration cfg=new Configuration().configure("hibernate.cfg.xml");

SessionFactory sf=cfg.buildSessionFactory();

EmployeeBean eb=new EmployeeBean();

eb.setName("Karthik");

eb.setSalary(88000);

ManagerBean mb=new ManagerBean();

eb.setManager(mb);

eb.getManager().setManagerName(eb.getName());

eb.getManager().setDepartmentName("Sales");

eb.getManager().setLocation("Trivandrum");

Session s=sf.openSession();

Transaction t=s.beginTransaction();

s.save(eb);

System.out.println("Session Stored successfully....");

t.commit();

}}









//package com.example.demo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.example.demo.bean.EmployeeBean;
//
//public class Main {
//public static void main(String[] args) {
//	Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
//	SessionFactory sf=cfg.buildSessionFactory();
//	EmployeeBean eb=new EmployeeBean();
//	eb.setId(102);
//	eb.setName("Aiswarya");
//	eb.setSalary(90000);
//	Session s=sf.openSession();
//	Transaction t=s.beginTransaction();
//	s.save(eb);
//	System.out.println("Session Stored successfullyyy..........");
//	t.commit();
//	
//	
//}
//}

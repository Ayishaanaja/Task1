package com.example.web.dao;
import com.example.web.controller.EmployeeController;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.web.bean.EmployeeBean;

@Repository
public class EmployeeDao {
@Autowired
private SessionFactory sessionFactory;
	
public int addEmployee(EmployeeBean eb) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(eb!=null) {
		s.persist(eb);						//to insert into the table
		t.commit();
		System.out.println("Session stored successfully.............");
		return 1;
	}
	else
		return 0;
}
public int updateEmployeee(EmployeeBean eb) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	if(eb!=null) {
		s.merge(eb);						//to update the table
		t.commit();
		System.out.println("Session updated successfully..............");
		return 1;
	}
	else 
		return 0;
}
public int deleteEmployee(int eid) {
	Session s=sessionFactory.openSession();
	Transaction t=s.beginTransaction();
	EmployeeBean eb = s.get(EmployeeBean.class, eid);
	if (eb != null) {
	    s.remove(eb); // If the employee exists, we delete it
	    t.commit();   // Commit the transaction
	    return 1;
	} 
	else 
	    return 0; // Return 0 if employee doesn't exist
}

public List<EmployeeBean> selectAllEmployee(){
	Session s=sessionFactory.openSession();
	List<EmployeeBean> all;
	Query q=s.createQuery("from EmployeeBean");
	all=q.list();
	return all;
}
}

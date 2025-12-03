package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.web.bean.EmployeeBean;
import com.example.web.dao.EmployeeDao;

@Service
public class EmployeeService {
@Autowired
private EmployeeDao edao;
@Transactional
public int addEmployee(EmployeeBean eb) {
	return edao.addEmployee(eb);
}
@Transactional
public int updateEmployee(EmployeeBean eb) {
	return edao.updateEmployeee(eb);
}
@Transactional
public int deleteEmployee(int eid) {
	return edao.deleteEmployee(eid);
}
public List<EmployeeBean> selectAllEmployee(){
	return edao.selectAllEmployee();
}
}

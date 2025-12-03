package com.example.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.EmployeeBean;
import com.example.dao.EmployeeDao;

@Service
public class EmployeeService {
@Autowired
private EmployeeDao edao;
public int addEmployee(EmployeeBean eb) {
	return edao.addEmployee(eb);
}
public int deleteEmployee(int id) {
	return edao.deleteEmployee(id);
}
public int updateEmployee(EmployeeBean eb) {
	return edao.updateEmployee(eb);
}
public ArrayList<EmployeeBean> selectAll(){
	return edao.selectAll();
}
public EmployeeBean selectById(int id){
	return edao.selectById(id);
}
}

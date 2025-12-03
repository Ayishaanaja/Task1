package com.example.demo.bean;



import javax.persistence.*;





@Entity

@Table(name="emp888")

public class EmployeeBean {

@Id

@GeneratedValue

private int id;

@Column

private String name;



@Column

private int salary;





@OneToOne(cascade = CascadeType.ALL)

@JoinColumn(name = "manager_managername")

private ManagerBean manager;



public ManagerBean getManager() {

return manager;

}

public void setManager(ManagerBean manager) {

this.manager = manager;

}

public int getId() {

return id;

}

public void setId(int id) {

this.id = id;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public int getSalary() {

return salary;

}

public void setSalary(int salary) {

this.salary = salary;

}



}











//package com.example.demo.bean;
//
//import javax.persistence.*;
//
//import org.hibernate.annotations.Cascade;
//import org.hibernate.annotations.CascadeType;
//
//@Entity
//@Table(name="emp888")
//public class EmployeeBean {
//@Id
//@GeneratedValue
//private int id;
//@Column
//@Cascade(CascadeType.ALL)
//@JoinColumn(referencedColumnName = "manager")
//private String name;
//@Column
//private int salary;
//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
//public String getName() {
//	return name;
//}
//public void setName(String name) {
//	this.name = name;
//}
//public int getSalary() {
//	return salary;
//}
//public void setSalary(int salary) {
//	this.salary = salary;
//}
//}

package com.example.demo.bean;



import javax.persistence.*;



@Entity

@Table(name="manager")

public class ManagerBean {

@Id

@GeneratedValue

private int managerId;



@Column

private String managerName;



@Column

private String departmentName;

@Column

private String location;

public int getManagerId() {

return managerId;

}

public void setManagerId(int managerId) {

this.managerId = managerId;

}

public String getManagerName() {

return managerName;

}

public void setManagerName(String managerName) {

this.managerName = managerName;

}

public String getDepartmentName() {

return departmentName;

}

public void setDepartmentName(String departmentName) {

this.departmentName = departmentName;

}

public String getLocation() {

return location;

}

public void setLocation(String location) {

this.location = location;

}



}
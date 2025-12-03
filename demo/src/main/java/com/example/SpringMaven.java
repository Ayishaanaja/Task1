package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bean.EmployeeBean;
import com.example.service.EmployeeService;

@SpringBootApplication
public class SpringMaven {

    private final EmployeeService employeeService;

    SpringMaven(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(SpringMaven.class, args);
	//EmployeeBean eb=ctx.getBean(EmployeeBean.class);
	EmployeeBean eb=(EmployeeBean)ctx.getBean("eb");
	EmployeeService eserv=(EmployeeService)ctx.getBean(EmployeeService.class);
	
//	eb.setEid(101);
//	eb.setEname("Ayisha");
//	eb.setEsal(100000);
//	System.out.println(eb);
//	
//	System.out.println(eserv.addEmployee(eb)+" record inserted successfully.....");
//	
//	eb.setEid(102);
//	eb.setEname("Aisha");
//	eb.setEsal(100000);
//	System.out.println(eb);
//	System.out.println(eserv.addEmployee(eb)+" record inserted successfully.....");
//	
//	int deleteid=101;
//	System.out.println(eserv.deleteEmployee(deleteid)+"record deleted successfullyy......");

//	eb.setEid(102);
//	eb.setEname("Aiswarya");
//	eb.setEsal(20000);
//	System.out.println(eserv.updateEmployee(eb)+"record updated successfullyyy");
	//	eb.setEid(101);

//	eb.setEname("Karthik");

//	eb.setEsal(55000);

//	System.out.println(eserv.updateEmployee(eb)+" record updated successfully...");

// ArrayList<EmployeeBean> all= eserv.selectAll();

//	for(EmployeeBean e:all)

//	{

// System.out.println(e.getEid()+" "+e.getEname()+" "+e.getEsal());

//	}

	

EmployeeBean e=eserv.selectById(102);

System.out.println(e);


	
	
//	System.out.println(eb.getEid()+" "+eb.getEname()+" "+eb.getEsal());
//	//the default value of the container is singleton so it creates one object and the created eb and eb2 is reference by default
//	EmployeeBean eb2=(EmployeeBean)ctx.getBean("eb");
//	System.out.println(eb2.getEid()+" "+eb2.getEname()+" "+eb2.getEsal());
//	//since assingned the scope of the bean to prototype it created 2 objects and shows null
}
}

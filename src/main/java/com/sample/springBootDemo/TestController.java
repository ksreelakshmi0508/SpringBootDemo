package com.sample.springBootDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.sample.model.Employee;

@RestController
public class TestController {
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public  Employee firstPage() {
		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(50000);
		
		return emp;
	}
	@RequestMapping("/hello")
	public String test() {
		return "Spring boot application is working";
	}

}

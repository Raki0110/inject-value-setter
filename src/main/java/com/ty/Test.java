package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new 
				ClassPathXmlApplicationContext("my_conf.xml");
		Student student=(Student) configurableApplicationContext.getBean("myStudent");
		System.out.println("Name is : "+student.getName());
		System.out.println("Age is : "+student.getAge());
		System.out.println("Height is : "+student.getHeight());
	}

}

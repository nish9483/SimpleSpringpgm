package com.chandhan.model;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Main {
	public static void main(String args[])
	{
		ApplicationContext c = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld h=(HelloWorld)c.getBean("hello");
		h.getMessage();
	}

}

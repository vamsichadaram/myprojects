package com.vamsi.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamsi.model.HelloWorld;

public class MainApp 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		System.out.println(obj.getMsg());
		context.stop();
	}
}

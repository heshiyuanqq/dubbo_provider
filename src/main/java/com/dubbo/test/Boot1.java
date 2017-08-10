package com.dubbo.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot1 {

	public static void main(String[] args) {
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_provider1.xml");
	        context.start();

			System.out.println("dubbo service1 begin to start");
	        try {
	            System.in.read();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}

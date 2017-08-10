package com.dubbo.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot {

	public static void main(String[] args) {
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_provider.xml");
	        context.start();

			System.out.println("dubbo service begin to start");
	        try {
	            System.in.read();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}

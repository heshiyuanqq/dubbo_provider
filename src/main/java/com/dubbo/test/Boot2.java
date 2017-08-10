package com.dubbo.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Boot2 {

	public static void main(String[] args) {
		 	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo_provider2.xml");
	        context.start();

			System.out.println("dubbo service2 begin to start");
	        try {
	            System.in.read();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	       new HashMap<K, V>()
	}
}

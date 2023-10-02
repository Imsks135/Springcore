package com.cgi.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cgi.assignment.model.Professor;
import com.cgi.assignment.model.Student;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student s1 = context.getBean(Student.class);
		System.out.println(s1);
		Professor p1 = context.getBean(Professor.class);
		System.out.println(p1);

	}
}

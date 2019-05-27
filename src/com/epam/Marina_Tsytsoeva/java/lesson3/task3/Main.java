package com.epam.Marina_Tsytsoeva.java.lesson3.task3;
/**
 * @author  Marina Tsytsoeva
 * Lesson3.task3
 */
public class Main {
	public static void main(String[]args) {
		Course course1=new Course("Технология java Servlets", 16);
		Course course2=new Course("Struts Framework", 24);
		Course course3=new Course("Обзор технологии Java", 8);
		Course course4=new Course("Библиотека JFC/Swing", 16);
		Course course5=new Course("Технология JDBC", 16);
		Programm programm1=new Programm ("J2EE Developer");
		programm1.courses[0]=course1;
		programm1.courses[1]=course2;
		Programm programm2=new Programm ("Java Developer");
		programm2.courses[0]=course3;
		programm2.courses[1]=course4;
		programm2.courses[2]=course5;
		Student student1=new Student("Verov Oleg",programm1, '20.05.2019');
		
		Student student2=new Student("Levin Lev");
		
	System.out.println("Hello Marina");

	
	}
	
	}
	
